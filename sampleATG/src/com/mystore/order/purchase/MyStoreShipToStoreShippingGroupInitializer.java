package com.mystore.order.purchase;

import java.beans.IntrospectionException;

import com.mystore.order.ShipToStoreShippingGroup;

import atg.beans.DynamicBeans;
import atg.beans.PropertyNotFoundException;
import atg.commerce.CommerceException;
import atg.commerce.order.RepositoryContactInfo;
import atg.commerce.order.ShippingGroup;
import atg.commerce.order.ShippingGroupManager;
import atg.commerce.order.purchase.ShippingGroupInitializationException;
import atg.commerce.order.purchase.ShippingGroupInitializer;
import atg.commerce.order.purchase.ShippingGroupMapContainer;
import atg.commerce.order.purchase.ShippingGroupMatcher;
import atg.nucleus.GenericService;
import atg.repository.RepositoryItem;
import atg.servlet.DynamoHttpServletRequest;
import atg.userprofiling.Profile;

public class MyStoreShipToStoreShippingGroupInitializer  extends GenericService implements ShippingGroupInitializer ,ShippingGroupMatcher{

	
	
	private String storePropertyName;
	private ShippingGroupManager shippingGroupManager;
	private String shippingGroupType;
	private String shippingMethod;
	
	@Override
	public String matchShippingGroup(ShippingGroup paramShippingGroup,
			ShippingGroupMapContainer paramShippingGroupMapContainer) {
	
		return "shipToStoreShippingGroup";
	}

	@Override
	public String getNewShippingGroupName(ShippingGroup pShippingGroup) {
		
		if(!pShippingGroup.getShippingGroupClassType().equalsIgnoreCase("shipToStoreShippingGroup")){
			return null;
		}		
		ShipToStoreShippingGroup sg =(ShipToStoreShippingGroup) pShippingGroup;
		/**/
		return "CVS";
	}

	@Override
	public void initializeShippingGroups(Profile pProfile,
			ShippingGroupMapContainer pShippingGroupMapContainer,
			DynamoHttpServletRequest pRequest)
			throws ShippingGroupInitializationException {
		
		
		try {
			RepositoryItem store=(RepositoryItem) DynamicBeans.getSubPropertyDescriptor(pProfile, storePropertyName);
			
			
		ShipToStoreShippingGroup sg=(ShipToStoreShippingGroup) getShippingGroupManager().createShippingGroup(getShippingGroupType());
			
	    RepositoryContactInfo sgAddress= (RepositoryContactInfo) sg.getShippingAddress();
	    
	    sg.setShippingMethod(getShippingMethod());
	    sg.setPropertyValue("590");
	    
	    sgAddress.setFirstName((String) pProfile.getPropertyValue("firstName"));
	    sgAddress.setLastName((String) pProfile.getPropertyValue("middleName"));
	    sgAddress.setLastName((String) pProfile.getPropertyValue("lastName"));
	    sgAddress.setCompanyName("CVS");
	    
	    
	    pShippingGroupMapContainer.addShippingGroup(sgAddress.getCompanyName(), sg);
			
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropertyNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CommerceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public String getStorePropertyName() {
		return storePropertyName;
	}

	public void setStorePropertyName(String storePropertyName) {
		this.storePropertyName = storePropertyName;
	}

	public ShippingGroupManager getShippingGroupManager() {
		return shippingGroupManager;
	}

	public void setShippingGroupManager(ShippingGroupManager shippingGroupManager) {
		this.shippingGroupManager = shippingGroupManager;
	}

	public String getShippingGroupType() {
		return shippingGroupType;
	}

	public void setShippingGroupType(String shippingGroupType) {
		this.shippingGroupType = shippingGroupType;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	
	
	
	
}


