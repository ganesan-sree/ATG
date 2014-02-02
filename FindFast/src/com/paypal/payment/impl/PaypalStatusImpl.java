package com.paypal.payment.impl;

import java.util.Date;

import com.paypal.payment.PaypalStatus;

import atg.payment.PaymentStatusImpl;

public class PaypalStatusImpl extends PaymentStatusImpl implements PaypalStatus{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String payPalMessage;
	
	public void setPayPalMessage(String payPalMessage) {
		this.payPalMessage = payPalMessage;
	}
	public String getPayPalMessage() {
		// TODO Auto-generated method stub
		return payPalMessage;
	}
	public PaypalStatusImpl(){
		super();
	}
	
	public PaypalStatusImpl(String pTransactionId, double pAmount,
			boolean pTransactionSuccess, String pErrorMessage,
			Date pTransactionTimestamp, String payPalMessage) {
		super(pTransactionId, pAmount, pTransactionSuccess, pErrorMessage,
				pTransactionTimestamp);
		this.payPalMessage = payPalMessage;
	}

}
