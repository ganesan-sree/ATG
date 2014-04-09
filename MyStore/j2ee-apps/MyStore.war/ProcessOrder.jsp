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
    <dsp:importbean bean="/atg/commerce/catalog/SKULookup"/>
    <dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler"/>
    <dsp:importbean bean="/atg/commerce/ShoppingCart"/>
	  <dsp:importbean bean="/com/cts/handler/OrderRunner"/>
  <dsp:form name="OptionalName" action="ProcessOrder.jsp" >
    SKU:<dsp:input bean="OrderRunner.sku" type="text" value="${param.sku}"/><br/>
    Product:<dsp:input bean="OrderRunner.product" type="text" value="${param.product}"/><br/>
    Quantity:<dsp:input bean="OrderRunner.quantity" type="text"/><br/>
    <dsp:input bean="OrderRunner.save" type="submit" value="Place Order"></dsp:input>
    <dsp:input bean="OrderRunner.cancel" type="submit" value="Clear"></dsp:input>
  </dsp:form>

	 
	 </dsp:page>