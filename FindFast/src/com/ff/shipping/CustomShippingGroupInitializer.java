package com.ff.shipping;

import java.util.Iterator;
import java.util.Set;

import atg.commerce.order.ShippingGroup;
import atg.commerce.order.purchase.ShippingGroupInitializationException;
import atg.commerce.order.purchase.ShippingGroupInitializer;
import atg.commerce.order.purchase.ShippingGroupMapContainer;
import atg.commerce.order.purchase.ShippingGroupMatcher;
import atg.nucleus.GenericService;
import atg.servlet.DynamoHttpServletRequest;
import atg.userprofiling.Profile;

public class CustomShippingGroupInitializer extends GenericService implements ShippingGroupMatcher,ShippingGroupInitializer {

	public String getNewShippingGroupName(ShippingGroup shippinggroup) {
		// TODO Auto-generated method stub
		if(!(shippinggroup instanceof CustomShippingGroup)){
			return null;
		}
		else{
			((CustomShippingGroup)shippinggroup).getMobileNumber();
		}
		return null;
	}

	public String matchShippingGroup(ShippingGroup pShippingGroup,
			ShippingGroupMapContainer pShippingGroupMapContainer) {
		// TODO Auto-generated method stub
		  if(!(pShippingGroup instanceof CustomShippingGroup))
	            return null;
	        String mobileNumber = ((CustomShippingGroup)pShippingGroup).getMobileNumber();
	        Set shippingGroupNames = pShippingGroupMapContainer.getShippingGroupNames();
	        if(shippingGroupNames == null)
	            return null;
	        Iterator nameIter = shippingGroupNames.iterator();
	        String shippingGroupName = null;
	        boolean found = false;
	        do
	        {
	            if(!nameIter.hasNext() || found)
	                break;
	            shippingGroupName = (String)nameIter.next();
	            ShippingGroup shippingGroup = pShippingGroupMapContainer.getShippingGroup(shippingGroupName);
	            if(shippingGroup instanceof CustomShippingGroup)
	            {
	                String shipAddress = ((CustomShippingGroup)shippingGroup).getMobileNumber();
	                if(shipAddress != null)
	                    found = shipAddress.equals(mobileNumber);
	            }
	        } while(true);
	        if(found)
	            return shippingGroupName;
	        else
	            return null;
	}

	public void initializeShippingGroups(Profile profile,
			ShippingGroupMapContainer shippinggroupmapcontainer,
			DynamoHttpServletRequest dynamohttpservletrequest)
			throws ShippingGroupInitializationException {
		// TODO Auto-generated method stub
		
	}

}
