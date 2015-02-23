package cts.commerce.catalog.recentlyviewed;

import atg.commerce.profile.CommerceProfileTools;
import atg.multisite.SiteGroupManager;
import atg.nucleus.GenericService;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.service.util.CurrentDate;
import atg.userprofiling.ProfileTools;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;



public class RecentlyViewedTools
  extends GenericService
{
  public static final String CLASS_VERSION = "$Id: //hosting-blueprint/B2CBlueprint/version/10.2/EStore/src/atg/projects/store/profile/recentlyviewed/RecentlyViewedTools.java#3 $$Change: 788278 $";
  public static final String CURRENT_SITE_SCOPE = "current";
  public static final String ALL_SITE_SCOPE = "all";
  protected SiteGroupManager mSiteGroupManager;
  
  protected SiteGroupManager getSiteGroupManager()
  {
    return this.mSiteGroupManager;
  }
  
  public void setSiteGroupManager(SiteGroupManager pSiteGroupManager)
  {
    this.mSiteGroupManager = pSiteGroupManager;
  }
  
  private CommerceProfileTools mProfileTools = null;
  
  public CommerceProfileTools getProfileTools()
  {
    return this.mProfileTools;
  }
  
  public void setProfileTools(CommerceProfileTools pProfileTools)
  {
    this.mProfileTools = pProfileTools;
  }
  
  private int mRecentlyViewedSize = -1;
  
  public int getRecentlyViewedSize()
  {
    return this.mRecentlyViewedSize;
  }
  
  public void setRecentlyViewedSize(int pRecentlyViewedSize)
  {
    if (pRecentlyViewedSize == -1) {
      setListSizeInfinite(true);
    } else {
      setListSizeInfinite(false);
    }
    this.mRecentlyViewedSize = pRecentlyViewedSize;
  }
  
  private boolean mListSizeInfinite = true;
  
  public void setListSizeInfinite(boolean pListSizeInfinite)
  {
    this.mListSizeInfinite = pListSizeInfinite;
  }
  
  public boolean isListSizeInfinite()
  {
    return this.mListSizeInfinite;
  }
  
  private int mExpiryPeriod = 0;
  
  public void setExpiryPeriod(int pExpiryPeriod)
  {
    this.mExpiryPeriod = pExpiryPeriod;
  }
  
  public int getExpiryPeriod()
  {
    return this.mExpiryPeriod;
  }
  
  private String mSiteScope = "all";
  
  public void setSiteScope(String pSiteScope)
  {
    this.mSiteScope = pSiteScope;
  }
  
  public String getSiteScope()
  {
    return this.mSiteScope;
  }
  

  private CurrentDate mCurrentDate;
  

  
  public void setCurrentDate(CurrentDate pCurrentDate)
  {
    this.mCurrentDate = pCurrentDate;
  }
  
  public CurrentDate getCurrentDate()
  {
    return this.mCurrentDate;
  }
  
  public void addProduct(RepositoryItem pItem, RepositoryItem pProfile, String pSiteId)
    throws RepositoryException
  {
  	
   
    List<RepositoryItem> recentlyViewedProducts = getProductsForUpdate(pProfile);
    if (removeExpiredProducts(recentlyViewedProducts, pProfile))
    {
     
        vlogDebug("Expired products have been removed from profile " + pProfile.getRepositoryId() + " recently viewed list.");
      
      recentlyViewedProducts = getProductsForUpdate(pProfile);
    }
    if (removeNonExistentProducts(recentlyViewedProducts, pProfile))
    {
     
      	vlogDebug("Non-existent product(s) have been removed from profile " + pProfile.getRepositoryId() + " recently viewed list.");
     
      recentlyViewedProducts = getProductsForUpdate(pProfile);
    }
    RepositoryItem newProduct = createRecentlyViewedProduct(pItem, pProfile, pSiteId);
    if ((recentlyViewedProducts != null) && (recentlyViewedProducts.size() > 0))
    {
      RepositoryItem existingDuplicateProduct = getDuplicateRecentlyViewedProduct(pItem, recentlyViewedProducts, pSiteId);
      if (existingDuplicateProduct != null)
      {
       
      	vlogDebug(pItem.getRepositoryId() + " already exists in profile " + pProfile.getRepositoryId() + " recently viewed list and will be removed.");
     
        getProductsForUpdate(pProfile).remove(existingDuplicateProduct);
        
        recentlyViewedProducts = getProductsForUpdate(pProfile);
      }
    }
    if (recentlyViewedProducts != null)
    {
      int recentlyViewedProductsSize = recentlyViewedProducts.size();
     
      vlogDebug("There are " + recentlyViewedProductsSize + " products in profile " + pProfile.getRepositoryId() + " recently viewed list.");
    
      List<RepositoryItem> recentlyViewedBySiteScope = null;
      String recentlyViewedProductSiteIdPropertyName;
      if (recentlyViewedProductsSize > 0)
      {
        recentlyViewedBySiteScope = new ArrayList();
        

        recentlyViewedProductSiteIdPropertyName = "siteId";//((StorePropertyManager)getProfileTools().getPropertyManager()).getSiteIdPropertyName();
       
        vlogDebug("Building conceptual list of products based on siteScope '" + getSiteScope() + "' current site '" + pSiteId + "' and each recently viewed product's siteId");
        
        for (RepositoryItem recentlyViewedProduct : recentlyViewedProducts)
        {
          String siteId = (String)recentlyViewedProduct.getPropertyValue(recentlyViewedProductSiteIdPropertyName);
          if (isSiteInScope(siteId, pSiteId))
          {
            recentlyViewedBySiteScope.add(recentlyViewedProduct);
           
            vlogDebug("recentlyViewedProduct: " + recentlyViewedProduct.getRepositoryId() + " siteId value has a valid siteScope, adding to conceptual list.");
            
          }
          else if ((getSiteScope() != null) && (getSiteGroupManager().isShareableTypeRegistered(getSiteScope())))
          {
           
          	vlogDebug("recentlyViewedProduct: " + recentlyViewedProduct.getRepositoryId() + " siteId value is not in the " + getSiteScope() + " site group but will still be " + "added to the user's recentlyViewedProduct list as part of a seperate conceptual list.");
            
          }
        }
      }
      if ((recentlyViewedProductsSize == 0) || ((recentlyViewedBySiteScope != null) && (recentlyViewedBySiteScope.size() < getRecentlyViewedSize())) || (isListSizeInfinite()))
      {
        recentlyViewedProducts.add(0, newProduct);
       
        vlogDebug("Either user " + pProfile.getRepositoryId() + " recently viewed list is empty or " + "the conceptual product by siteScope list is less than the maximum valid list size. " + " Adding " + newProduct.getRepositoryId() + " to recently viewed list.");
        
      }
      else if ((recentlyViewedBySiteScope != null) && (recentlyViewedBySiteScope.size() == getRecentlyViewedSize()))
      {
        getProductsForUpdate(pProfile).remove(recentlyViewedBySiteScope.get(recentlyViewedBySiteScope.size() - 1));
        
        recentlyViewedProducts = getProductsForUpdate(pProfile);
        
        recentlyViewedProducts.add(0, newProduct);
        
        vlogDebug("The conceptual product by siteScope list is equal to the maximum valid list size. The first item (defined by siteScope) has been removed and " + newProduct.getRepositoryId() + " has been added to recently viewed list.");
        
      }
      else if ((recentlyViewedBySiteScope != null) && (recentlyViewedBySiteScope.size() > getRecentlyViewedSize()))
      {
        int numItemsToRemove = recentlyViewedBySiteScope.size() - getRecentlyViewedSize() + 1;
        for (int i = 1; i <= numItemsToRemove; i++) {
          getProductsForUpdate(pProfile).remove(recentlyViewedBySiteScope.get(recentlyViewedBySiteScope.size() - i));
        }
        recentlyViewedProducts = getProductsForUpdate(pProfile);
        
        recentlyViewedProducts.add(0, newProduct);
      
        vlogDebug("The conceptual product by siteScope list is greater than the maximum valid list size. The oldest products have been removed from the list (defined by siteScope) and " + newProduct.getRepositoryId() + " has been added to recently viewed list.");
        
      }
    }
  }
  
  public boolean removeNonExistentProducts(List<RepositoryItem> pRecentlyViewed, RepositoryItem pProfile)
    throws RepositoryException
  {
    boolean productsRemoved = false;
    String recentlyViewedProductProductName;
    if ((pRecentlyViewed != null) && (pRecentlyViewed.size() > 0))
    {
      recentlyViewedProductProductName = "product";//((StorePropertyManager)getProfileTools().getPropertyManager()).getProductPropertyName();
      for (RepositoryItem recentlyViewedProduct : pRecentlyViewed)
      {
        RepositoryItem product = (RepositoryItem)recentlyViewedProduct.getPropertyValue(recentlyViewedProductProductName);
        if (product == null)
        {
          if (isLoggingDebug()) {
            logDebug(recentlyViewedProduct.getRepositoryId() + " product property is null, removing from repository.");
          }
          getProductsForUpdate(pProfile).remove(recentlyViewedProduct);
          productsRemoved = true;
        }
      }
    }
    return productsRemoved;
  }
  
  public boolean isSiteInScope(String pRecentlyViewedProductSiteId, String pSiteId)
  {
    String siteId = "";
    String recentlyViewedProductSiteId = "";
    if (pSiteId != null) {
      siteId = pSiteId;
    }
    if (pRecentlyViewedProductSiteId != null) {
      recentlyViewedProductSiteId = pRecentlyViewedProductSiteId;
    }
    if ((getSiteScope() != null) && (getSiteScope().equals("current")) && (siteId.equals(recentlyViewedProductSiteId)))
    {
      if (isLoggingDebug()) {
        logDebug("siteScope is 'current', the current site id is " + siteId + " and the recentlyViewedProduct siteId is " + recentlyViewedProductSiteId + " returning 'true'.");
      }
      return true;
    }
    if ((getSiteScope() != null) && (getSiteGroupManager().isShareableTypeRegistered(getSiteScope())))
    {
      Set<String> siteGroup = (Set)getSiteGroupManager().getSharingSiteIds(siteId, getSiteScope());
      if ((siteGroup != null) && (siteGroup.contains(recentlyViewedProductSiteId)))
      {
        if (isLoggingDebug()) {
          logDebug("siteScope '" + getSiteScope() + "' is a registered shareable type, " + "the current site id is " + siteId + " and the recentlyViewedProduct siteId, " + recentlyViewedProductSiteId + " is in the shareable type site group, returning 'true'.");
        }
        return true;
      }
    }
    else if ((getSiteScope() != null) && (getSiteScope().equals("all")))
    {
      if (isLoggingDebug()) {
        logDebug("siteScope is 'all',  returning 'true'.");
      }
      return true;
    }
    if (isLoggingDebug()) {
      logDebug("siteScope " + getSiteScope() + " is invalid, returning 'false'.");
    }
    return false;
  }
  
  public MutableRepositoryItem createRecentlyViewedProduct(RepositoryItem pProduct, RepositoryItem pProfile, String pSiteId)
    throws RepositoryException
  {
    MutableRepository profileRepository = getProfileTools().getProfileRepository();
    

    String recentlyViewedProductItemDescriptorName = "recentlyViewedProduct";//((StorePropertyManager)getProfileTools().getPropertyManager()).getRecentlyViewedProductItemDescriptorName();
    
    String recentlyViewedProductProductName = "product";//((StorePropertyManager)getProfileTools().getPropertyManager()).getProductPropertyName();
    
    String recentlyViewedProductSiteIdName = "siteId";//((StorePropertyManager)getProfileTools().getPropertyManager()).getSiteIdPropertyName();
    
    String recentlyViewedProductTimeStampName = "timestamp";//((StorePropertyManager)getProfileTools().getPropertyManager()).getTimeStampPropertyName();
    

    MutableRepositoryItem item = profileRepository.createItem(recentlyViewedProductItemDescriptorName);
    
    item.setPropertyValue(recentlyViewedProductProductName, pProduct);
    item.setPropertyValue(recentlyViewedProductSiteIdName, pSiteId);
    

    CurrentDate cd = getCurrentDate();
    Date currentDate = cd.getTimeAsDate();
    item.setPropertyValue(recentlyViewedProductTimeStampName, new Timestamp(currentDate.getTime()));
    if (isLoggingDebug()) {
      logDebug("New recentlyViewedProduct create with product: " + pProduct.getRepositoryId() + ", siteId: " + pSiteId + " and current time: " + currentDate.getTime());
    }
    if (!pProfile.isTransient())
    {
    	
      if (isLoggingDebug()) {
        logDebug("The current user " + pProfile.getRepositoryId() + " is logged in, adding new recentlyViewedProduct to the repository.");
      }
      addRecentlyViewedProduct(item);
    }
    else{
    	System.out.println("transient=======");
    }
    return item;
  }
  
  public void addRecentlyViewedProduct(MutableRepositoryItem pRecentlyViewedProduct)
    throws RepositoryException
  {
  	System.out.println("***************"+pRecentlyViewedProduct);
    MutableRepository profileRepository = getProfileTools().getProfileRepository();
    profileRepository.addItem(pRecentlyViewedProduct);
  }
  
  public void addProductsToList(List<RepositoryItem> pProducts, RepositoryItem pProfile)
    throws RepositoryException
  {
    String recentlyViewedProductProductName = "product";//((StorePropertyManager)getProfileTools().getPropertyManager()).getProductPropertyName();
    
    String recentlyViewedProductSiteIdName = "siteId";//((StorePropertyManager)getProfileTools().getPropertyManager()).getSiteIdPropertyName();
    for (int i = pProducts.size() - 1; i >= 0; i--)
    {
      RepositoryItem product = (RepositoryItem)pProducts.get(i);
      String siteId = (String)product.getPropertyValue(recentlyViewedProductSiteIdName);
      addProduct((RepositoryItem)product.getPropertyValue(recentlyViewedProductProductName), pProfile, siteId);
    }
  }
  
  public List<RepositoryItem> getProductsForUpdate(RepositoryItem pProfile)
    throws RepositoryException
  {
    MutableRepository mutRep = getProfileTools().getProfileRepository();
    if (isLoggingDebug()) {
      logDebug("Getting a modifiable recently viewed list for user: " + pProfile.getRepositoryId());
    }
    String recentlyViewedProductsPropertyName = "recentlyViewedProducts";//((StorePropertyManager)getProfileTools().getPropertyManager()).getRecentlyViewedProductsPropertyName();
    

    String recentlyViewedProductItemDescriptorName ="recentlyViewedProduct";// ((StorePropertyManager)getProfileTools().getPropertyManager()).getRecentlyViewedProductItemDescriptorName();
    if (pProfile.getPropertyValue(recentlyViewedProductsPropertyName) == null) {
    	
      getProfileTools().updateProperty(recentlyViewedProductsPropertyName, new ArrayList(1), pProfile);
    }
    MutableRepositoryItem mutProfile = getProfileTools().getProfileItem(pProfile.getRepositoryId());
    
    Object value = mutProfile.getPropertyValue(recentlyViewedProductsPropertyName);
    List<RepositoryItem> recentlyViewed = null;
    if ((value instanceof Collection))
    {
      recentlyViewed = (List)value;
    }
    else
    {
      recentlyViewed = new ArrayList();
      
      mutProfile.setPropertyValue(recentlyViewedProductsPropertyName, recentlyViewed);
    }
    
    System.out.println(recentlyViewed);
    return recentlyViewed;
  }
  
  public List<RepositoryItem> getProducts(RepositoryItem pProfile)
  {
    if (isLoggingDebug()) {
      logDebug("Getting a non-modifiable recently viewed list for user: " + pProfile.getRepositoryId());
    }
    List<RepositoryItem> list = null;
    if (pProfile != null)
    {
      String recentlyViewedProductsPropertyName = "product";//((StorePropertyManager)getProfileTools().getPropertyManager()).getRecentlyViewedProductsPropertyName();
      


      list = (List)pProfile.getPropertyValue(recentlyViewedProductsPropertyName);
    }
    return list;
  }
  
  public RepositoryItem getDuplicateRecentlyViewedProduct(RepositoryItem pProduct, List<RepositoryItem> pRecentlyViewed, String pSiteId)
  {
    String siteId = pSiteId != null ? pSiteId : "";
    

    String recentlyViewedProductProductName = "product";//((StorePropertyManager)getProfileTools().getPropertyManager()).getProductPropertyName();
    

    String recentlyViewedProductSiteIdName = "siteId";//((StorePropertyManager)getProfileTools().getPropertyManager()).getSiteIdPropertyName();
    for (RepositoryItem recentlyViewedItem : pRecentlyViewed)
    {
      RepositoryItem existingItem = (RepositoryItem)recentlyViewedItem.getPropertyValue(recentlyViewedProductProductName);
      
      String existingItemSiteId = (String)recentlyViewedItem.getPropertyValue(recentlyViewedProductSiteIdName);
      if (existingItemSiteId == null) {
        existingItemSiteId = "";
      }
      if (pProduct.getRepositoryId().equals(existingItem.getRepositoryId())) {
        if (siteId.equals(existingItemSiteId))
        {
          if (isLoggingDebug()) {
            logDebug("Returning " + existingItem.getRepositoryId() + " as it is a duplicate product.");
          }
          return recentlyViewedItem;
        }
      }
    }
    if (isLoggingDebug()) {
      logDebug(pProduct.getRepositoryId() + " is not a duplicate product. Returning null.");
    }
    return null;
  }
  
  public boolean removeExpiredProducts(List<RepositoryItem> pRecentlyViewed, RepositoryItem pProfile)
    throws RepositoryException
  {
    boolean productsRemoved = false;
    for (RepositoryItem recentlyViewedProduct : pRecentlyViewed) {
      if (isProductExpired(recentlyViewedProduct))
      {
        if (isLoggingDebug()) {
          logDebug(recentlyViewedProduct.getRepositoryId() + " is now expired, removing from repository.");
        }
        getProductsForUpdate(pProfile).remove(recentlyViewedProduct);
        productsRemoved = true;
      }
    }
    return productsRemoved;
  }
  
  public boolean isProductExpired(RepositoryItem pProduct)
  {
    if (getExpiryPeriod() <= 0)
    {
      if (isLoggingDebug()) {
        logDebug("Products will never expire as expiryPeriod value is 0, returning 'false'.");
      }
      return false;
    }
    String recentlyViewedProductTimeStampName = "timestamp";//((StorePropertyManager)getProfileTools().getPropertyManager()).getTimeStampPropertyName();
    


    Timestamp itemTimeStamp = (Timestamp)pProduct.getPropertyValue(recentlyViewedProductTimeStampName);
    

    CurrentDate cd = getCurrentDate();
    Date currentDate = cd.getTimeAsDate();
    

    long diff = currentDate.getTime() - itemTimeStamp.getTime();
    
    long diffSeconds = diff / 1000L;
    
    long expiryPeriodSeconds = getExpiryPeriod() * 3600;
    if (diffSeconds > expiryPeriodSeconds)
    {
      if (isLoggingDebug()) {
        logDebug("The product has expired, returning 'true'.");
      }
      return true;
    }
    if (isLoggingDebug()) {
      logDebug("The product has not expired, returning 'false'.");
    }
    return false;
  }
}

