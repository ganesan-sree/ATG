package com.ff.payment;

import java.io.Serializable;

import atg.commerce.order.Order;
import atg.core.util.Address;

public interface HomeDeliveryInfo extends Serializable{

	public Address getBillingAddress();
	
	public double getAmount();
	
	public Order getOrder();
	
}
