package com.mystore.pricing;

import java.util.Locale;
import java.util.Map;
import atg.commerce.order.Order;
import atg.commerce.pricing.OrderPriceInfo;
import atg.commerce.pricing.OrderPricingCalculator;
import atg.commerce.pricing.PricingException;
import atg.nucleus.GenericService;
import atg.repository.RepositoryItem;

public class MyStoreOrderInitialPointCalculator extends GenericService
		implements OrderPricingCalculator {

	@Override
	public void priceOrder(OrderPriceInfo paramOrderPriceInfo,
			Order paramOrder, RepositoryItem paramRepositoryItem1,
			Locale paramLocale, RepositoryItem paramRepositoryItem2,
			Map paramMap) throws PricingException {
		Order lCvsOrder = paramOrder;
		int lPoints = (int) paramOrderPriceInfo.getTotal();
		MyStoreOrderPriceInfo myStoreOrderPriceInfo = (MyStoreOrderPriceInfo) paramOrderPriceInfo;
		myStoreOrderPriceInfo.setPoints(lPoints);

	}

}
