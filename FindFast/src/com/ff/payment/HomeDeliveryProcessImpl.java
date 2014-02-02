package com.ff.payment;

import atg.nucleus.GenericService;
import atg.payment.PaymentStatus;

public class HomeDeliveryProcessImpl extends GenericService implements HomeDeliveryProcessInt{

	
	public HomeDeliveryStatus authorize(HomeDeliveryInfo homeDeliveryInfo) {
		// TODO Auto-generated method stub
		String transactionId = "0000000";
		
		return new HomeDeliveryStatusImpl(transactionId,homeDeliveryInfo.getAmount(),true,"",new java.util.Date(),false);
		
	}

	
	public HomeDeliveryStatus credit(HomeDeliveryInfo homeDeliveryInfo,
			PaymentStatus paymentStatus) {
		// TODO Auto-generated method stub
		return new HomeDeliveryStatusImpl(paymentStatus.getTransactionId(),homeDeliveryInfo.getAmount(),true,"",new java.util.Date(),false);
	}

	
	public HomeDeliveryStatus debit(HomeDeliveryInfo homeDeliveryInfo,
			PaymentStatus paymentStatus) {
		// TODO Auto-generated method stub
		return new HomeDeliveryStatusImpl(paymentStatus.getTransactionId(),homeDeliveryInfo.getAmount(),true,"",new java.util.Date(),false);
	}

}
