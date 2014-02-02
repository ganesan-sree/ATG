package com.ff.commerce;

import atg.commerce.order.Order;
import atg.commerce.order.OrderHolder;
import atg.nucleus.GenericService;
import atg.nucleus.Nucleus;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryItem;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;
import atg.servlet.ServletUtil;
import atg.userprofiling.Profile;

public class UserOrderPipelineProc extends GenericService implements PipelineProcessor {

	private OrderHolder orderHolder;
	
	private MutableRepository orderRepository;
	
	
	public MutableRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(MutableRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	private MutableRepository profileRepository;
	
	public MutableRepository getProfileRepository() {
		return profileRepository;
	}

	public void setProfileRepository(MutableRepository profileRepository) {
		this.profileRepository = profileRepository;
	}

	
	public int[] getRetCodes() {
		// TODO Auto-generated method stub
		return new int[]{1};
		
	}

	
	public int runProcess(Object arg0, PipelineResult arg1) throws Exception {
		// TODO Auto-generated method stub
		Profile profile = (Profile)ServletUtil.getCurrentUserProfile();
		if(profile!=null && getOrderHolder()!=null){
			MutableRepositoryItem item = getProfileRepository().getItemForUpdate(profile.getRepositoryId());
			RepositoryItem rItem = getOrderRepository().getItem(getOrderHolder().getCurrent().getId());
			
			if(item!=null && rItem!=null){
				item.setPropertyValue("orderItem", rItem);
				getProfileRepository().updateItem(item);
				logDebug("Item updated");
			}
		}
		
		return 1;
	}

	public OrderHolder getOrderHolder() {
		return orderHolder;
	}

	public void setOrderHolder(OrderHolder orderHolder) {
		this.orderHolder = orderHolder;
	}



	
	
}
