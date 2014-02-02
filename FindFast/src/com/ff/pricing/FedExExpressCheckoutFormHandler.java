package com.ff.pricing;

import java.io.IOException;

import javax.servlet.ServletException;

import com.fedex.rate.stub.Notification;
import com.fedex.rate.stub.NotificationSeverityType;
import com.fedex.rate.stub.ServiceType;

import atg.commerce.order.Order;
import atg.commerce.order.ShippingGroup;
import atg.commerce.order.purchase.ExpressCheckoutFormHandler;
import atg.commerce.pricing.FixedPriceShippingCalculator;
import atg.droplet.DropletException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.ServletUtil;

public class FedExExpressCheckoutFormHandler extends ExpressCheckoutFormHandler {
	
	
		
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
			public boolean handleExpressCheckout(DynamoHttpServletRequest pRequest,DynamoHttpServletResponse pResponse)throws ServletException,IOException{
			ShippingGroup sGroup = getShippingGroup();
			if(sGroup!=null){
				
				
				String sMethod = sGroup.getShippingMethod();
				
				if(sMethod!=null){
					FedExShippingCalculator calculator = (FedExShippingCalculator)ServletUtil.getCurrentRequest().resolveName("/atg/commerce/pricing/shipping/"+sGroup.getShippingMethod());
					double fedExAmount = getFedExUtil().getRate(ServiceType.fromString(calculator.getFedExShippingMethod()));
					if(fedExAmount>0 && getFedExUtil().isError()){
						logDebug("Setting fedExAmount "+fedExAmount);
						calculator.setAmount(fedExAmount);
						error=false;
					}
					else{
						Notification[] notification=getFedExUtil().getNotification();
						addException(notification);
						
						error=true;
					}
					logDebug("got the calculator "+calculator);
				
				
			
					
					
			
			}
			}
		if(!error)
		return super.handleExpressCheckout(pRequest, pResponse);
		
		return checkFormRedirect(getExpressCheckoutSuccessURL(), getExpressCheckoutErrorURL(), pRequest, pResponse);
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
					addFormException(new DropletException(errorMessage, "Error in shipping method"));
					logDebug("Got error "+errorMessage);
					
				}
			}
}
