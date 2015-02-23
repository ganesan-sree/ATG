package cts.commerce.catalog.recentlyviewed;
import atg.dms.patchbay.MessageSink;
import atg.nucleus.GenericService;
import atg.repository.ItemDescriptorImpl;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.servlet.ServletUtil;
import atg.userprofiling.ProfileTools;
import atg.userprofiling.dms.ViewItemMessage;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import cts.commerce.catalog.recentlyviewed.RecentlyViewedTools;

public class RecentlyViewedHistoryCollector
  extends GenericService
  implements MessageSink
{
  public static final String CLASS_VERSION = "$Id: //hosting-blueprint/B2CBlueprint/version/10.2/EStore/src/atg/projects/store/userprofiling/RecentlyViewedHistoryCollector.java#2 $$Change: 768606 $";
  private ItemDescriptorImpl mProductItemDescriptor = null;
  protected RecentlyViewedTools mRecentlyViewedTools = null;
  
  public RecentlyViewedTools getRecentlyViewedTools()
  {
    return this.mRecentlyViewedTools;
  }
  
  public void setRecentlyViewedTools(RecentlyViewedTools pRecentlyViewedTools)
  {
    this.mRecentlyViewedTools = pRecentlyViewedTools;
  }
  
  protected String mMessageType = "atg.dps.ViewItem";
  
  public String getMessageType()
  {
    return this.mMessageType;
  }
  
  public void setMessageType(String pMessageType)
  {
    this.mMessageType = pMessageType;
  }
  
  protected Repository mCatalogRepository = null;
  
  public Repository getCatalogRepository()
  {
    return this.mCatalogRepository;
  }
  
  public void setCatalogRepository(Repository pCatalogRepository)
  {
    this.mCatalogRepository = pCatalogRepository;
  }
  
  protected ProfileTools mProfileTools = null;
  
  public ProfileTools getProfileTools()
  {
    return this.mProfileTools;
  }
  
  public void setProfileTools(ProfileTools pProfileTools)
  {
    this.mProfileTools = pProfileTools;
  }
  
  public void receiveMessage(String pPortName, Message pMessage)
    throws JMSException
  {
  	
  	System.out.println("Ganesan........................OOO\n\n\n\n");
    String productPropertyName = "product";//getProfileTools().getPropertyManager().getProductPropertyName();
    try
    {
      this.mProductItemDescriptor = ((ItemDescriptorImpl)getCatalogRepository().getItemDescriptor(productPropertyName));
    }
    catch (RepositoryException re)
    {
      if (isLoggingError()) {
        logDebug("There was a problem getting the item descriptor for " + productPropertyName + "\n" + re);
      }
    }
    catch (ClassCastException cce) {}
    
    
    //System.out.println(mProductItemDescriptor);
    
     
    
    
    String messageType = pMessage.getJMSType();
    if (messageType.equals(getMessageType()))
    {    
      ObjectMessage oMessage = (ObjectMessage)pMessage;
      ViewItemMessage itemMessage = (ViewItemMessage)oMessage.getObject();
      if (isLoggingDebug()) {
        logDebug("ViewItemMessageSink receives object = " + itemMessage);
      }
      System.out.println(itemMessage.getItemType());
      if ((itemMessage.getItemType().equals(productPropertyName)) || ((this.mProductItemDescriptor != null) && (this.mProductItemDescriptor.isInstance(itemMessage.getItem())))) {
      	
      	if (pMessage instanceof ObjectMessage) {
    			System.out.println("  ObjectMessage, value = \""
    					+ ((ObjectMessage) pMessage).getObject() + "\"");
    		}
      	System.out.println("GOt itttttttttttttttttttttttttttttttttttttttttt ");
        processMessage(itemMessage);
      }
    }
  }
  
  public void processMessage(ViewItemMessage pItemMessage)
  {
    RepositoryItem itemToAdd = pItemMessage.getItem();
    
    RepositoryItem currentProfile = ServletUtil.getCurrentUserProfile();
    
    String currentSiteId = pItemMessage.getSiteId();
    System.out.println("site Id === "+currentSiteId);
    try
    {
      getRecentlyViewedTools().addProduct(itemToAdd, currentProfile, currentSiteId);
    }
    catch (RepositoryException re)
    {
      if (isLoggingError()) {
        logError("There was a problem adding product '" + itemToAdd.getRepositoryId() + "' to profile - '" + currentProfile.getRepositoryId() + "'\n" + re);
      }
    }
  }
}

