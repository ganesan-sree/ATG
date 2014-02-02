package com.paypal.payment;

import com.ff.order.HomeDelivery;

import atg.commerce.CommerceException;
import atg.commerce.order.PaymentGroupManager;
import atg.commerce.order.purchase.PaymentGroupMapContainer;
import atg.nucleus.GenericService;

public class PaypalInitializer extends GenericService {
	public PaymentGroupMapContainer getContainer() {
		return container;
	}

	public void setContainer(PaymentGroupMapContainer container) {
		this.container = container;
	}
	private String paymentGroupName;
	public String getPaymentGroupName() {
		return paymentGroupName;
	}

	public void setPaymentGroupName(String paymentGroupName) {
		this.paymentGroupName = paymentGroupName;
	}
	private PaymentGroupMapContainer container;
	
	private Paypal paypal;
	
	private PaymentGroupManager paymentGroupManager;

	public PaymentGroupManager getPaymentGroupManager() {
		return paymentGroupManager;
	}

	public void setPaymentGroupManager(PaymentGroupManager paymentGroupManager) {
		this.paymentGroupManager = paymentGroupManager;
	}

	public Paypal getPaypal() {
		return paypal;
	}

	public void setPaypal(Paypal paypal) {
		this.paypal = paypal;
	}
	
	public Paypal createPaypal(){
		
			try {
				paypal = (Paypal)getPaymentGroupManager().createPaymentGroup(getPaymentGroupName());
			} catch (CommerceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return paypal;
	}
	public Paypal addPaymentGroup(String key,String payerId){
		Paypal paypal=createPaypal();
		if(paypal!=null){
			paypal.setToken(key);
			paypal.setPayerId(payerId);
		}
		getContainer().addPaymentGroup(key, paypal);
		return paypal;
		
	}
}
