<%@ taglib uri="/dspTaglib" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>
<html>

<dsp:importbean bean = "/com/paypal/droplet/PaypalCheckoutDroplet"/>
<dsp:importbean bean="/atg/commerce/order/IsHardGoods"/>
<dsp:importbean bean="/atg/commerce/order/purchase/ExpressCheckoutFormHandler"/>
<dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>
<dsp:importbean bean="/atg/commerce/order/ShoppingCartModifier"/>
<dsp:importbean bean="/atg/commerce/ShoppingCart"/>
<dsp:importbean bean="/com/paypal/droplet/PaypalDroplet"/>

<dsp:droplet name="PaypalDroplet">
<%
	String token = request.getParameter("token");
	String payerId = request.getParameter("PayerID");
%>
<dsp:param name="orderId" bean="ShoppingCartModifier.order.id"/>
<dsp:param name="order" bean="ShoppingCart.current"/>
<dsp:param name="token"  value="<%=token %>"/>
<dsp:param name="payerId" value="<%=payerId %>"/>

</dsp:droplet>

return page
</html>
</dsp:page>