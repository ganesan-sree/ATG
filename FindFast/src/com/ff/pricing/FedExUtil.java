package com.ff.pricing;

import java.math.BigDecimal;
import java.util.Calendar;

import org.apache.axis.types.NonNegativeInteger;

import com.fedex.rate.stub.Address;
import com.fedex.rate.stub.ClientDetail;
import com.fedex.rate.stub.Dimensions;
import com.fedex.rate.stub.DropoffType;
import com.fedex.rate.stub.FreightShipmentDetail;
import com.fedex.rate.stub.LinearUnits;
import com.fedex.rate.stub.Money;
import com.fedex.rate.stub.Notification;
import com.fedex.rate.stub.NotificationSeverityType;
import com.fedex.rate.stub.PackageRateDetail;
import com.fedex.rate.stub.PackageSpecialServicesRequested;
import com.fedex.rate.stub.PackagingType;
import com.fedex.rate.stub.Party;
import com.fedex.rate.stub.Payment;
import com.fedex.rate.stub.PaymentType;
import com.fedex.rate.stub.RatePortType;
import com.fedex.rate.stub.RateReply;
import com.fedex.rate.stub.RateReplyDetail;
import com.fedex.rate.stub.RateRequest;
import com.fedex.rate.stub.RateRequestType;
import com.fedex.rate.stub.RateServiceLocator;
import com.fedex.rate.stub.RatedPackageDetail;
import com.fedex.rate.stub.RatedShipmentDetail;
import com.fedex.rate.stub.RequestedPackageDetailType;
import com.fedex.rate.stub.RequestedPackageLineItem;
import com.fedex.rate.stub.RequestedShipment;
import com.fedex.rate.stub.ServiceType;
import com.fedex.rate.stub.ShipmentRateDetail;
import com.fedex.rate.stub.Surcharge;
import com.fedex.rate.stub.TransactionDetail;
import com.fedex.rate.stub.VersionId;
import com.fedex.rate.stub.WebAuthenticationCredential;
import com.fedex.rate.stub.WebAuthenticationDetail;
import com.fedex.rate.stub.Weight;
import com.fedex.rate.stub.WeightUnits;

import atg.commerce.order.ShippingGroup;
import atg.nucleus.GenericService;

public class FedExUtil extends GenericService{

	double amount;
	
	public double getAmount() {
		return amount;
	}
	
	private Notification[] notification;
	
	public Notification[] getNotification() {
		return notification;
	}

	public void setNotification(Notification[] notification) {
		this.notification = notification;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	private boolean error;

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public double getRate(ServiceType serviceType){
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
        	requestedShipment.setServiceType(serviceType);
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
			error = isResponseOk(reply.getHighestSeverity());
			if (isResponseOk(reply.getHighestSeverity())) {
				writeServiceOutput(reply);
			} 
			notification = reply.getNotifications();
			printNotifications(notification);

		} catch (Exception e) {
		    e.printStackTrace();
		} 
		return amount;
	}
	
	public void writeServiceOutput(RateReply reply) {
		RateReplyDetail[] rrds = reply.getRateReplyDetails();
		for (int i = 0; i < rrds.length; i++) {
			RateReplyDetail rrd = rrds[i];
		//	logDebug("\nService type "+ rrd.getServiceType());
		//	logDebug("Packaging type" + rrd.getPackagingType());
			RatedShipmentDetail[] rsds = rrd.getRatedShipmentDetails();
			for (int j = 0; j < rsds.length; j++) {
		//		logDebug("RatedShipmentDetail " + j);
				RatedShipmentDetail rsd = rsds[j];
				ShipmentRateDetail srd = rsd.getShipmentRateDetail();
		//		logDebug("  Rate type"+ srd.getRateType());
		//		printWeight("  Total Billing weight", srd.getTotalBillingWeight());
		//		printMoney("  Total surcharges", srd.getTotalSurcharges());
		//		printMoney("  Total net charge", srd.getTotalNetCharge());
				amount = srd.getTotalNetCharge().getAmount().doubleValue();
				RatedPackageDetail[] rpds = rsd.getRatedPackages();
				if (rpds != null && rpds.length > 0) {
				//	logDebug("  RatedPackageDetails", "");
					for (int k = 0; k < rpds.length; k++) {
				//		logDebug("  RatedPackageDetail " + i, "");
						RatedPackageDetail rpd = rpds[k];
						PackageRateDetail prd = rpd.getPackageRateDetail();
						if (prd != null) {
				//			printWeight("    Billing weight", prd.getBillingWeight());
				//			printMoney("    Base charge", prd.getBaseCharge());
							Surcharge[] surcharges = prd.getSurcharges();
							if (surcharges != null && surcharges.length > 0) {
								for (int m = 0; m < surcharges.length; m++) {
									Surcharge surcharge = surcharges[m];
					//				printMoney("    " + surcharge.getDescription() + " surcharge", surcharge.getAmount());
								}
							}
						}
					}
				}
			}
			System.out.println("");
		}
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
		if (notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
			return true;
		}
 		return false;
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
	
	private static void updateEndPoint(RateServiceLocator serviceLocator) {
		String endPoint = System.getProperty("endPoint");
		if (endPoint != null) {
			serviceLocator.setRateServicePortEndpointAddress(endPoint);
		}
	}
}
