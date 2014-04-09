<%@ taglib uri="/dsp" prefix="dsp"%>


<dsp:page>

<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>

<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:importbean bean="/ff/user/FFUserProfileFormHandler"/>
<dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
 <dsp:importbean bean="/atg/commerce/catalog/CategoryLookup"/>
  <dsp:importbean bean="/atg/commerce/catalog/ProductLookup"/>
    <dsp:importbean bean="/atg/commerce/catalog/SKULookup"/>
    <dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler"/>
    <dsp:importbean bean="/atg/commerce/ShoppingCart"/>
	<div class="prod_box">

	    <div class="center_prod_box">    
	         <div class="product_title">  
	         	<dsp:a href="/ff/catalog/display_sku.jsp"><dsp:valueof param="data.auxiliaryData.catalogRef.displayName"/></dsp:a></div>
				<div class="product_img">
				  <dsp:a href="/ff/catalog/display_sku.jsp">
					<dsp:param name="product_id" param="data.auxiliaryData.catalogRef.repositoryId"/>
					<img src="/ff/<dsp:valueof param="data.auxiliaryData.catalogRef.smallImage.url"/>" />
				  </dsp:a>  
				</div>
				Product id is <dsp:valueof param="data.productId"/>
				<div class="prod_price"><span class="price"><dsp:valueof param="data.auxiliaryData.catalogRef.listPrice"/></span>
				X <dsp:valueof param="data.quantity"/>
				= <span class="price"><dsp:valueof param="data.priceInfo.amount"/></span></div>                        
				</div>
				<div class="prod_details_tab">
				  <dsp:input iclass="prod_details" bean="CartModifierFormHandler.removalCatalogRefIds" paramvalue="data.auxiliaryData.catalogRef.repositoryId" type="checkbox"> Remove </dsp:input>          
					<dsp:input iclass="prod_details" type="submit" value="Update" bean="CartModifierFormHandler.setOrderByCommerceId" />            
				</div>                     
	 </div>
	 </dsp:page>