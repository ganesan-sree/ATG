package com.mystore.order;

import atg.commerce.order.PaymentGroupImpl;

public class PointsPaymentGroup extends PaymentGroupImpl{

	
	private int pointsItem;

	public int getPointsItem()
		{
			return (Integer) getPropertyValue("pointsItem");
		}

	public void setPointsItem(int pPointsItem)
		{
			setPropertyValue("pointsItem",pPointsItem);
		}

	
	
	
	
}
