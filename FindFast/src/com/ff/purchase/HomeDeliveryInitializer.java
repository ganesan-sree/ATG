package com.ff.purchase;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import com.ff.order.HomeDelivery;

import atg.beans.DynamicBeans;
import atg.beans.PropertyNotFoundException;
import atg.commerce.CommerceException;
import atg.commerce.order.OrderTools;
import atg.commerce.order.PaymentGroup;
import atg.commerce.order.PaymentGroupManager;
import atg.commerce.order.purchase.PaymentGroupInitializationException;
import atg.commerce.order.purchase.PaymentGroupInitializer;
import atg.commerce.order.purchase.PaymentGroupMapContainer;
import atg.commerce.order.purchase.PaymentGroupMatcher;
import atg.commerce.order.purchase.PurchaseProcessConfiguration;
import atg.commerce.profile.CommerceProfileTools;
import atg.commerce.profile.CommercePropertyManager;
import atg.core.util.ResourceUtils;
import atg.nucleus.GenericService;
import atg.nucleus.ServiceException;
import atg.repository.RepositoryItem;
import atg.service.dynamo.LangLicense;
import atg.servlet.DynamoHttpServletRequest;
import atg.userprofiling.Profile;

public class HomeDeliveryInitializer extends GenericService implements PaymentGroupInitializer,PaymentGroupMatcher {

	
	public String getNewPaymentGroupName(PaymentGroup paymentgroup) {
		// TODO Auto-generated method stub
		 if(!(paymentgroup instanceof HomeDelivery))
	            return null;
	        Map paymentGroupMap = getPaymentGroupMapContainer().getPaymentGroupMap();
	        java.util.Collection paymentGroupNicknames = null;
	        if(paymentGroupMap != null)
	            paymentGroupNicknames = paymentGroupMap.keySet();
	        return getPaymentGroupManager().getOrderTools().getProfileTools().getUniqueCreditCardNickname((HomeDelivery)paymentgroup, paymentGroupNicknames, null);
	}

	
	 public String matchPaymentGroup(PaymentGroup pPaymentGroup, PaymentGroupMapContainer pPaymentGroupMapContainer)
    {
        if(!(pPaymentGroup instanceof HomeDelivery))
            return null;
        Set paymentGroupNames = pPaymentGroupMapContainer.getPaymentGroupMap().keySet();
        if(paymentGroupNames == null)
            return null;
        Iterator nameIter = paymentGroupNames.iterator();
        String paymentGroupName = null;
        boolean found = false;
        do
        {
            if(!nameIter.hasNext() || found)
                break;
            paymentGroupName = (String)nameIter.next();
            PaymentGroup paymentGroup = pPaymentGroupMapContainer.getPaymentGroup(paymentGroupName);
            if(paymentGroup instanceof HomeDelivery)
                found = true;
        } while(true);
        if(found)
            return paymentGroupName;
        else
            return null;
    }
	public void initializeCreditCards(Profile pProfile, PaymentGroupMapContainer pPaymentGroupMapContainer, DynamoHttpServletRequest pRequest)
    throws PaymentGroupInitializationException
{
    String ccPropertyName = getHomeDeliveryPropertyName();
    if(ccPropertyName == null)
        throw new PaymentGroupInitializationException(ResourceUtils.getMsgResource("missingCreditCardsPropertyName", "atg.commerce.order.purchase.PurchaseProcessResources", sResourceBundle));
    String defHomeDeliveryPropertyName = getDefaultHomeDeliveryPropertyName();
    RepositoryItem defaultHomeDelivery = null;
    try
    {
        if(defHomeDeliveryPropertyName != null)
            defaultHomeDelivery = (RepositoryItem)DynamicBeans.getSubPropertyValue(pProfile, defHomeDeliveryPropertyName);
        boolean foundDefault = false;
        Map creditCardsFound = (Map)DynamicBeans.getSubPropertyValue(pProfile, ccPropertyName);
        if(creditCardsFound != null)
        {
            Iterator iter = creditCardsFound.entrySet().iterator();
            do
            {
                if(!iter.hasNext())
                    break;
                java.util.Map.Entry entry = (java.util.Map.Entry)iter.next();
                String key = (String)entry.getKey();
                RepositoryItem creditCard = (RepositoryItem)entry.getValue();
                HomeDelivery cc = copyHomeDelivery(key, pProfile);
                pPaymentGroupMapContainer.addPaymentGroup(key, cc);
                if(!foundDefault && defaultHomeDelivery != null && creditCard.getRepositoryId().equals(defaultHomeDelivery.getRepositoryId()))
                {
                    foundDefault = true;
                    pPaymentGroupMapContainer.setDefaultPaymentGroupName(key);
                }
            } while(true);
        }
        if(!foundDefault && defaultHomeDelivery != null)
        {
            HomeDelivery cc = (HomeDelivery)getPaymentGroupManager().createPaymentGroup(getHomeDeliveryType());
           // getCommerceProfileTools().copyCreditCard(defaultHomeDelivery, cc);
            if(cc != null)
            {
                String defaultPaymentGroupName ="homeDelivery";
                pPaymentGroupMapContainer.addPaymentGroup(defaultPaymentGroupName, cc);
                pPaymentGroupMapContainer.setDefaultPaymentGroupName(defaultPaymentGroupName);
            }
        }
    }
    catch(Exception exc)
    {
        throw new PaymentGroupInitializationException(exc);
    }
}
	 protected HomeDelivery copyHomeDelivery(String pPaymentMethod, Profile pProfile)
     throws PaymentGroupInitializationException
 {
     PaymentGroupManager pgm = getPaymentGroupManager();
     if(pgm == null)
         throw new PaymentGroupInitializationException(ResourceUtils.getMsgResource("missingPaymentGroupManager", "atg.commerce.order.purchase.PurchaseProcessResources", sResourceBundle));
     CommerceProfileTools tools = getCommerceProfileTools();
     if(tools == null)
         throw new PaymentGroupInitializationException(ResourceUtils.getMsgResource("missingCommerceProfileTools", "atg.commerce.order.purchase.PurchaseProcessResources", sResourceBundle));
     HomeDelivery cc = null;
     try
     {
         cc = (HomeDelivery)pgm.createPaymentGroup(getHomeDeliveryType());
         Map<String, RepositoryItem> homeDeliveryMap = (Map<String, RepositoryItem>)getProfile().getPropertyValue("homeDelivery");
         if(homeDeliveryMap!=null){
        	 RepositoryItem mapItem = homeDeliveryMap.get(pPaymentMethod);
        	 copyHomeDelivery(mapItem,cc);
         }
       //  tools.copyCreditCardToPaymentGroup(pPaymentMethod, cc, pProfile, Locale.getDefault());
     }
     catch(CommerceException exc)
     {
         throw new PaymentGroupInitializationException(exc);
     }
     return cc;
 }
	
