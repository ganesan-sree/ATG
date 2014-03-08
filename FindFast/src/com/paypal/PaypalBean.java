package com.paypal;

import atg.commerce.order.Order;
import atg.core.util.Address;

public class PaypalBean implements PaypalInfo{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Order order;
	
	private double amount;
	
	private Address billingAddress;
	
	private String payPalMessage;
	
	private String token;
	
	private String payerId;

	public String getPayerId() {
		return payerId;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPayPalMessage() {
		return payPalMessage;
	}

	public void setPayPalMessage(String payPalMessage) {
		this.payPalMessage = payPalMessage;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	
}
