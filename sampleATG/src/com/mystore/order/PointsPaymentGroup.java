package com.mystore.order;

import atg.commerce.order.PaymentGroupImpl;
import atg.repository.RepositoryItem;

public class PointsPaymentGroup extends PaymentGroupImpl{

	
	private RepositoryItem pointsItem;

	public RepositoryItem getPointsItem() {
		return pointsItem;
	}

	public void setPointsItem(RepositoryItem pointsItem) {
		this.pointsItem = pointsItem;
	}
	
	
	
}