	  public void copyHomeDelivery(RepositoryItem pFromCreditCard, HomeDelivery pToHomeDelivery)
	    {
	       // CommercePropertyManager cpmgr = (CommercePropertyManager)getPropertyManager();
	        try
	        {
	            //copyShallowCreditCardProperties(pFromCreditCard, pToCreditCard);
	            RepositoryItem fromAddress = (RepositoryItem)pFromCreditCard.getPropertyValue("billingAddress");
	            OrderTools.copyAddress(fromAddress, pToHomeDelivery.getBillingAddress());
	        }
	        catch(CommerceException ce)
	        {
	            if(isLoggingError())
	                logError(ce);
	        }
	    }
	
	  protected void copyConfiguration()
	    {
	        if(configuration != null)
	        {
	            if(getCommerceProfileTools() == null)
	                setCommerceProfileTools(configuration.getCommerceProfileTools());
	            if(getPaymentGroupManager() == null)
	                setPaymentGroupManager(configuration.getPaymentGroupManager());
	            if(getPaymentGroupMapContainer() == null)
	                setPaymentGroupMapContainer(configuration.getPaymentGroupMapContainer());
	        }
	    }

	    public void doStartService()
	        throws ServiceException
	    {
	        super.doStartService();
	        copyConfiguration();
	    }

