package com.cts.handler;

import atg.commerce.order.OrderHolder;
import atg.commerce.order.ShoppingCartFormHandler;
import atg.commerce.order.purchase.CartModifierFormHandler;
import atg.service.pipeline.PipelineManager;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;

public class OrderImpl  extends OrderHolder{
	ShoppingCartFormHandler s = new ShoppingCartFormHandler();
	
	CartModifierFormHandler c = new CartModifierFormHandler();
	
	PipelineManager man = new PipelineManager();
	
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
