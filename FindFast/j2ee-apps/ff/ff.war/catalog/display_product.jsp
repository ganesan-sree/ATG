<%@ taglib uri="/dspTaglib" prefix="dsp"%>


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
<html>
<head>

<link rel="stylesheet" type="text/css" href="/ff/css/tool_shop/style.css" />
<SCRIPT LANGUAGE="JavaScript" SRC="../js/country.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" SRC="../js/calendar.js"></SCRIPT>



</head>
<body>
<div id="main_container">
	 <dsp:include src="/ff/common/header.jsp" flush="true"/>
	 <dsp:include src="/ff/common/category.jsp" flush="true"/>
<div class="center_content">


		<div class="oferta">
                	<img src="/ff/css/tool_shop/images/p1.png" width="165" height="113" border="0" class="oferta_img" alt="" title="" />

                	
                    <div class="oferta_details">
                            <div class="oferta_title">Power Tools BST18XN Cordless</div>
                            <div class="oferta_text">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            </div>
                            <a href="details.html" class="prod_buy">details</a>
                    </div>
                </div>

   
   



   	<div class="center_title_bar">Product Display</div>

		<dsp:droplet name="CategoryLookup">
			<dsp:param name="id" param="category_id"/>
			<dsp:oparam name="output">
				<dsp:droplet name="ForEach">
					<dsp:param name="array" param="element.fixedChildProducts"/>
						<dsp:oparam name="output">
												
								<div class="prod_box">

						            <div class="center_prod_box">    
						                 <div class="product_title">  <dsp:a href="/ff/catalog/display_sku.jsp"><dsp:param name="product_id" param="element.repositoryId"/><dsp:valueof param="element.displayName"/></dsp:a></div>
						                 <div class="product_img">
						                 	  <dsp:a href="/ff/catalog/display_sku.jsp">
												<dsp:param name="product_id" param="element.repositoryId"/>
												
												<img src="/ff/<dsp:valueof param="element.smallImage.url"/>" />
											  </dsp:a>  
						                 </div>
						                 <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>                        
						            </div>
						
						           
						            <div class="prod_details_tab">
						            <a href="buy.html" class="prod_buy">Add to Cart</a>          
						            <a href="details.html" class="prod_details">Details</a>            
						            </div>                     
						        </div>
								
								
						</dsp:oparam>
						<dsp:oparam name="empty">
							<h2><font color="red">No Products Found </font></h2>
						</dsp:oparam>
				</dsp:droplet>
			</dsp:oparam>
			<dsp:oparam name="empty">
				<h2><font color="red">No Category Found </font></h2>
			</dsp:oparam>
		</dsp:droplet>

	</div>
	 <dsp:include src="/ff/common/rightside.jsp" flush="true"/>
	 <dsp:include src="/ff/common/footer.jsp" flush="true"/>

</div>

</dsp:page>
