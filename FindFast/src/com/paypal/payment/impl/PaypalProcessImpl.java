package com.paypal.payment.impl;


import java.util.HashMap;

import com.paypal.PaypalInfo;
import com.paypal.payment.PayPalProcess;
import com.paypal.payment.PaypalStatus;
import com.paypal.util.PaypalUtil;

import atg.nucleus.GenericService;
import atg.payment.PaymentStatus;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.ServletUtil;

public class PaypalProcessImpl extends GenericService implements PayPalProcess {

	
	public PaypalStatus authorize(PaypalInfo info) {
		// TODO Auto-generated method stub
		
		String token = info.getToken();
		String payerId = info.getPayerId();
		PaypalUtil util = new PaypalUtil();
		DynamoHttpServletRequest pReq = ServletUtil.getCurrentRequest();
		HashMap map = util.ConfirmPayment(token, payerId, ""+info.getAmount(), pReq.getServerName());
		String status = map.get("ACK").toString();
		boolean flag=false;
		if(status.equalsIgnoreCase("success")){
			flag=true;
		}else{
			  String ErrorCode = (String)map.get("L_ERRORCODE0");
	            String ErrorShortMsg = (String)map.get("L_SHORTMESSAGE0");
	            String ErrorLongMsg = (String)map.get("L_LONGMESSAGE0");
	            String ErrorSeverityCode = (String)map.get("L_SEVERITYCODE0");
	            logDebug(ErrorCode+"--"+ErrorShortMsg + "--"+ErrorLongMsg+"--"+ErrorSeverityCode);
		}
		return new PaypalStatusImpl(map.get("TRANSACTIONID").toString(),info.getAmount(),flag,"",new java.util.Date(),status);
	}

	
	public PaypalStatus credit(PaypalInfo info,
			PaymentStatus paymentStatus) {
		// TODO Auto-generated method stub
		String transactionId = info.getToken();
		return new PaypalStatusImpl(transactionId,info.getAmount(),true,"",new java.util.Date(),info.getPayPalMessage());
	}

	
	public PaypalStatus debit(PaypalInfo info,
			PaymentStatus paymentStatus) {
		// TODO Auto-generated method stub
		String transactionId = info.getToken();
		return new PaypalStatusImpl(transactionId,info.getAmount(),true,"",new java.util.Date(),info.getPayPalMessage());
	}

}
