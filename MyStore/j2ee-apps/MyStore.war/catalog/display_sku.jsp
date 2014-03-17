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
	
<div class="center_content">


		<div class="oferta">
                	<img src="/ff/css/tool_shop/images/p1.png" width="165" height="113" border="0" class="oferta_img" alt="" title="" />

                	

                </div>

   
   



   	<div class="center_title_bar">Product Display</div>

		
						
							<dsp:droplet name="ProductLookup">
							
								<dsp:param name="id" param="product_id"/>
								<dsp:oparam name="output">
									<dsp:droplet name="ForEach">
										<dsp:param name="array" param="element.childSKUs"/>
										<dsp:oparam name="output">
										
													<dsp:getvalueof id="id" param="product_id" idtype="java.lang.String">
													<dsp:form method="post" action="cart_items.jsp">
													<dsp:input type="hidden" bean="CartModifierFormHandler.successURL" value="cart_items.jsp"/>
													<dsp:input type="hidden" bean="CartModifierFormHandler.errorURL" value="display_sku.jsp"/>
													<dsp:input type="hidden" bean="CartModifierFormHandler.productId" paramvalue="product_id"/>
													<dsp:input type="hidden" bean="CartModifierFormHandler.catalogRefIds" paramvalue="element.repositoryId"/>
													<dsp:input type="hidden" bean="CartModifierFormHandler.quantity" value="1"/>
													
													<div class="prod_box">

											            <div class="center_prod_box">    
											                 <div class="product_title">  <dsp:a href="#"><dsp:valueof param="element.displayName"/></dsp:a></div>
											                 <div class="product_img">
											                 	  <dsp:a href="#">
																	<dsp:param name="product_id" param="element.repositoryId"/>
																	
																	<img src="/ff/<dsp:valueof param="element.smallImage.url"/>" />
																  </dsp:a>  
											                 </div>
											                 <div class="prod_price"><span class="reduce"><dsp:valueof param="element.listPrice" converter="currency"/></span> </div>                        
											            </div>
											
											           
											            <div class="prod_details_tab">
											            <dsp:input iclass="prod_details" type="submit" bean="CartModifierFormHandler.addItemToOrder" value="Add To Cart"/>         
											            <a href="details.html" class="prod_details">Details</a>            
											            </div>                     
											        </div>											
													
												<!--  	<br>
															
													<dsp:getvalueof param="sku.skuRating.totalCount" id="rateCount" idtype="java.lang.String">
														<dsp:getvalueof param="sku.skuRating.totalRating" id="rating" idtype="java.lang.String">
															<dsp:getvalueof param="sku.repositoryId" id="skuId" idtype="java.lang.String">
															<% int count=0;
																int rat=0;
																if(rateCount!=null && rating!=null)
																{
																	count=Integer.parseInt(rateCount);
																	rat=Integer.parseInt(rating);
																}
																int div=0;
																if(count>0)
																div=(rat/count);
																for(int i=1;i<=div;i++) { %>
																
																	<img height=15 width=15 src="/ff/img/rating/y.gif" alt="<%=i%>" id="sku_<%=i%>" onmouseover="showIt('sku','<%=i%>','<%=div%>','5');" onmouseout="showOriginal('<%=div%>','5');" onclick="submitRating('sku','<%=i%>','5','<%=skuId%>');"   />
																<% }
																
																for(int j=div+1;j<=5;j++) { %>
																	<img height=15 width=15 src="/ff/img/rating/w.gif" alt="<%=j%>" id="sku_<%=j%>" onmouseover="showIt('sku','<%=j%>','<%=div%>','5');" onmouseout="showOriginal('<%=div%>','5');" onclick="submitRating('sku','<%=j%>','5','<%=skuId%>');" /> <%
																} 
															%>
															<dsp:input type="hidden" bean="CartModifierFormHandler.productIds" paramvalue="product_id"/>
															<dsp:input type="hidden" bean="CartModifierFormHandler.catalogRefIds" paramvalue="sku.repositoryId"/>
															<dsp:input type="hidden" bean="CartModifierFormHandler.quantity" value="1"/>
															<dsp:input type="submit" bean="CartModifierFormHandler.addItemToOrder" value="Add To Cart"/>
															</dsp:getvalueof>
														</dsp:getvalueof>
													</dsp:getvalueof> -->
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
	 <dsp:include src="/ff/common/rightside.jsp" flush="true"/>
	 <dsp:include src="/ff/common/footer.jsp" flush="true"/>

</div>

</dsp:page>
