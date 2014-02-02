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
    <dsp:importbean bean="/atg/commerce/catalog/SKULookup"/>
    <dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler"/>
    <dsp:importbean bean="/atg/commerce/order/purchase/SaveOrderFormHandler"/>
    <dsp:importbean bean="/atg/commerce/ShoppingCart"/>
    
<html>
<head>

<link rel="stylesheet" type="text/css" href="/ff/css/tool_shop/style.css" />
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/country.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/calendar.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/maxrating.js"></SCRIPT>



</head>
<body>
<div id="main_container">
	 <dsp:include src="/ff/common/header.jsp" flush="true"/>
	 <dsp:include src="/ff/common/category.jsp" flush="true"/>
<div class="center_content">

<dsp:include page="../common/promotedProduct.jsp"></dsp:include>

   
   



   	<div class="center_title_bar">Cart Details</div>
   		<dsp:form action="" method="post">
   			<dsp:input type="hidden" bean="CartModifierFormHandler.setOrderSuccessURL" value="cart_items.jsp" />
   			
   			<dsp:droplet name="ForEach">
   				<dsp:param name="array" bean="ShoppingCart.current.commerceItems" />
   				<dsp:oparam name="output">
   					<dsp:include page="cart.jsp"><dsp:param name="data" param="element"/></dsp:include>
   				</dsp:oparam>
   				<dsp:oparam name="outputEnd">
   					<div class="center_title_bar">
   					Enter name to identify the order
   					<dsp:input type="text" bean="SaveOrderFormHandler.description" iclass="prod_details"/>
   					<dsp:input type="hidden" bean="SaveOrderFormHandler.saveOrderSuccessURL" value="cart_items.jsp"/>
   					<dsp:input type="hidden" bean="SaveOrderFormHandler.saveOrderErrorURL" value="cart_items.jsp"/>
   					<dsp:input type="submit" bean="SaveOrderFormHandler.saveOrder" value="Save" iclass="prod_details"/>
   					<dsp:input type="hidden" bean="CartModifierFormHandler.moveToPurchaseInfoByRelIdSuccessURL" value="../shipping/shipping.jsp?init=true"/>
   					
   					</div>
   					<div class="center_title_bar">
   					<dsp:input iclass="prod_details" type="submit" bean="CartModifierFormHandler.moveToPurchaseInfoByRelId" value="Checkout"/>
   					</div>
   					<div class="center_title_bar">
   						Active Promotions
   					</div>
   						<div class="oferta">
			<div class="oferta_details">
				<div class="oferta_title"><dsp:valueof bean="Profile.login"/></div>
   					<dsp:include page="promotions.jsp" />
   					<dsp:include page="couponPromotion.jsp"/>
   					</div>
   					</div>
   				</dsp:oparam>
   			</dsp:droplet>
   			
   		</dsp:form>
	</div>
		
		
<dsp:include src="/ff/common/rightside.jsp" flush="true"/>
	 <dsp:include src="/ff/common/footer.jsp" flush="true"/>

</div>

</dsp:page>