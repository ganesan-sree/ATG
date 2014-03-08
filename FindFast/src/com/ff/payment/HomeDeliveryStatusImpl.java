package com.ff.payment;

import java.util.Date;

import atg.payment.PaymentStatusImpl;

public class HomeDeliveryStatusImpl extends PaymentStatusImpl implements
		HomeDeliveryStatus {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean delivered;

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	
	public boolean isDelivered() {
		// TODO Auto-generated method stub
		return false;
	}

	public HomeDeliveryStatusImpl() {
		super();
	}

	public HomeDeliveryStatusImpl(String pTransactionId, double pAmount,
			boolean pTransactionSuccess, String pErrorMessage,
			Date pTransactionTimestamp, boolean delivered) {
		super(pTransactionId, pAmount, pTransactionSuccess, pErrorMessage,
				pTransactionTimestamp);
		this.delivered = delivered;
	}

}
