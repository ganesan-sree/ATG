package com.paypal;

import java.io.Serializable;

import atg.commerce.order.Order;
import atg.core.util.Address;

public interface PaypalInfo extends Serializable{
	
	public Address getBillingAddress();
	
	public Order getOrder();
	
	public double getAmount();
	
	public String getPayPalMessage();
	
	public String getToken();
	
	public String getPayerId();

}
