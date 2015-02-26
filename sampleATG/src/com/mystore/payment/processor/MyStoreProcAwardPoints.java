package com.mystore.payment.processor;

import atg.commerce.order.Order;
import atg.commerce.payment.PaymentManagerPipelineArgs;
import atg.nucleus.GenericService;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;

public class MyStoreProcAwardPoints  extends GenericService implements PipelineProcessor{

	MutableRepository profileRepository;
	
	@Override
	public int runProcess(Object paramObject, PipelineResult paramPipelineResult)
			throws Exception {
		PaymentManagerPipelineArgs args = (PaymentManagerPipelineArgs) paramObject;
		Order order=args.getOrder();
		String profileId=order.getProfileId();
		try {
			MutableRepositoryItem userItem = getProfileRepository().getItemForUpdate(profileId, "user");
			
			System.out.println(userItem);
			
			userItem.setPropertyValue("availableBalance",args.getAmount());
			
			
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int[] getRetCodes() {
		// TODO Auto-generated method stub
		return null;
	}

	public MutableRepository getProfileRepository() {
		return profileRepository;
	}

	public void setProfileRepository(MutableRepository profileRepository) {
		this.profileRepository = profileRepository;
	}

	
	
}


