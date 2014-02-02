package com.ff.pricing;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import atg.commerce.order.CommerceItem;
import atg.commerce.order.Order;
import atg.commerce.pricing.ItemPriceCalculator;
import atg.commerce.pricing.ItemPriceInfo;
import atg.commerce.pricing.ItemPricingCalculator;
import atg.commerce.pricing.PricingException;
import atg.repository.RepositoryItem;

public class CustomPriceCalculator extends ItemPriceCalculator {

	
	public void priceEachItem(List arg0, List arg1, RepositoryItem arg2,
			Locale arg3, RepositoryItem arg4, Map arg5) throws PricingException {
		// TODO Auto-generated method stub
		
	}

	
	public void priceItem(ItemPriceInfo arg0, CommerceItem arg1,
			RepositoryItem arg2, Locale arg3, RepositoryItem arg4, Map arg5)
			throws PricingException {
		// TODO Auto-generated method stub
		
		System.out.println("am in my custom calculator");
	}

	
	public void priceItems(List arg0, List arg1, RepositoryItem arg2,
			Locale arg3, RepositoryItem arg4, Order arg5, Map arg6)
			throws PricingException {
		// TODO Auto-generated method stub
		
	}


	
	protected void priceItem(double d, ItemPriceInfo itempriceinfo,
			CommerceItem commerceitem, RepositoryItem repositoryitem,
			Locale locale, RepositoryItem repositoryitem1, Map map)
			throws PricingException {
		// TODO Auto-generated method stub
		System.out.println("am here");
	}

}
