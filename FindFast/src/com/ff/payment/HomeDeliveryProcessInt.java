package com.ff.payment;

import atg.payment.PaymentStatus;

public interface HomeDeliveryProcessInt {

	public HomeDeliveryStatus authorize(HomeDeliveryInfo homeDeliveryInfo);
	
	public HomeDeliveryStatus credit(HomeDeliveryInfo homeDeliveryInfo,PaymentStatus paymentStatus);
	
	public HomeDeliveryStatus debit(HomeDeliveryInfo homeDeliveryInfo,PaymentStatus paymentStatus);
	
}
