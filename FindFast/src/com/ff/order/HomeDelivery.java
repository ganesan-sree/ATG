package com.ff.order;

import com.ff.payment.HomeDeliveryInfo;

import atg.commerce.CommerceException;
import atg.commerce.order.Order;
import atg.commerce.order.OrderTools;
import atg.commerce.order.PaymentGroupImpl;
import atg.commerce.order.RepositoryAddress;
import atg.commerce.order.RepositoryContactInfo;
import atg.core.util.Address;

public class HomeDelivery extends PaymentGroupImpl implements HomeDeliveryInfo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public HomeDelivery(){
		billingAddress = null;
	}
	
	private Address billingAddress;
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

	
	public Address getBillingAddress() {
		// TODO Auto-generated method stub
		return billingAddress;
	}

	
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
