<%@ taglib uri="/dsp" prefix="dsp"%>


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
	
	<html>
<dsp:droplet name="ForEach">
  <dsp:param param="paymentGroups" name="array"/>
  <dsp:param name="elementName" value="PaymentGroup"/>
  <dsp:oparam name="output">

    <dsp:valueof param="PaymentGroup.billingAddress.firstName"/>
    <dsp:valueof param="PaymentGroup.billingAddress.middleName"/>
    <dsp:valueof param="PaymentGroup.billingAddress.lastName"/><BR>
    <dsp:valueof param="PaymentGroup.billingAddress.address1"/><BR>
    <dsp:droplet name="IsEmpty">
     <dsp:param name="value" param="PaymentGroup.billingAddress.address2"/>
     <dsp:oparam name="false">
       <dsp:valueof param="PaymentGroup.billingAddress.address2"/><BR>
     </dsp:oparam>
    </dsp:droplet>
    <dsp:valueof param="PaymentGroup.billingAddress.city"/>
    <dsp:valueof param="PaymentGroup.billingAddress.state"/> 
    <dsp:valueof param="PaymentGroup.billingAddress.postalCode"/><BR>
    <dsp:valueof param="PaymentGroup.billingAddress.country"/><BR>
    <dsp:valueof param="PaymentGroup.billingAddress.email"/><BR>
    <dsp:valueof param="PaymentGroup.billingAddress.phoneNumber"/><BR>
    </td></tr></table>
 <td background="../common/img/cart_right.jpg" width="20px"></td>
			</tr>
			<tr>
			<td background="../common/img/cart_bl.jpg" width="20px" height="20px"></td>
			<td background="../common/img/cart_bottom.jpg" height="20px"></td>
			<td background="../common/img/cart_br.jpg" width="20px" height="20px"></td>
			</tr>	
			</table>
    </td></tr><tr><td colspan="2" align="center">
    <table id="shop_cart" style="text-align:center; width:auto;" align="center" cellspacing="0" border="0" cellpadding="0">
		<tr>
		<td background="../common/img/cart_tl.jpg" width="20px" height="20px"></td>
		<td background="../common/img/cart_top.jpg" height="20px"></td>
		<td background="../common/img/cart_tr.jpg" width="20px" height="20px"></td>
		</tr>
		<tr style="background-color:#fff;">
		<td background="../common/img/cart_left.jpg" width="20px">
		</td>
		<td align=left>	
    
   HomeDelivery Address <dsp:valueof param="PaymentGroup.billingAddress.firstName"/> <br/>
   <dsp:valueof param="PaymentGroup.billingAddress.city"/>,
   <dsp:valueof param="PaymentGroup.billingAddress.state"/></td>
    
    


  </dsp:oparam>
</dsp:droplet> 
</html>
</dsp:page>