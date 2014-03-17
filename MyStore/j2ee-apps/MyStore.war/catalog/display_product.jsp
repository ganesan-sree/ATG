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
<html>
<head>





</head>
<body>
<div id="main_container">

<div class="center_content">


		<div class="oferta">


                	

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
						                 <div class="product_title">  <dsp:a href="display_sku.jsp"><dsp:param name="product_id" param="element.repositoryId"/><dsp:valueof param="element.displayName"/></dsp:a></div>
						                 <div class="product_img">
						                 	  <dsp:a href="display_sku.jsp">
												<dsp:param name="product_id" param="element.repositoryId"/>
												
												<img src="<dsp:valueof param="element.smallImage.url"/>" />
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

</div>

</dsp:page>
