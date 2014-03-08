package com.ff.payment.process;

import com.ff.order.HomeDelivery;
import com.ff.payment.HomeDeliveryProcess;

import atg.commerce.order.Order;
import atg.commerce.payment.PaymentManagerPipelineArgs;
import atg.nucleus.GenericService;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;

public class ProcCreateHomeDeliveryInfo extends GenericService implements
		PipelineProcessor {

	private HomeDeliveryProcess paymentInfo;
	
	String homeDeliveryInfoClass = "com.ff.payment.HomeDeliveryProcess";
	
	public String getHomeDeliveryInfoClass() {
		return homeDeliveryInfoClass;
	}

	public void setHomeDeliveryInfoClass(String homeDeliveryInfoClass) {
		this.homeDeliveryInfoClass = homeDeliveryInfoClass;
	}

	public HomeDeliveryProcess getPaymentInfo() throws Exception {
		
		 HomeDeliveryProcess genericLoyaltyPointsInfo = (HomeDeliveryProcess)
	      Class.forName(getHomeDeliveryInfoClass()).newInstance();
	    
	    return genericLoyaltyPointsInfo;
		
	}

	public void setPaymentInfo(HomeDeliveryProcess paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	
	public int[] getRetCodes() {
		// TODO Auto-generated method stub
		return new int[] { 1 };
	}


	public int runProcess(Object pParam, PipelineResult pipeline) throws Exception {
		// TODO Auto-generated method stub
		
		PaymentManagerPipelineArgs params = (PaymentManagerPipelineArgs)pParam;
		HomeDelivery paymentGroup = (HomeDelivery)params.getPaymentGroup();
		addDataToHomeDeliveryInfo(params.getOrder(), paymentGroup, params.getAmount(), params, getPaymentInfo());
		params.setPaymentInfo(getPaymentInfo());
		return 1;
	}

	protected void addDataToHomeDeliveryInfo(Order pOrder,
			HomeDelivery pPaymentGroup, double pAmount,
			PaymentManagerPipelineArgs pParams,
			HomeDeliveryProcess homeDeliveryInfo) {
		
		homeDeliveryInfo.setAmount(pPaymentGroup.getAmount());
		homeDeliveryInfo.setOrder(pOrder);
		
	}

}
