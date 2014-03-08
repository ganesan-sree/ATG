package com.paypal.payment;

import atg.payment.PaymentStatus;

public interface PaypalStatus extends PaymentStatus{
	public String getPayPalMessage();
}
