package com.ff.pricing;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.fedex.rate.stub.Notification;
import com.fedex.rate.stub.NotificationSeverityType;
import com.fedex.rate.stub.ServiceType;

import atg.commerce.order.Order;
import atg.commerce.order.ShippingGroup;
import atg.commerce.order.purchase.ExpressCheckoutFormHandler;
import atg.commerce.pricing.FixedPriceShippingCalculator;
import atg.commerce.pricing.PricingException;
import atg.commerce.pricing.ShippingPriceInfo;
import atg.commerce.pricing.ShippingPricingCalculator;
import atg.droplet.DropletException;
import atg.repository.RepositoryItem;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.ServletUtil;

public class FedExShippingCalculator extends FixedPriceShippingCalculator{

	private String fedExShippingMethod;
	private FedExUtil fedExUtil;
	

	private boolean error;
	
	private String errorMessage;
	
	public boolean isError() {
		return error;
	}


	public void setError(boolean error) {
		this.error = error;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public FedExUtil getFedExUtil() {
		return fedExUtil;
	}


	public void setFedExUtil(FedExUtil fedExUtil) {
		this.fedExUtil = fedExUtil;
	}


	public String getFedExShippingMethod() {
		return fedExShippingMethod;
	}


	public void setFedExShippingMethod(String fedExShippingMethod) {
		this.fedExShippingMethod = fedExShippingMethod;
	}

	


	public void getAvailableMethods(List list, ShippingGroup shippinggroup,
			RepositoryItem repositoryitem, Locale locale,
			RepositoryItem repositoryitem1, Map map) throws PricingException {
		// TODO Auto-generated method stub
		super.getAvailableMethods(list, shippinggroup, repositoryitem, locale, repositoryitem1, map);
	}

	
	public void priceShippingGroup(Order order,
			ShippingPriceInfo shippingpriceinfo, ShippingGroup shippinggroup,
			RepositoryItem repositoryitem, Locale locale,
			RepositoryItem repositoryitem1, Map map) throws PricingException {
		// TODO Auto-generated method stub
		
		//FedExShippingCalculator calculator = (FedExShippingCalculator)ServletUtil.getCurrentRequest().resolveName("/atg/commerce/pricing/shipping/"+sGroup.getShippingMethod());
		double fedExAmount = getFedExUtil().getRate(ServiceType.fromString(getFedExShippingMethod()));
		if(fedExAmount>0 && getFedExUtil().isError()){
			logDebug("Setting fedExAmount "+fedExAmount);
			setAmount(fedExAmount);
		
			error=false;
		}
		else{
			Notification[] notification=getFedExUtil().getNotification();
			addException(notification);
		
			error=true;
		}
		
			super.priceShippingGroup(order,shippingpriceinfo,shippinggroup,repositoryitem,locale,repositoryitem1, map);
		
	}
	public void addException(Notification[] notifications){
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
			
			errorMessage="    Severity: " + (nst == null ? "null" : nst.getValue());
			errorMessage+="\n    Code: " + n.getCode();
			errorMessage+="\n    Message: " + n.getMessage();
			errorMessage+="\n    Source: " + n.getSource()+"\n\n";
			//getHolder().setErrorMessage(errorMessage);
			logDebug("Got error "+errorMessage);
			
		}
	}
	
	

	

}
