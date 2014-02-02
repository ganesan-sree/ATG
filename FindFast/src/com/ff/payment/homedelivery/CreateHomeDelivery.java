package com.ff.payment.homedelivery;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import com.ff.order.HomeDelivery;

import atg.commerce.CommerceException;
import atg.commerce.order.purchase.CreatePaymentGroupFormHandler;
import atg.commerce.order.purchase.PaymentGroupMapContainer;
import atg.commerce.order.purchase.PurchaseProcessFormHandler;
import atg.commerce.util.TransactionLockService;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.ServletUtil;
import atg.userprofiling.Profile;
import atg.repository.RepositoryItem;

public class CreateHomeDelivery extends PurchaseProcessFormHandler implements CreatePaymentGroupFormHandler{
	
	private HomeDelivery homeDelivery;
	
	private String homeDeliveryName;
	
	private MutableRepository profileAdapterRepository;
	
	public MutableRepository getProfileAdapterRepository() {
		return profileAdapterRepository;
	}

	public void setProfileAdapterRepository(MutableRepository profileAdapterRepository) {
		this.profileAdapterRepository = profileAdapterRepository;
	}

	public String getHomeDeliveryName() {
		return homeDeliveryName;
	}

	public void setHomeDeliveryName(String homeDeliveryName) {
		this.homeDeliveryName = homeDeliveryName;
	}

	private MutableRepository orderRepository;
	
	private boolean copytoProfile;
	
	private PaymentGroupMapContainer container;
	
	public PaymentGroupMapContainer getContainer() {
		return container;
	}

	public void setContainer(PaymentGroupMapContainer container) {
		this.container = container;
	}

	public boolean isCopytoProfile() {
		return copytoProfile;
	}

	public void setCopytoProfile(boolean copytoProfile) {
		this.copytoProfile = copytoProfile;
	}

	private String successURL;
	
	private String errorURL;

	public String getSuccessURL() {
		return successURL;
	}

	public void setSuccessURL(String successURL) {
		this.successURL = successURL;
	}

	public String getErrorURL() {
		return errorURL;
	}

	public void setErrorURL(String errorURL) {
		this.errorURL = errorURL;
	}

	public MutableRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(MutableRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	

	public void setHomeDelivery(HomeDelivery homeDelivery) {
		this.homeDelivery = homeDelivery;
	}

	public HomeDelivery getHomeDelivery(){
		if(homeDelivery==null){
			try {
				homeDelivery = (HomeDelivery)getPaymentGroupManager().createPaymentGroup("homeDelivery");
			} catch (CommerceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return homeDelivery;
	}
	
	public void handleCreate(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse) throws RepositoryException, ServletException, IOException{
		HomeDelivery homeDelivery = getHomeDelivery();
		if(homeDelivery!=null){
			
			 PaymentGroupMapContainer container = getContainer();
			 
			 container.addPaymentGroup(getHomeDeliveryName(), homeDelivery);
			
			MutableRepositoryItem item = getOrderRepository().createItem("homeDelivery");
			if(isCopytoProfile()){
				createProfileHomeDelivery(getHomeDeliveryName(),homeDelivery);
			}
			checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest, pResponse);
		}
	}
	public TransactionLockService getTransactionLockService(){
		return null;
	}
	
	public void createProfileHomeDelivery(String key,HomeDelivery homeDelivery) throws RepositoryException{
		MutableRepositoryItem item = getProfileAdapterRepository().createItem("home-delivery");
		MutableRepositoryItem billing = getProfileAdapterRepository().createItem("contactInfo");
		billing.setPropertyValue("firstName", homeDelivery.getBillingAddress().getFirstName());
		billing.setPropertyValue("middleName", homeDelivery.getBillingAddress().getMiddleName());
		billing.setPropertyValue("lastName", homeDelivery.getBillingAddress().getLastName());
		
		billing.setPropertyValue("address1", homeDelivery.getBillingAddress().getAddress1());
		billing.setPropertyValue("address2", homeDelivery.getBillingAddress().getAddress2());
		billing.setPropertyValue("address3", homeDelivery.getBillingAddress().getAddress3());
		
		billing.setPropertyValue("city", homeDelivery.getBillingAddress().getCity());
		billing.setPropertyValue("state", homeDelivery.getBillingAddress().getState());
		billing.setPropertyValue("county", homeDelivery.getBillingAddress().getCounty());
		billing.setPropertyValue("country", homeDelivery.getBillingAddress().getCountry());
		
		item.setPropertyValue("billingAddress", getProfileAdapterRepository().addItem(billing));
		item.setPropertyValue("isDelivered", false);
		
		Profile profile = (Profile)ServletUtil.getCurrentUserProfile();
		

		
		Map<String,RepositoryItem> home = (Map<String,RepositoryItem>)profile.getPropertyValue("homeDelivery");
		if(home==null){
			home = new HashMap<String, RepositoryItem>();
		}
		home.put(key,getProfileAdapterRepository().addItem(item));
		profile.setPropertyValue("homeDelivery", home);
		getProfileAdapterRepository().updateItem(profile);
		
		
	
	}
}
