 <%@ taglib uri="/dspTaglib" prefix="dsp" %>
<%@ taglib uri="/fenderTaglib" prefix="fender" %>

<%@ page import="atg.servlet.*" %>
<dsp:page>
<dsp:importbean bean="/atg/commerce/order/purchase/SaveOrderFormHandler"/>
<dsp:importbean bean="/atg/commerce/ShoppingCart"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>
<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
<dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler"/>
 <div class="right_content">
 
      <div class="title_box">Search</div>  
     <div class="border_box">
		<input type="text" name="newsletter" class="newsletter_input" value="keyword"/>
        <a href="#" class="join">search</a>
     </div>  
     

     
 
   		<div class="shopping_cart">
        	<div class="title_box">Shopping cart</div>

            
            <div class="cart_details">




	  
	  	<dsp:droplet name="IsEmpty">
	  		<dsp:param name="value" bean="ShoppingCart.saved"/>
	  		<dsp:oparam name="true">
		  		<dsp:droplet name="atg/dynamo/droplet/ForEach">
				<dsp:param name="array" bean="ShoppingCart.current.commerceItems" />
				<dsp:param name="elementName" value="CommerceItem"/>
				<dsp:oparam name="outputStart">
		        </dsp:oparam>
			    <dsp:oparam name="output">
				<dsp:valueof param="CommerceItem.auxiliaryData.catalogRef.displayName"/>
				<dsp:valueof param="CommerceItem.quantity"/><br>
			    </dsp:oparam>
		 	    <dsp:oparam name="outputEnd">
	            <span class="border_cart"></span>
			     </dsp:oparam>
			     <dsp:oparam name="outputEnd">
	   	            Total: <span class="price">			<dsp:valueof bean="ShoppingCart.current.priceInfo.rawSubtotal" converter="currency"/> </span>
	   	         </dsp:oparam>
			     	            
		       </dsp:droplet>
	  		</dsp:oparam>
	  		<dsp:oparam name="false">
	  			<dsp:form action="../catalog/cart_items.jsp" method="post">
	  				<dsp:select bean="ShoppingCart.handlerOrderId">
	  					<dsp:droplet name="ForEach">
	  						<dsp:param name="array" bean="ShoppingCart.saved"/>
	  						<dsp:oparam name="output">
	  							<dsp:option paramvalue="element.id"><dsp:valueof param="element.description"/></dsp:option>
	  						</dsp:oparam>
	  						
	  					</dsp:droplet>
	  				</dsp:select>
	  				<dsp:input bean="ShoppingCart.switch" value="Switch" type="submit"/>
	  						<dsp:input type="submit" bean="ShoppingCart.delete" value="Delete"/>
	  			</dsp:form>
	  		</dsp:oparam>
	  	</dsp:droplet>
	
	       
	





            </div>
            
            <div class="cart_icon"><a href="cart_items.jsp" title=""><img src="/ff/css/tool_shop/images/shoppingcart.png" alt="" title="" width="35" height="35" border="0" /></a></div>
        
        </div>

   
   
     <div class="title_box">What’s new</div>  
     <div class="border_box">
         <div class="product_title"><a href="details.html">Motorola 156 MX-VL</a></div>
         <div class="product_img"><a href="details.html"><img src="/ff/css/tool_shop/images/p2.jpg" alt="" title="" border="0" /></a></div>
         <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
     </div>  
     
     
     
    <div class="title_box">Brand</div>

    
        
     
     <div class="banner_adds">
     
     <a href="#"><img src="/ff/css/tool_shop/images/bann1.jpg" alt="" title="" border="0" /></a>
     </div>        
     
   </div><!-- end of right content -->   
</dsp:page>
