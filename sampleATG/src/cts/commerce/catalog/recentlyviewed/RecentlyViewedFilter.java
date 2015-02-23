package cts.commerce.catalog.recentlyviewed;

import atg.core.util.StringUtils;
import atg.multisite.SiteContextManager;
import atg.multisite.SiteGroupManager;
import atg.multisite.SiteManager;
//import atg.projects.store.catalog.StoreCatalogTools;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.service.collections.filter.CachedCollectionFilter;
import atg.service.collections.filter.FilterException;
import atg.userprofiling.ProfileTools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;


public class RecentlyViewedFilter
  extends CachedCollectionFilter
{
  public static String CLASS_VERSION = "$Id: //hosting-blueprint/B2CBlueprint/version/10.2/EStore/src/atg/projects/store/collections/filter/RecentlyViewedFilter.java#2 $$Change: 768606 $";
  private static final String SIZE = "size";
  private static final String EXCLUDE = "exclude";
  protected SiteGroupManager mSiteGroupManager;
  
  protected SiteGroupManager getSiteGroupManager()
  {
    return this.mSiteGroupManager;
  }
  
  public void setSiteGroupManager(SiteGroupManager pSiteGroupManager)
  {
    this.mSiteGroupManager = pSiteGroupManager;
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
  
 
  
  protected RecentlyViewedTools mRecentlyViewedTools = null;
  
  public RecentlyViewedTools getRecentlyViewedTools()
  {
    return this.mRecentlyViewedTools;
  }
  
  public void setRecentlyViewedTools(RecentlyViewedTools pRecentlyViewedTools)
  {
    this.mRecentlyViewedTools = pRecentlyViewedTools;
  }
  
  private int mMaxProductsToDisplay = 5;
  
  public void setMaxProductsToDisplay(int pMaxProductsToDisplay)
  {
    this.mMaxProductsToDisplay = pMaxProductsToDisplay;
  }
  
  public int getMaxProductsToDisplay()
  {
    return this.mMaxProductsToDisplay;
  }
  
  protected Collection generateFilteredCollection(Collection pUnfilteredCollection, String pCollectionIdentifierKey, RepositoryItem pProfile, Map pExtraParameters)
    throws FilterException
  {
    Collection<RepositoryItem> resultCollection = new ArrayList();
    if ((pUnfilteredCollection == null) || (pUnfilteredCollection.isEmpty()))
    {      
        vlogDebug("The unfiltered collection was either null or empty. Returning empty list.");     
      return resultCollection;
    }
    
    
    
    if (((pUnfilteredCollection instanceof Collection)) && (!(((List)pUnfilteredCollection).get(0) instanceof RepositoryItem)))
    {      
        vlogDebug("The unfiltered collection did not contain a list of RepositoryItems. Returning empty list.");     
      return resultCollection;
    }
    
    
    List<RepositoryItem> recentlyViewed = (List)pUnfilteredCollection;
    
    if ((recentlyViewed != null) && (recentlyViewed.size() > 0))
    {
    
         
      List<String> excludedProducts = new ArrayList();
      if (pExtraParameters != null)
      {
        Object excludeParameters = pExtraParameters.get("exclude");
        
        System.out.println("excludeParameter== "+excludeParameters);
        
        if ((excludeParameters instanceof Collection)) {
          if ((((List)excludeParameters).size() > 0) && ((((List)excludeParameters).get(0) instanceof RepositoryItem)))
          {
            List<RepositoryItem> tempList = (List)excludeParameters;
            for (RepositoryItem ri : tempList)
            {
             
                vlogDebug("Adding product " + ri.getRepositoryId() + " to the excluded products list.");
              
              excludedProducts.add(ri.getRepositoryId());
            }
          }
          else if ((((List)excludeParameters).size() > 0) && ((((List)excludeParameters).get(0) instanceof String)))
          {
            excludedProducts = (List)excludeParameters;
            
              for (String productId : excludedProducts) {
                vlogDebug(productId + " has been added to excluded products list.");
              }
            
          }
        }
        
        
        if ((excludeParameters instanceof String))
        {
          excludedProducts.add((String)excludeParameters);
          
            vlogDebug((String)excludeParameters + " has been added to the excluded products list.");
          
        }
        
        
        
        String listSize = (String)pExtraParameters.get("size");
        
        System.out.println("listSize===="+listSize);
        
        
        
        if (!StringUtils.isEmpty(listSize)) {
          try
          {
            int size = Integer.parseInt(listSize);
            setMaxProductsToDisplay(size);           
              vlogDebug("The value of the size parameter '" + size + "' has been set as the " + "maximum number of products to display in the recently viewed list.");            
          }
          catch (NumberFormatException nfe)
          {         
              vlogError("The 'size' parameter is not a number. ", nfe);           
          }
        }
                
      }
      
      
      
      
      try
      {
        if ((getRecentlyViewedTools().removeNonExistentProducts(recentlyViewed, pProfile)) ) {
          vlogDebug("Non-existent product(s) have been removed from the repository.");
        }
      }
      catch (RepositoryException re)
      {      
          vlogError("There was a problem removing non-existent products from profile " + pProfile.getRepositoryId() + "\nre");       
      }
      
      
      try
      {
        if ((getRecentlyViewedTools().removeExpiredProducts(recentlyViewed, pProfile))) {
          vlogDebug("Expired product(s) have been removed from the repository.");
        }
      }
      catch (RepositoryException re)
      {
        if (isLoggingError()) {
          logError("There was a problem removing expired products from profile " + pProfile.getRepositoryId() + "\nre");
        }
      }
      
      
      String recentlyViewedProductsPropertyName = "recentlyViewedProducts";//((StorePropertyManager)getProfileTools().getPropertyManager()).getRecentlyViewedProductsPropertyName();      
      recentlyViewed = (List)pProfile.getPropertyValue(recentlyViewedProductsPropertyName);
      System.out.println("recentlyViewed from profile === "+recentlyViewed);


      String recentlyViewedProductProductPropertyName = "product";//((StorePropertyManager)getProfileTools().getPropertyManager()).getProductPropertyName();
      
      String recentlyViewedProductSiteIdPropertyName = "siteId";//((StorePropertyManager)getProfileTools().getPropertyManager()).getSiteIdPropertyName();
      for (int i = 0; i < recentlyViewed.size(); i++)
      {
        RepositoryItem product = (RepositoryItem)((RepositoryItem)recentlyViewed.get(i)).getPropertyValue(recentlyViewedProductProductPropertyName);
        
        String siteId = (String)((RepositoryItem)recentlyViewed.get(i)).getPropertyValue(recentlyViewedProductSiteIdPropertyName);
        if (siteId == null) {
          siteId = "";
        }
        if ((excludedProducts != null) && 
          (excludedProducts.contains(product.getRepositoryId())))
        {          
            vlogDebug(product.getRepositoryId() + " is in the excluded list and has not been included in the filtered list.");         
        }
   
        else
        {
         
          if ((product != null))// && (getCatalogTools().findProduct(product.getRepositoryId()) == null))
					{
					  if (isLoggingDebug()) {
					    logDebug("Product " + product.getRepositoryId() + " cannot be found so will not be included in the filtered list.");
					  }
					 // continue;
					}
         
               
            resultCollection.add(recentlyViewed.get(i));
            if (resultCollection.size() == getMaxProductsToDisplay())
            {
              if (!isLoggingDebug()) {
                break;
              }
              logDebug("The filtered list size has reached its maximum capacity '" + getMaxProductsToDisplay() + "'. Returning filtered list."); break;
            }
          
        }
      }
    }
    System.out.println(resultCollection);
    return resultCollection;
  }
}

