package com.fedex.rate.stub;


import java.math.BigDecimal;
import java.util.Calendar;
import org.apache.axis.types.NonNegativeInteger;
import com.fedex.rate.stub.*;


/** 
 * Sample code to call Rate Web Service with Axis 
 * <p>
 * com.fedex.rate.stub is generated via WSDL2Java, like this:<br>
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.rate.stub http://www.fedex.com/...../RateService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
public class RateWebServiceClient {  
	//
	public static void main(String[] args) {   
		// Build a RateRequest request object
		boolean getAllRatesFlag = false; // set to true to get the rates for different service types
	    RateRequest request = new RateRequest();
	    request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        
	    //
	    TransactionDetail transactionDetail = new TransactionDetail();
	    transactionDetail.setCustomerTransactionId("java sample - Rate Request"); // The client will get the same value back in the response
	    request.setTransactionDetail(transactionDetail);

        //
        VersionId versionId = new VersionId("crs", 9, 0, 0);
        request.setVersion(versionId);
        
        //
        RequestedShipment requestedShipment = new RequestedShipment();
        
        requestedShipment.setShipTimestamp(Calendar.getInstance());
        requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP);
        if (! getAllRatesFlag) {
        	requestedShipment.setServiceType(ServiceType.FEDEX_GROUND);
        	requestedShipment.setPackagingType(PackagingType.YOUR_PACKAGING);
        }
        
        
        Party shipper = new Party();
	    Address shipperAddress = new Address(); // Origin information
	    shipperAddress.setStreetLines(new String[] {"6233 Winchester Rd"});
	    shipperAddress.setCity("Memphis");
	    shipperAddress.setStateOrProvinceCode("TN");
	    shipperAddress.setPostalCode("38115");
	    shipperAddress.setCountryCode("US");
        shipper.setAddress(shipperAddress);
        requestedShipment.setShipper(shipper);

	    //
        Party recipient = new Party();
	    Address recipientAddress = new Address(); // Destination information
	    recipientAddress.setStreetLines(new String[] {"8001 Pauline Vanier"});
	    recipientAddress.setCity("Anjou");
	    recipientAddress.setStateOrProvinceCode("PQ");
	    recipientAddress.setPostalCode("H1J2V8");
	    recipientAddress.setCountryCode("CA");
	    recipient.setAddress(recipientAddress);
	    requestedShipment.setRecipient(recipient);

	    //
	    Payment shippingChargesPayment = new Payment();
	    shippingChargesPayment.setPaymentType(PaymentType.SENDER);
	    requestedShipment.setShippingChargesPayment(shippingChargesPayment);

	    RequestedPackageLineItem rp = new RequestedPackageLineItem();
	    rp.setWeight(new Weight(WeightUnits.LB, new BigDecimal(15.0)));
	    //
	    rp.setInsuredValue(new Money("USD", new BigDecimal("100.00")));
	    //
	    rp.setDimensions(new Dimensions(new NonNegativeInteger("1"), new NonNegativeInteger("1"), new NonNegativeInteger("1"), LinearUnits.IN));
	    PackageSpecialServicesRequested pssr = new PackageSpecialServicesRequested();
	    rp.setSpecialServicesRequested(pssr);
	    requestedShipment.setRequestedPackageLineItems(new RequestedPackageLineItem[] {rp});

	    
	    requestedShipment.setPackageCount(new NonNegativeInteger("1"));
	    requestedShipment.setRateRequestTypes(new RateRequestType[] {RateRequestType.ACCOUNT});
	    requestedShipment.setPackageDetail(RequestedPackageDetailType.INDIVIDUAL_PACKAGES);
	    request.setRequestedShipment(requestedShipment);
	    
	    //
		try {
			// Initialize the service
			RateServiceLocator service;
			RatePortType port;
			//
			service = new RateServiceLocator();
			updateEndPoint(service);
			port = service.getRateServicePort();
			// This is the call to the web service passing in a RateRequest and returning a RateReply
			RateReply reply = port.getRates(request); // Service call
			if (isResponseOk(reply.getHighestSeverity())) {
				writeServiceOutput(reply);
			} 
			printNotifications(reply.getNotifications());

		} catch (Exception e) {
		    e.printStackTrace();
		} 
	}
	
	public static void writeServiceOutput(RateReply reply) {
		RateReplyDetail[] rrds = reply.getRateReplyDetails();
		for (int i = 0; i < rrds.length; i++) {
			RateReplyDetail rrd = rrds[i];
			print("\nService type", rrd.getServiceType());
			print("Packaging type", rrd.getPackagingType());
			RatedShipmentDetail[] rsds = rrd.getRatedShipmentDetails();
			for (int j = 0; j < rsds.length; j++) {
				print("RatedShipmentDetail " + j, "");
				RatedShipmentDetail rsd = rsds[j];
				ShipmentRateDetail srd = rsd.getShipmentRateDetail();
				print("  Rate type", srd.getRateType());
				printWeight("  Total Billing weight", srd.getTotalBillingWeight());
				printMoney("  Total surcharges", srd.getTotalSurcharges());
				printMoney("  Total net charge", srd.getTotalNetCharge());

				RatedPackageDetail[] rpds = rsd.getRatedPackages();
				if (rpds != null && rpds.length > 0) {
					print("  RatedPackageDetails", "");
					for (int k = 0; k < rpds.length; k++) {
						print("  RatedPackageDetail " + i, "");
						RatedPackageDetail rpd = rpds[k];
						PackageRateDetail prd = rpd.getPackageRateDetail();
						if (prd != null) {
							printWeight("    Billing weight", prd.getBillingWeight());
							printMoney("    Base charge", prd.getBaseCharge());
							Surcharge[] surcharges = prd.getSurcharges();
							if (surcharges != null && surcharges.length > 0) {
								for (int m = 0; m < surcharges.length; m++) {
									Surcharge surcharge = surcharges[m];
									printMoney("    " + surcharge.getDescription() + " surcharge", surcharge.getAmount());
								}
							}
						}
					}
				}
			}
			System.out.println("");
		}
	}
	
	private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
        String accountNumber = System.getProperty("accountNumber");
        String meterNumber = System.getProperty("meterNumber");
        
        //
        // See if the accountNumber and meterNumber properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (accountNumber == null) {
        	accountNumber = "510087186"; // Replace "XXX" with clients account number
        }
        if (meterNumber == null) {
        	meterNumber = "118538138"; // Replace "XXX" with clients meter number
        }
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
	}
	
	private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential wac = new WebAuthenticationCredential();
        String key = System.getProperty("key");
        String password = System.getProperty("password");
        
        //
        // See if the key and password properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (key == null) {
        	key = "AjG783HBBkkVie0e"; // Replace "XXX" with clients key
        }
        if (password == null) {
        	password = "jZF74vyl5zAHDl5LHOYvzmCZE"; // Replace "XXX" with clients password
        }
        wac.setKey(key);
        wac.setPassword(password);
		return new WebAuthenticationDetail(wac);
	}
	
	private static void printNotifications(Notification[] notifications) {
		System.out.println("Notifications:");
		if (notifications == null || notifications.length == 0) {
			System.out.println("  No notifications returned");
		}
		for (int i=0; i < notifications.length; i++){
			Notification n = notifications[i];
			System.out.print("  Notification no. " + i + ": ");
			if (n == null) {
				System.out.println("null");
				continue;
			} else {
				System.out.println("");
			}
			NotificationSeverityType nst = n.getSeverity();

			System.out.println("    Severity: " + (nst == null ? "null" : nst.getValue()));
			System.out.println("    Code: " + n.getCode());
			System.out.println("    Message: " + n.getMessage());
			System.out.println("    Source: " + n.getSource());
		}
	}
	
	private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
		if (notificationSeverityType == null) {
			return false;
		}
		if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
			notificationSeverityType.equals(NotificationSeverityType.NOTE)    ||
			notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
			return true;
		}
 		return false;
	}
	
	private static void print(String msg, Object obj) {
		if (msg == null || obj == null) {
			return;
		}
		System.out.println(msg + ": " + obj.toString());
	}
	
	private static void printMoney(String msg, Money money) {
		if (msg == null || money == null) {
			return;
		}
		System.out.println(msg + ": " + money.getAmount() + " " + money.getCurrency());
	}
	
	private static void printWeight(String msg, Weight weight) {
		if (msg == null || weight == null) {
			return;
		}
		System.out.println(msg + ": " + weight.getValue() + " " + weight.getUnits());
	}

	private static void updateEndPoint(RateServiceLocator serviceLocator) {
		String endPoint = System.getProperty("endPoint");
		if (endPoint != null) {
			serviceLocator.setRateServicePortEndpointAddress(endPoint);
		}
	}

}
