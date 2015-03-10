package com.mystore.order.processor;

import java.util.Date;

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

				System.out.println("MyStoreProcProcessPointsPayment======================\n\n\nauthorizePaymentGroup=="+ arg0.getAmount());
				
		Order order = arg0.getOrder();
		String profileId = order.getProfileId();
		System.out.println(profileId);
		
		double amount=arg0.getAmount();

		try {
			RepositoryItem userItem = getProfileRepository().getItem(profileId, "user");			
			RepositoryItem pointItem =(RepositoryItem) userItem.getPropertyValue("points");
			MutableRepositoryItem pointItemMut =(MutableRepositoryItem) userItem.getPropertyValue("points");
			Integer availableBalance=0;
			Integer reservedBalance=0;
			
						if (pointItem != null)
							{
								availableBalance = (Integer) pointItem.getPropertyValue("availableBalance");
								reservedBalance = (Integer) pointItem.getPropertyValue("reservedBalance");
							}
			 
			
			if(reservedBalance==null){
				reservedBalance=0;
			}
			
			if(availableBalance==null){
				availableBalance=0;
			}
			
			System.out.println("availble Balance-=== "+availableBalance);
			
			Double newavailableBalance = new Double(availableBalance-amount);
			Double newreservedBalance= new Double(reservedBalance+amount);
			
			pointItemMut.setPropertyValue("availableBalance", newavailableBalance.intValue());
			pointItemMut.setPropertyValue("reservedBalance", newreservedBalance.intValue());
			
			getProfileRepository().updateItem(pointItemMut);
			
		} catch (RepositoryException e) {			
			e.printStackTrace();
		}
		
		PaymentStatusImpl status = new PaymentStatusImpl(Long.toString(System.currentTimeMillis()),amount,true,"",new Date());

		return status;
	}

	@Override
	public PaymentStatus creditPaymentGroup(PaymentManagerPipelineArgs arg0)
			throws CommerceException {
				System.out.println("MyStoreProcProcessPointsPayment======================\n\n\n creditPaymentGroup");		
		Order order = arg0.getOrder();
		String profileId = order.getProfileId();
		System.out.println(profileId);
			
		PaymentStatusImpl status = new PaymentStatusImpl(Long.toString(System.currentTimeMillis()),1,true,"",new Date());
		return status;
	}

	@Override
	public PaymentStatus debitPaymentGroup(PaymentManagerPipelineArgs arg0)
			throws CommerceException {
				
				System.out.println("MyStoreProcProcessPointsPayment======================\n\n\n debitPaymentGroup");					
		Order order = arg0.getOrder();
		String profileId = order.getProfileId();
		System.out.println(profileId);
		
		PaymentStatusImpl status = new PaymentStatusImpl(Long.toString(System.currentTimeMillis()),1,true,"",new Date());
		return status;
	}

	public MutableRepository getProfileRepository() {
		return profileRepository;
	}

	public void setProfileRepository(MutableRepository profileRepository) {
		this.profileRepository = profileRepository;
	}

	
}
