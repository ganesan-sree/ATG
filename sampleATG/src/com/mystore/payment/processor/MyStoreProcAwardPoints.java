package com.mystore.payment.processor;

import atg.commerce.order.Order;
import atg.commerce.payment.PaymentManagerPipelineArgs;
import atg.nucleus.GenericService;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;

public class MyStoreProcAwardPoints  extends GenericService implements PipelineProcessor{

	MutableRepository profileRepository;
	
	@Override
	public int runProcess(Object paramObject, PipelineResult paramPipelineResult)
			throws Exception {
				
				System.out.println("MyStoreProcAwardPoints==\n\n\nMyStoreProcAwardPoints"); 
				
		PaymentManagerPipelineArgs args = (PaymentManagerPipelineArgs) paramObject;
		Order order=args.getOrder();
		int points=(int) args.getAmount();
		String profileId=order.getProfileId();
		System.out.println(points);
	
		try {
			
			
			MutableRepositoryItem userItem = getProfileRepository().getItemForUpdate(profileId,"user");
			System.out.println("Profile Idddd===\n\n"+userItem);
			RepositoryItem pintsItem =(RepositoryItem) userItem.getPropertyValue("points");
			
			
			
			if(pintsItem==null){				
				MutableRepositoryItem mutablePointItem=getProfileRepository().createItem("point");
				Integer availableBalance	=(Integer) mutablePointItem.getPropertyValue("availableBalance");
											
				if(availableBalance ==null){
					availableBalance=0;
				}
				System.out.println("creating new Points rows");
				availableBalance = availableBalance + points;								
				mutablePointItem.setPropertyValue("availableBalance",availableBalance);
				mutablePointItem.setPropertyValue("reservedBalance",0);
								
				userItem.setPropertyValue("points", mutablePointItem);				
				getProfileRepository().updateItem(userItem);
								
			}else{
			
				MutableRepositoryItem   mutableUserItemPints =(MutableRepositoryItem) userItem.getPropertyValue("points");				
				Integer availableBalance	=(Integer) mutableUserItemPints.getPropertyValue("availableBalance");
				
				if(availableBalance ==null){
					availableBalance=0;
				}
				
				availableBalance = availableBalance + points;								
				mutableUserItemPints.setPropertyValue("availableBalance",availableBalance);
											
				getProfileRepository().updateItem(mutableUserItemPints);
			}
			
			
		} catch (RepositoryException e) {	
			e.printStackTrace();
		}
		return 1;
	}

	@Override
	public int[] getRetCodes() {
		return null;
	}

	public MutableRepository getProfileRepository() {
		return profileRepository;
	}

	public void setProfileRepository(MutableRepository profileRepository) {
		this.profileRepository = profileRepository;
	}

	
	
}


