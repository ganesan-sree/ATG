package com.paypal.payment;

import com.paypal.PaypalInfo;

import atg.commerce.CommerceException;
import atg.commerce.order.Order;
import atg.commerce.order.OrderTools;
import atg.commerce.order.PaymentGroupImpl;
import atg.commerce.order.RepositoryAddress;
import atg.commerce.order.RepositoryContactInfo;
import atg.core.util.Address;

public class Paypal extends PaymentGroupImpl implements PaypalInfo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Address billingAddress;
	
	private Order order;
	
	private double amount;
	
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

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address pBillingAddress) {
		  if((pBillingAddress instanceof RepositoryContactInfo) || (pBillingAddress instanceof RepositoryAddress) || pBillingAddress == null)
	        {
	            if(billingAddress != null)
	                billingAddress.deleteObservers();
	            billingAddress = pBillingAddress;
	            billingAddress.addObserver(this);
	        } else
	        {
	            try
	            {
	                if(billingAddress == null)
	                    billingAddress = (Address)pBillingAddress.getClass().newInstance();
	                OrderTools.copyAddress(pBillingAddress, billingAddress);
	            }
	            catch(InstantiationException ie)
	            {
	                throw new RuntimeException(ie.getMessage());
	            }
	            catch(IllegalAccessException iae)
	            {
	                throw new RuntimeException(iae.getMessage());
	            }
	            catch(CommerceException e)
	            {
	                throw new RuntimeException(e.getMessage());
	            }
	        }
	        setSaveAllProperties(true);
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
	public Paypal(){
		billingAddress=null;
	}
}
