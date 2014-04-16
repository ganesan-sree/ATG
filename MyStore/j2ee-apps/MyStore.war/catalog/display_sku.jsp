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
    
<html>
<head>





</head>
<body>
<div id="main_container">
	<dsp:include src="category.jsp" flush="true"/>
<div class="center_content">


	


   	<div class="center_title_bar">Product Display</div>

		
						
							<dsp:droplet name="ProductLookup">
							
								<dsp:param name="id" param="itemId"/>
								<dsp:oparam name="output">
									<dsp:droplet name="ForEach">
										<dsp:param name="array" param="element.childSKUs"/>
										<dsp:oparam name="output">
										
													<dsp:getvalueof id="id" param="product_id" idtype="java.lang.String">
													<dsp:form method="post" action="cart_items.jsp">
													<dsp:input type="hidden" bean="CartModifierFormHandler.successURL" value="cart_items.jsp"/>
													<dsp:input type="hidden" bean="CartModifierFormHandler.errorURL" value="display_sku.jsp"/>
													<dsp:input type="hidden" bean="CartModifierFormHandler.productId" paramvalue="itemId"/>
													<dsp:input type="hidden" bean="CartModifierFormHandler.catalogRefIds" paramvalue="element.repositoryId"/>
													<dsp:input type="hidden" bean="CartModifierFormHandler.quantity" value="1"/>
													
													<div class="prod_box">

											            <div class="center_prod_box">    
											                 <div class="product_title">  <dsp:a href="#"><dsp:valueof param="element.displayName"/></dsp:a></div>
											                 <div class="product_img">
											                 	  <dsp:a href="#">
																	<dsp:param name="product_id" param="element.repositoryId"/>																
																	<img src="/my/<dsp:valueof param="element.smallImage.url"/>" />
																  </dsp:a>  
											                 </div>
											                 <div class="prod_price"><span class="reduce"><dsp:valueof param="element.listPrice" converter="currency"/></span> </div>                        
											            </div>
											
											           
											            <div class="prod_details_tab">
											            <dsp:input iclass="prod_details" type="submit" bean="CartModifierFormHandler.addItemToOrder" value="Add To Cart"/>         
											                        
											            </div>                     
											        </div>											
													
													
									
													
													
													
													</dsp:form>
													</dsp:getvalueof>
											
										</dsp:oparam>
										<dsp:oparam name="empty">
											Empty
										</dsp:oparam>
									</dsp:droplet>
								</dsp:oparam>
								<dsp:oparam name="empty">
									<h2><font color="red">No Products Found with this id</font></h2>
								</dsp:oparam>
							</dsp:droplet>
						

	</div>
	

</div>

</dsp:page>
