package com.cts.pipeline.processor;

import atg.nucleus.GenericService;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;

public class FirstProccessor extends GenericService implements
		PipelineProcessor {

	@Override
	public int[] getRetCodes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int runProcess(Object paramObject, PipelineResult paramPipelineResult)
			throws Exception {

		System.out.println("Run Method in First Processor");
		return 1;
	}

}
