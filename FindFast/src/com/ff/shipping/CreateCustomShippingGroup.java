package com.ff.shipping;

import java.io.IOException;

import javax.servlet.ServletException;

import atg.commerce.CommerceException;
import atg.commerce.order.ShippingGroupManager;
import atg.commerce.order.purchase.CreateCreditCardFormHandler;
import atg.commerce.order.purchase.CreateShippingGroupFormHandler;
import atg.commerce.order.purchase.PurchaseProcessConfiguration;
import atg.commerce.order.purchase.PurchaseProcessFormHandler;
import atg.commerce.order.purchase.ShippingGroupFormHandler;
import atg.commerce.order.purchase.ShippingGroupMapContainer;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;

public class CreateCustomShippingGroup extends PurchaseProcessFormHandler implements CreateShippingGroupFormHandler{

	private String mobileNumber;
	
	private String customShippingGroupName;
	
	private PurchaseProcessConfiguration configuration;
	
	



	public PurchaseProcessConfiguration getConfiguration() {
		return configuration;
	}



	public void setConfiguration(PurchaseProcessConfiguration configuration) {
		this.configuration = configuration;
	}



	public String getCustomShippingGroupName() {
		return customShippingGroupName;
	}
	
	

	public void setCustomShippingGroupName(String customShippingGroupName) {
		this.customShippingGroupName = customShippingGroupName;
	}

	private CustomShippingGroup customShippingGroup;
	
	private ShippingGroupMapContainer container;
	
	private String successURL;
	
	private String errorURL;
	
	
	public boolean handleCreate(DynamoHttpServletRequest pRequest,DynamoHttpServletResponse pResponse) throws ServletException, IOException, CommerceException{
		if(getMobileNumber()!=null){
			CustomShippingGroup group = getCustomShippingGroup();
			group.setMobileNumber(getMobileNumber());
			getContainer().setDefaultShippingGroupName(getCustomShippingGroupName());
			getContainer().addShippingGroup(getCustomShippingGroupName(), group);
		}
		return checkFormRedirect(successURL, errorURL, pRequest, pResponse);
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public CustomShippingGroup getCustomShippingGroup() throws CommerceException {
		CustomShippingGroup group=(CustomShippingGroup)getShippingGroupManager().createShippingGroup("customShippingGroup");
		return group;
	}

	public void setCustomShippingGroup(CustomShippingGroup customShippingGroup) {
		this.customShippingGroup = customShippingGroup;
	}
	


	public ShippingGroupMapContainer getContainer() {
		
		if(container==null){
			return getConfiguration().getShippingGroupMapContainer();
		}
		return container;
	}

	public void setContainer(ShippingGroupMapContainer container) {
		
		this.container = container;
	}

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
	
}
