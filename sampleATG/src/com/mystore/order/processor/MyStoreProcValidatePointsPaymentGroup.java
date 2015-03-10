package com.mystore.order.processor;

import java.util.HashMap;

import org.apache.taglibs.bsf.expression;

import com.mystore.order.PointsPaymentGroup;

import atg.commerce.order.Order;
import atg.commerce.order.PaymentGroup;
import atg.commerce.order.processor.ValidatePaymentGroupPipelineArgs;
import atg.nucleus.logging.ApplicationLoggingImpl;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;

public class MyStoreProcValidatePointsPaymentGroup extends ApplicationLoggingImpl implements PipelineProcessor {

	@Override
	public int runProcess(Object paramObject, PipelineResult paramPipelineResult)
			throws Exception {
		
		
		System.out.println("LLLL::::::::::::::::::: MyStoreProcValidatePointsPaymentGroup");
		ValidatePaymentGroupPipelineArgs validArgs=(ValidatePaymentGroupPipelineArgs)paramObject;
		
		Order order=validArgs.getOrder();
		
		if(validArgs.getPaymentGroup() != null && validArgs.getPaymentGroup() instanceof PointsPaymentGroup){
		PointsPaymentGroup pg=(PointsPaymentGroup) validArgs.getPaymentGroup();
		System.out.println("Points==== Item======================"+pg.getPointsItem());
		
			if (pg.getPointsItem() == null) {
				 HashMap map = new HashMap(5);
				 map.put("PointsItem", "have a null valueeeee");
				 paramPipelineResult.addError("PointsPgError", map);
			}
		
		}else{
			throw new Exception("Not a right payment group...............");
		}
		return 0;
	}

	

	@Override
	public int[] getRetCodes() {
		// TODO Auto-generated method stub
		return null;
	}

}
