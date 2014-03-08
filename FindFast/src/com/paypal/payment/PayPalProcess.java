package com.paypal.payment;

import com.paypal.PaypalInfo;

import atg.payment.PaymentStatus;



public interface PayPalProcess {
	public PaypalStatus authorize(PaypalInfo info);
	
	public PaypalStatus credit(PaypalInfo info,PaymentStatus paymentStatus);
	
	public PaypalStatus debit(PaypalInfo info,PaymentStatus paymentStatus);
}
