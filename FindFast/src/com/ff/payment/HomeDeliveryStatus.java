package com.ff.payment;

import atg.payment.PaymentStatus;

public interface HomeDeliveryStatus extends PaymentStatus {
	public boolean isDelivered();
}
