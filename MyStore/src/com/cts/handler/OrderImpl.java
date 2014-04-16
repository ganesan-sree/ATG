package com.cts.handler;

import atg.commerce.order.Order;
import atg.commerce.order.OrderHolder;
import atg.commerce.order.ShoppingCartFormHandler;
import atg.commerce.order.purchase.CartModifierFormHandler;
import atg.commerce.order.purchase.CreateCreditCardFormHandler;
import atg.commerce.order.purchase.PaymentGroupDroplet;
import atg.commerce.order.purchase.ShippingGroupDroplet;
import atg.commerce.order.purchase.ShippingGroupFormHandler;
import atg.commerce.pricing.AvailableShippingMethodsDroplet;
import atg.service.pipeline.PipelineManager;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;

public class OrderImpl  extends OrderHolder{
	ShoppingCartFormHandler s = new ShoppingCartFormHandler();
	
	CartModifierFormHandler c = new CartModifierFormHandler();
	
	PipelineManager man = new PipelineManager();
	
	ShoppingCartFormHandler s1= new ShoppingCartFormHandler();
	
	AvailableShippingMethodsDroplet aa= new AvailableShippingMethodsDroplet();
	
	PaymentGroupDroplet  pay = new PaymentGroupDroplet();
	
	ShippingGroupDroplet ship = new ShippingGroupDroplet();
	
	ShippingGroupFormHandler shipform= new ShippingGroupFormHandler();
	
	//.creditCard.CreditCardNumber
	CreateCreditCardFormHandler credit= new CreateCreditCardFormHandler();
	
	OrderImpl or= new OrderImpl();
	
	
	OrderHolder cart = new OrderHolder();
	
	PipelineProcessor pro= new PipelineProcessor() {
		
		@Override
		public int runProcess(Object paramObject, PipelineResult paramPipelineResult)
				throws Exception {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int[] getRetCodes() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	atg.commerce.order.OrderImpl impl = new atg.commerce.order.OrderImpl();
	
	
}
