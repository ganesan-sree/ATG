<%@ taglib uri="/dsp" prefix="dsp"%>
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

<dsp:importbean bean="/atg/userprofiling/Profile"/>


<body>

<div id="main_container">
	 <dsp:include src="../catalog/category.jsp" flush="true"/>
<div class="center_content">

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
<dsp:droplet name="Switch">
<dsp:param bean="CreateCreditCardFormHandler.formError" name="value"/>
<dsp:oparam name="true">
  <font color=cc0000><STRONG><UL>
    <dsp:droplet name="ErrorMessageForEach">
      <dsp:param bean="CreateCreditCardFormHandler.formExceptions" name="exceptions"/>
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

<dsp:droplet name="PaymentGroupDroplet">
  <dsp:param name="clear" param="false"/>
  <dsp:param name="paymentGroupTypes" value="homeDelivery"/>
  <dsp:param name="initPaymentGroups" value="true"/>
  <dsp:param name="initOrderPayment" value="true"/>
  <dsp:oparam name="output">
  
  <!-- begin output -->
    <dsp:setvalue bean="PaymentGroupFormHandler.listId" beanvalue="ShoppingCartModifier.order.id"/>
    
    payment groups <dsp:valueof param="paymentGroups"/>
    <dsp:droplet name="ForEach">
      <dsp:param name="array" param="paymentGroups"/>
      <dsp:oparam name="outputStart">
        <dsp:form action="billing.jsp" method="post">
   	
        <dsp:input bean="PaymentGroupFormHandler.applyDefaultPaymentGroup" type="hidden" value="true"/>
        <dsp:input bean="PaymentGroupFormHandler.applyPaymentGroupsSuccessURL" type="hidden" value="confirm.jsp"/>
        <dsp:input bean="PaymentGroupFormHandler.specifyDefaultPaymentGroupSuccessURL" type="hidden" value="complex_billing.jsp?init=true"/>
        	
        <dsp:droplet name="Switch">
          <dsp:param name="value" param="size"/>
          <dsp:oparam name="0">
            You have not entered any payment information.
          </dsp:oparam>
          <dsp:oparam name="1">
        
            <b>Your Default billing address</b>
            <dsp:droplet name="ForEach">
              <dsp:param name="array" param="paymentGroups"/>
              <dsp:oparam name="output">
                <dsp:input bean="PaymentGroupFormHandler.listId" beanvalue="PaymentGroupFormHandler.listId" priority="<%=(int)9%>" type="hidden"/>
                <dsp:input bean="PaymentGroupFormHandler.CurrentList[0].paymentMethod" paramvalue="key" type="hidden"/>
            key Value    <dsp:valueof param="key"/> <br/>
            first Name =     <dsp:valueof param="element.billingAddress.firstName"/>
                
                <dsp:input bean="PaymentGroupFormHandler.applyPaymentGroups" type="submit" id="button" value="Bill Entire Order to this CreditCard"/>
                
              </dsp:oparam>
            </dsp:droplet>
          </dsp:oparam>
          <dsp:oparam name="default">
            <b>Your Default billing address</b>
            <dsp:droplet name="ForEach">
              <dsp:param name="array" param="paymentGroups"/>
              <dsp:oparam name="output">
              	<dsp:valueof bean = "PaymentGroupFormHandler.CurrentList[0]"/>
                <dsp:input bean="PaymentGroupFormHandler.listId" beanvalue="PaymentGroupFormHandler.listId" priority="<%=(int)9%>" type="hidden"/>
                <dsp:input bean="PaymentGroupFormHandler.CurrentList[0].paymentMethod" paramvalue="key" type="radio"/>
          key Value       <dsp:valueof param="key"/><br/>
          additional <dsp:valueof param="element"/><br/>
          Billing Address <dsp:valueof param="element.billingAddress"/><br/>
          First Name <dsp:valueof param="element.billingAddress.firstName"/>
                 </dsp:oparam>
            </dsp:droplet>
            <tr><td align="center"><dsp:input bean="PaymentGroupFormHandler.applyPaymentGroups" type="submit" id="button" value="Bill Entire Order to this CreditCard"/>
            </td></tr>

            </dsp:oparam>
        </dsp:droplet>
        
			
			

		
        </dsp:form>
      </dsp:oparam>
    </dsp:droplet><!-- end ForEach -->
  <!-- end output -->
  </dsp:oparam>
</dsp:droplet><!-- end PaymentGroupDroplet -->

		

<dsp:include page="creditCard.jsp"></dsp:include>
 </dsp:oparam>
  <dsp:oparam name="true">
    <dsp:a href="../account/login.jsp">Login</dsp:a> or <dsp:a href="../account/register.jsp">Register</dsp:a>
  </dsp:oparam>
</dsp:droplet>
</div>
		
		


</div>
</body>
</html>

</dsp:page>