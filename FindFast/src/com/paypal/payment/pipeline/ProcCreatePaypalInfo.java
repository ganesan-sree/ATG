package com.paypal.payment.pipeline;

import javax.servlet.http.HttpSession;

import com.ff.order.HomeDelivery;
import com.paypal.PaypalBean;
import com.paypal.payment.Paypal;

import atg.commerce.order.Order;
import atg.commerce.payment.PaymentManagerPipelineArgs;
import atg.nucleus.GenericService;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.ServletUtil;

public class ProcCreatePaypalInfo extends GenericService implements PipelineProcessor{

	private PaypalBean bean;
	
	private String payPalBeanpath;

	public PaypalBean getBean() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		if(bean==null){
			bean = (PaypalBean) Class.forName(getPayPalBeanpath()).newInstance();
		}
		return bean;
	}


	public void setBean(PaypalBean bean) {
		this.bean = bean;
	}


	public String getPayPalBeanpath() {
		return payPalBeanpath;
	}


	public void setPayPalBeanpath(String payPalBeanpath) {
		this.payPalBeanpath = payPalBeanpath;
	}


	public int[] getRetCodes() {
		// TODO Auto-generated method stub
		return new int[]{1};
	}


	public int runProcess(Object pParam, PipelineResult pipeline) throws Exception {
		// TODO Auto-generated method stub
		PaymentManagerPipelineArgs params = (PaymentManagerPipelineArgs)pParam;
		Paypal paymentGroup = (Paypal)params.getPaymentGroup();
		DynamoHttpServletRequest pRequest = ServletUtil.getCurrentRequest();
		HttpSession session = pRequest.getSession();
		logDebug(session.getAttribute("token")+"--- payer id is "+session.getAttribute("payerId"));
		paymentGroup.setToken((String)session.getAttribute("token"));
		paymentGroup.setPayerId((String)session.getAttribute("payerId"));
		
		addDataToBean(params.getOrder(), paymentGroup, params.getAmount(), params, getBean());
		params.setPaymentInfo(getBean());
		return 1;
	}
	
	public void addDataToBean(Order order,Paypal paymentGroup,double amount,PaymentManagerPipelineArgs params,PaypalBean bean ){
		bean.setOrder(order);
		bean.setAmount(amount);
		bean.setToken(paymentGroup.getToken());
		bean.setPayPalMessage(paymentGroup.getPayPalMessage());
		bean.setToken(paymentGroup.getToken());
		bean.setPayerId(paymentGroup.getPayerId());
	}
}
