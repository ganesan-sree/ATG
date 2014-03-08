package com.ff.payment;

import atg.commerce.order.Order;
import atg.core.util.Address;




public class HomeDeliveryProcess implements HomeDeliveryInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double amount;
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean delivered;

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	
	public Address getBillingAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	private Order order;
	
	public void setOrder(Order order){
		this.order=order;
	}
}
