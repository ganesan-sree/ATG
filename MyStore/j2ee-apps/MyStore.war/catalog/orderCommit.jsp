
<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>
<dsp:importbean bean="/atg/commerce/ShoppingCart"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>
<dsp:importbean bean="/atg/dynamo/droplet/ComponentExists"/>

<html>
<body>

<div id="main_container">
	 
	 <dsp:include src=../catalog/category.jsp" flush="true"/>
<div class="center_content">

<dsp:include page="../common/promotedProduct.jsp"></dsp:include>
	<div class="center_title_bar">Order Finalized</div>
<span style="display:block; background-color:maroon; color:#fff; " >
<strong>Order Confirmation Number:<u><dsp:valueof bean="ShoppingCart.last.id"/></u>
</strong></span>

<h3>Shipping Summary</h3> <br/>
<dsp:include page="shippingSummary.jsp">
	<dsp:param name="shippingGroups" bean="ShoppingCart.last.shippingGroups"/>
</dsp:include>
 </br>
<h3>Payment Summary</h3> <br/>
<dsp:include page="paymentSummary.jsp">
	<dsp:param name="paymentGroups" bean="ShoppingCart.last.paymentGroups"/>
</dsp:include>

 



<table cellspacing=0 cellpadding=10 border=0>
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
  <dsp:param bean="ShoppingCart.last.commerceItems" name="array"/>
  <dsp:param name="elementName" value="item"/>
  <dsp:oparam name="output">
<tr>
<td>
<dsp:valueof param="item.quantity"/>
</td>

<td><dsp:valueof param="item.auxiliaryData.productRef.displayName"/></td>

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

  <dsp:oparam name="empty"><tr valign=top><td>No Items</td></tr></dsp:oparam>
</dsp:droplet>

<tr><td colspan=6><hr></td></tr>
<tr>
<th colspan=5 align=right>Subtotal</th>
<th align=right>
<dsp:valueof bean="ShoppingCart.last.priceInfo.amount" converter="currency">no price</dsp:valueof>
</th>

</tr>

<tr>
<th colspan=5 align=right>Shipping</th>
<th align=right>
<dsp:valueof bean="ShoppingCart.last.priceInfo.shipping" converter="currency">no price</dsp:valueof>
</th>

</tr>

<tr>
<th colspan=5 align=right>Tax</th>
<th align=right>
<dsp:valueof bean="ShoppingCart.last.priceInfo.tax" converter="currency">no price</dsp:valueof>
</th>

</tr>
        
<tr>
<th colspan=5 align=right>Total</th>
<th align=right>
<dsp:valueof bean="ShoppingCart.last.priceInfo.total" converter="currency">no price</dsp:valueof>
</th>
</tr>
</table>
</div>
		
		

	 </div>
</body>
</html>
<dsp:include page="/common/footer.html"/>
</dsp:page>
