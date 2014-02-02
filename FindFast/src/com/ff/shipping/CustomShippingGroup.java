package com.ff.shipping;

import atg.commerce.order.ShippingGroupImpl;

public class CustomShippingGroup extends ShippingGroupImpl implements CustomShippingGroupInt{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMobileNumber() {
		// TODO Auto-generated method stub
		return (String) getPropertyValue("mobileNumber");
	}

	public void setMobileNumber(String mobileNumber) {
		// TODO Auto-generated method stub
		setPropertyValue("mobileNumber", mobileNumber);
	};
	
	
}
