<%@ taglib uri="/dspTaglib" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>
<html>

<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
<dsp:importbean bean="/atg/dynamo/droplet/ComponentExists"/>
<dsp:importbean bean="/atg/commerce/order/purchase/RepriceOrderDroplet"/>
<dsp:importbean bean="/atg/commerce/order/purchase/PaymentGroupDroplet"/>
<dsp:importbean bean="/atg/commerce/order/purchase/PaymentGroupFormHandler"/>
<dsp:importbean bean="/atg/commerce/order/purchase/CreateCreditCardFormHandler"/>
<dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler"/>
<dsp:importbean bean="/atg/commerce/order/ShoppingCartModifier"/>
<dsp:importbean bean="/atg/commerce/ShoppingCart"/>


<dsp:importbean bean="/atg/userprofiling/Profile"/>

<dsp:importbean bean="/com/paypal/droplet/PaypalDroplet"/>

<link rel="stylesheet" type="text/css" href="/ff/css/tool_shop/style.css" />
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/country.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/calendar.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/maxrating.js"></SCRIPT>
<body>

<div id="main_container">
	 <dsp:include src="/ff/common/header.jsp" flush="true"/>
	 <dsp:include src="/ff/common/category.jsp" flush="true"/>
<div class="center_content">

<dsp:include page="../common/promotedProduct.jsp"></dsp:include>
	<div class="center_title_bar">Billing Information</div>


<dsp:droplet name="/atg/dynamo/droplet/Switch">
  <dsp:param bean="/atg/userprofiling/Profile.transient" name="value"/>
  <dsp:oparam name="false">
   
 
<BR>

<%-- Check for errors  --%>
<dsp:droplet name="Switch">
  <dsp:param bean="PaymentGroupFormHandler.formError" name="value"/>
  <dsp:oparam name="true">
    <font color=cc0000><STRONG><UL>
      <dsp:droplet name="ErrorMessageForEach">
        <dsp:param bean="PaymentGroupFormHandler.formExceptions" name="exceptions"/>
        <dsp:oparam name="output">
        <LI> <dsp:valueof param="message"/>
        </dsp:oparam>
      </dsp:droplet>
    </UL></STRONG></font>
  </dsp:oparam>
</dsp:droplet>


<!--The PaymentGroupDroplet and PaymentGroupFormHandler are the foundation 
of the billing framework. These can be used in a variety of ways to
determine a user's eligible payment methods and facilitate their application
to an order's line items.-->

<dsp:droplet name="RepriceOrderDroplet">
  <dsp:param name="pricingOp" value="ORDER_TOTAL"/>
</dsp:droplet>

<dsp:droplet name="PaypalDroplet">
<dsp:param name="orderId" bean="ShoppingCartModifier.order.id"/>
<dsp:param name="order" bean="ShoppingCart.current"/>

</dsp:droplet><!-- end PaypalDroplet -->

		

<dsp:include page="homeDelivery.jsp"></dsp:include>
 </dsp:oparam>
  <dsp:oparam name="true">
    <dsp:a href="../profile/login.jsp">Login</dsp:a> or <dsp:a href="../profile/registration.jsp">Register</dsp:a>
  </dsp:oparam>
</dsp:droplet>
</div>
		
		
<dsp:include src="/ff/common/rightside.jsp" flush="true"/>
	 <dsp:include src="/ff/common/footer.jsp" flush="true"/>

</div>
</body>
</html>

</dsp:page>