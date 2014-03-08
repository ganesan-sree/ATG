package com.paypal.payment.pipeline;


import com.paypal.PaypalBean;
import com.paypal.payment.PayPalProcess;
import com.paypal.payment.PaypalStatus;

import atg.commerce.CommerceException;
import atg.commerce.order.PaymentGroup;
import atg.commerce.payment.PaymentException;
import atg.commerce.payment.PaymentManagerPipelineArgs;
import atg.commerce.payment.processor.ProcProcessPaymentGroup;
import atg.payment.PaymentStatus;

public class ProcProcessPaypalInfo extends ProcProcessPaymentGroup{

	
	private PayPalProcess process;
	
	public PayPalProcess getProcess() {
		return process;
	}


	public void setProcess(PayPalProcess process) {
		this.process = process;
	}


	public PaymentStatus authorizePaymentGroup(
			PaymentManagerPipelineArgs pParams)
			throws CommerceException {
		// TODO Auto-generated method stub
		 PaypalBean bean = (PaypalBean)pParams.getPaymentInfo();
		  
		    try {
		      return getProcess().authorize (bean);
		    }
		    catch (ClassCastException cce) {
		      throw new PaymentException(atg.commerce.payment.Constants.INVALID_AUTH_STATUS);
		    }
	}

	
	public PaymentStatus creditPaymentGroup(
			PaymentManagerPipelineArgs pParams)
			throws CommerceException {
		// TODO Auto-generated method stub
		 PaypalBean bean = (PaypalBean)pParams.getPaymentInfo();
		    PaymentGroup paymentGroup = pParams.getPaymentGroup();
		    PaymentStatus authStatus = pParams.getPaymentManager().getLastAuthorizationStatus (paymentGroup);
		    
		    try {
		      return getProcess().credit (bean, (PaypalStatus) authStatus);
		    }
		    catch (ClassCastException cce) {
		      throw new PaymentException(atg.commerce.payment.Constants.INVALID_AUTH_STATUS);
		    }
	}

	
	public PaymentStatus debitPaymentGroup(
			PaymentManagerPipelineArgs pParams)
			throws CommerceException {
		// TODO Auto-generated method stub
		 PaypalBean bean = (PaypalBean)pParams.getPaymentInfo();
		    PaymentGroup paymentGroup = pParams.getPaymentGroup();
		    PaymentStatus authStatus = pParams.getPaymentManager().getLastAuthorizationStatus (paymentGroup);
		    
		    try {
		      return getProcess().debit (bean, (PaypalStatus) authStatus);
		    }
		    catch (ClassCastException cce) {
		      throw new PaymentException(atg.commerce.payment.Constants.INVALID_AUTH_STATUS);
		    }
	}

}
