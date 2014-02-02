package com.n.order;

public class OrderImpl extends atg.commerce.order.OrderImpl implements Order{
	
	

	public String getCouponAdded() {
		// TODO Auto-generated method stub
		return (String)getPropertyValue("couponAdded");
	}

	public void setCouponAdded(String couponAdded) {
		// TODO Auto-generated method stub
		setPropertyValue("couponAdded",couponAdded);
	}

}