	    public static final String CLASS_VERSION = "$Id: //product/DCS/version/9.1/Java/atg/commerce/order/purchase/CreditCardInitializer.java#2 $$Change: 532316 $";
	    static final String MY_RESOURCE_NAME = "atg.commerce.order.purchase.PurchaseProcessResources";
	    private static ResourceBundle sResourceBundle = ResourceBundle.getBundle("atg.commerce.order.purchase.PurchaseProcessResources", LangLicense.getLicensedDefault());
	    PurchaseProcessConfiguration configuration;
	    PaymentGroupManager paymentGroupManager;
	    CommerceProfileTools commerceProfileTools;
	    String homeDeliveryPropertyName;
	    String homeDeliveryType;
	    String defaultHomeDeliveryPropertyName;
	   
	    public String getDefaultHomeDeliveryPropertyName() {
			return defaultHomeDeliveryPropertyName;
		}


		public void setDefaultHomeDeliveryPropertyName(
				String defaultHomeDeliveryPropertyName) {
			this.defaultHomeDeliveryPropertyName = defaultHomeDeliveryPropertyName;
		}

		PaymentGroupMapContainer paymentGroupMapContainer;

		public static ResourceBundle getsResourceBundle() {
			return sResourceBundle;
		}

		public static void setsResourceBundle(ResourceBundle sResourceBundle) {
			HomeDeliveryInitializer.sResourceBundle = sResourceBundle;
		}

		public PurchaseProcessConfiguration getConfiguration() {
			return configuration;
		}

		public void setConfiguration(PurchaseProcessConfiguration configuration) {
			this.configuration = configuration;
		}

		public PaymentGroupManager getPaymentGroupManager() {
			return paymentGroupManager;
		}

		public void setPaymentGroupManager(PaymentGroupManager paymentGroupManager) {
			this.paymentGroupManager = paymentGroupManager;
		}

		public CommerceProfileTools getCommerceProfileTools() {
			return commerceProfileTools;
		}

		public void setCommerceProfileTools(CommerceProfileTools commerceProfileTools) {
			this.commerceProfileTools = commerceProfileTools;
		}

		public String getHomeDeliveryPropertyName() {
			return homeDeliveryPropertyName;
		}

		public void setHomeDeliveryPropertyName(String homeDeliveryPropertyName) {
			this.homeDeliveryPropertyName = homeDeliveryPropertyName;
		}

		public String getHomeDeliveryType() {
			return homeDeliveryType;
		}

		public void setHomeDeliveryType(String homeDeliveryType) {
			this.homeDeliveryType = homeDeliveryType;
		}

		public PaymentGroupMapContainer getPaymentGroupMapContainer() {
			return paymentGroupMapContainer;
		}

		public void setPaymentGroupMapContainer(
				PaymentGroupMapContainer paymentGroupMapContainer) {
			this.paymentGroupMapContainer = paymentGroupMapContainer;
		}

		  public void initializePaymentGroups(Profile pProfile, PaymentGroupMapContainer pPaymentGroupMapContainer, DynamoHttpServletRequest pRequest)
	        throws PaymentGroupInitializationException
	    {
	        initializeCreditCards(pProfile, pPaymentGroupMapContainer, pRequest);
	    }
	
		  private CommercePropertyManager propertyManager;
		  
		  private Profile profile;

		public Profile getProfile() {
			return profile;
		}


		public void setProfile(Profile profile) {
			this.profile = profile;
		}


		public CommercePropertyManager getPropertyManager() {
			return propertyManager;
		}


		public void setPropertyManager(CommercePropertyManager propertyManager) {
			this.propertyManager = propertyManager;
		}
}
