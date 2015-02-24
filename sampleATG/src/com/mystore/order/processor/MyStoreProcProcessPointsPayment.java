package com.mystore.order.processor;

import atg.commerce.CommerceException;
import atg.commerce.order.Order;
import atg.commerce.payment.PaymentManagerPipelineArgs;
import atg.commerce.payment.processor.ProcProcessPaymentGroup;
import atg.payment.PaymentStatus;
import atg.payment.PaymentStatusImpl;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;

public class MyStoreProcProcessPointsPayment extends ProcProcessPaymentGroup{
	
	
	MutableRepository profileRepository;

	@Override
	public PaymentStatus authorizePaymentGroup(PaymentManagerPipelineArgs arg0)
			throws CommerceException {

		System.out.println(arg0.getAmount());
		System.out.println(arg0.getOrder());

		Order order = arg0.getOrder();

		String profileId = order.getProfileId();
		System.out.println(profileId);

		// profileRepository.ge
		
		try {
			MutableRepositoryItem userItem = getProfileRepository().getItemForUpdate(profileId, "user");
			
			System.out.println(userItem);
			userItem.getRepository().getItem("reservedBalance");
			userItem.getRepository().getItem("availableBalance");
			
			
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PaymentStatusImpl status = new PaymentStatusImpl();

		return status;
	}

	@Override
	public PaymentStatus creditPaymentGroup(PaymentManagerPipelineArgs arg0)
			throws CommerceException {
		System.out.println(arg0.getAmount());
		System.out.println(arg0.getOrder());

		Order order = arg0.getOrder();

		String profileId = order.getProfileId();
		System.out.println(profileId);

		// profileRepository.ge
		
		try {
			MutableRepositoryItem userItem = getProfileRepository().getItemForUpdate(profileId, "user");
			
			System.out.println(userItem);
			userItem.getRepository().getItem("reservedBalance");
			userItem.getRepository().getItem("availableBalance");
			
			
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PaymentStatusImpl status = new PaymentStatusImpl();

		return status;
	}

	@Override
	public PaymentStatus debitPaymentGroup(PaymentManagerPipelineArgs arg0)
			throws CommerceException {
		System.out.println(arg0.getAmount());
		System.out.println(arg0.getOrder());

		Order order = arg0.getOrder();

		String profileId = order.getProfileId();
		System.out.println(profileId);

		// profileRepository.ge
		
		try {
			MutableRepositoryItem userItem = getProfileRepository().getItemForUpdate(profileId, "user");
			
			System.out.println(userItem);
			userItem.getRepository().getItem("reservedBalance");
			userItem.getRepository().getItem("availableBalance");
			
			
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PaymentStatusImpl status = new PaymentStatusImpl();

		return status;
	}

	public MutableRepository getProfileRepository() {
		return profileRepository;
	}

	public void setProfileRepository(MutableRepository profileRepository) {
		this.profileRepository = profileRepository;
	}

	
}
