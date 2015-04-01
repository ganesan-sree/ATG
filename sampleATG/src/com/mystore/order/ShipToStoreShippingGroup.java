package com.mystore.order;

import atg.commerce.order.HardgoodShippingGroup;
import atg.repository.RepositoryItem;

public class ShipToStoreShippingGroup extends HardgoodShippingGroup {
	
	private int store;

	
	public Object getPropertyValue() {
		return super.getPropertyValue("store");
	}

	
	public void setPropertyValue(Object pPropertyValue) {	
		super.setPropertyValue("store", pPropertyValue);
	}
	
	
	
		
		
		

}
