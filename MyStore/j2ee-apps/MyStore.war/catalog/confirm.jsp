<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>

<dsp:importbean bean="/atg/commerce/ShoppingCart"/>
<dsp:importbean bean="/atg/commerce/order/IsHardGoods"/>
<dsp:importbean bean="/atg/commerce/order/purchase/ExpressCheckoutFormHandler"/>
<dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>
<dsp:importbean bean="/atg/commerce/order/ShoppingCartModifier"/>
<dsp:importbean bean="/atg/commerce/ShoppingCart"/>
<dsp:setvalue bean="Profile.currentLocation" value="checkout"/>
<dsp:importbean bean = "/com/paypal/droplet/PaypalCheckoutDroplet"/>


<html>
<head>
<title>Order Confirmation</title>
</head>

<body>

<body>

<div id="main_container">
	
	 <dsp:include src="../catalog/category.jsp" flush="true"/>
<div class="center_content">

<dsp:include page="../common/promotedProduct.jsp"></dsp:include>
	<div class="center_title_bar">Order Confirmation</div>
<dsp:droplet name="/atg/dynamo/droplet/Switch">
  <dsp:param bean="/atg/userprofiling/Profile.transient" name="value"/>
  <dsp:oparam name="false">




<dsp:droplet name="/atg/dynamo/droplet/Switch">
<dsp:param bean="ExpressCheckoutFormHandler.formError" name="value"/>
<dsp:oparam name="true">
  <font color=cc0000><STRONG><UL>
    <dsp:droplet name="/atg/dynamo/droplet/ErrorMessageForEach">
      <dsp:param bean="ExpressCheckoutFormHandler.formExceptions" name="exceptions"/>
      <dsp:oparam name="output">
	<LI> <dsp:valueof param="message"/>
      </dsp:oparam>
    </dsp:droplet>
    </UL></STRONG></font>
</dsp:oparam>
</dsp:droplet>

<p>

<dsp:form action="confirm.jsp" method="post">
<dsp:input bean="ExpressCheckoutFormHandler.commitOrder" type="hidden" value="true"/>
<dsp:input bean="ExpressCheckoutFormHandler.paymentGroupNeeded" type="hidden" value="false"/>
<dsp:input bean="ExpressCheckoutFormHandler.shippingGroupNeeded" type="hidden" value="false"/>
<dsp:input bean="ExpressCheckoutFormHandler.expressCheckoutSuccessURL" type="hidden" value="orderCommit.jsp"/>


<h3>Shipping Summary</h3> <br/>
<dsp:include page="shippingSummary.jsp">
	<dsp:param name="shippingGroups" bean="ShoppingCart.current.shippingGroups"/>
</dsp:include>
 </br>
<h3>Payment Summary</h3> <br/>
<dsp:include page="paymentSummary.jsp">
	<dsp:param name="paymentGroups" bean="ShoppingCart.current.paymentGroups"/>
</dsp:include>




<table cellspacing=0 cellpadding=0 border=0 width=100%>
<tr valign=top><td><table cellspacing=0 cellpadding=10 border=0>
<tr>
<th>Quantity</th>
<th>Product</th>
<th>SKU</th>
<th>List Price</th>
<th>Sale Price</th>
<th>Total Price</th>
</tr>

<tr>
<td colspan=6>
<hr>
</td></tr>



<dsp:droplet name="ForEach">
  <dsp:param bean="ShoppingCart.current.commerceItems" name="array"/>
  <dsp:param name="elementName" value="item"/>
  <dsp:oparam name="output">
<tr valign=top>

<td>
<dsp:valueof param="item.quantity"/>
</td>

<td>
<dsp:valueof param="item.auxiliaryData.productRef.displayName"/>
</td>

<td>
<dsp:valueof param="item.auxiliaryData.catalogRef.displayName"/>
</td>

<td align=right>
<dsp:valueof converter="currency" param="item.priceInfo.listPrice">no price</dsp:valueof>
</td>

<td align=right>
<dsp:droplet name="Switch">
<dsp:param name="value" param="item.priceInfo.onSale"/>
<dsp:oparam name="true"><dsp:valueof converter="currency" param="item.priceInfo.salePrice"/></dsp:oparam>
</dsp:droplet>
</td>

<td align=right>
<dsp:valueof converter="currency" param="item.priceInfo.amount">no price</dsp:valueof>
</td>

</tr>

  </dsp:oparam>


  <dsp:oparam name="empty">
<tr valign=top>
<td>No Items</td>
</tr>
  </dsp:oparam>
</dsp:droplet>

<tr><td colspan=6><hr></td></tr>

<tr>
<th align=right colspan=5>Subtotal</th>
<th align=right>
<dsp:valueof bean="ShoppingCart.current.priceInfo.amount" converter="currency">no price</dsp:valueof>
</th>
</tr>

<tr>
<th align=right colspan=5>Shipping</th>
<th align=right>
<dsp:valueof bean="ShoppingCart.current.priceInfo.shipping" converter="currency">no price</dsp:valueof>
</th>
</tr>

<tr>
<th align=right colspan=5>Tax</th>
<th align=right>
<dsp:valueof bean="ShoppingCart.current.priceInfo.tax" converter="currency">no price</dsp:valueof>
</th>
</tr>
        
<tr>
<th align=right colspan=5>Total</th>
<th align=right>
<dsp:valueof bean="ShoppingCart.current.priceInfo.total" converter="currency">no price</dsp:valueof>
</th>
</tr>
</table>
</table>
<td background="../common/img/cart_right.jpg" width="20px"></td>
			</tr>
			<tr>
			<td background="../common/img/cart_bl.jpg" width="20px" height="20px"></td>
			<td background="../common/img/cart_bottom.jpg" height="20px"></td>
			<td background="../common/img/cart_br.jpg" width="20px" height="20px"></td>
			</tr>	
			</table>


<dsp:input bean="ExpressCheckoutFormHandler.expressCheckout" id="button" type="submit" value="Purchase"/>


</dsp:form>

  </dsp:oparam>
  <dsp:oparam name="true">
    <dsp:a href="login.jsp">Login</dsp:a> or <dsp:a href="register.jsp">Register</dsp:a>
  </dsp:oparam>
</dsp:droplet>
</div>
		
		

</div>
</body>
</html>

</dsp:page>