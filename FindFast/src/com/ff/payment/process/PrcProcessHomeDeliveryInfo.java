package com.ff.payment.process;

import com.ff.payment.HomeDeliveryProcess;
import com.ff.payment.HomeDeliveryProcessInt;
import com.ff.payment.HomeDeliveryStatus;

import atg.commerce.CommerceException;
import atg.commerce.order.PaymentGroup;
import atg.commerce.payment.PaymentException;
import atg.commerce.payment.PaymentManagerPipelineArgs;
import atg.commerce.payment.processor.ProcProcessPaymentGroup;
import atg.payment.PaymentStatus;

public class PrcProcessHomeDeliveryInfo extends ProcProcessPaymentGroup{

	
	private HomeDeliveryProcessInt process;
	public HomeDeliveryProcessInt getProcess() {
		return process;
	}

	public void setProcess(HomeDeliveryProcessInt process) {
		this.process = process;
	}

	@Override
	public PaymentStatus authorizePaymentGroup(PaymentManagerPipelineArgs pParams)
			throws CommerceException {
		// TODO Auto-generated method stub
		 HomeDeliveryProcess homeDeliveryInfo = (HomeDeliveryProcess)pParams.getPaymentInfo();
		    PaymentGroup paymentGroup = pParams.getPaymentGroup();
	//	    PaymentStatus authStatus = pParams.getPaymentManager().getLastAuthorizationStatus (paymentGroup);
		    
		    try {
		      return getProcess().authorize (homeDeliveryInfo);
		    }
		    catch (ClassCastException cce) {
		      throw new PaymentException(atg.commerce.payment.Constants.INVALID_AUTH_STATUS);
		    }
	}

	@Override
	public PaymentStatus creditPaymentGroup(PaymentManagerPipelineArgs pParams)
			throws CommerceException {
		 HomeDeliveryProcess homeDeliveryInfo = (HomeDeliveryProcess)pParams.getPaymentInfo();
		    PaymentGroup paymentGroup = pParams.getPaymentGroup();
		    PaymentStatus authStatus = pParams.getPaymentManager().getLastAuthorizationStatus (paymentGroup);
		    
		    try {
		      return getProcess().credit (homeDeliveryInfo, (HomeDeliveryStatus) authStatus);
		    }
		    catch (ClassCastException cce) {
		      throw new PaymentException(atg.commerce.payment.Constants.INVALID_AUTH_STATUS);
		    }
	}

	@Override
	public PaymentStatus debitPaymentGroup(PaymentManagerPipelineArgs pParams)
			throws CommerceException {
		// TODO Auto-generated method stub
		 HomeDeliveryProcess homeDeliveryInfo = (HomeDeliveryProcess)pParams.getPaymentInfo();
		    PaymentGroup paymentGroup = pParams.getPaymentGroup();
		    PaymentStatus authStatus = pParams.getPaymentManager().getLastAuthorizationStatus (paymentGroup);
		    
		    try {
		      return getProcess().debit (homeDeliveryInfo, (HomeDeliveryStatus) authStatus);
		    }
		    catch (ClassCastException cce) {
		      throw new PaymentException(atg.commerce.payment.Constants.INVALID_AUTH_STATUS);
		    }
	}

}
