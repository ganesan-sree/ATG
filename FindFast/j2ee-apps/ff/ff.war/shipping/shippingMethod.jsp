<%@ taglib uri="/dspTaglib" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>

<link rel="stylesheet" type="text/css" href="/ff/css/tool_shop/style.css" />
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/country.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/calendar.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/maxrating.js"></SCRIPT>


<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>
<dsp:importbean bean="/atg/commerce/ShoppingCart"/>
<dsp:importbean bean="/atg/commerce/pricing/UserPricingModels"/>
<dsp:importbean bean="/atg/commerce/pricing/AvailableShippingMethods"/>
<dsp:importbean bean="/atg/dynamo/droplet/IsNull"/>
<dsp:importbean bean="/atg/commerce/order/purchase/ShippingGroupDroplet"/>


<div id="main_container">
	 <dsp:include src="/ff/common/header.jsp" flush="true"/>
	 <dsp:include src="/ff/common/category.jsp" flush="true"/>
<div class="center_content">

<dsp:include page="../common/promotedProduct.jsp"></dsp:include>
	<div class="center_title_bar">Shipping Informations</div>

 <dsp:form action="../catalog/billing.jsp" method="post">
        <dsp:droplet name="ForEach">
        <dsp:param bean="ShoppingCart.current.shippingGroups" name="array"/>
        <dsp:param name="elementName" value="sGroup"/>
        <dsp:oparam name="output">
         <dsp:droplet name="Switch">
            <dsp:param name="value" param="sGroup.shippingGroupClassType"/>
            <dsp:oparam name="electronicShippingGroup">
              Delivered to <dsp:valueof param="sGroup.emailAddress"/>
            </dsp:oparam>
            <dsp:oparam name="default">

                      
          am here
        	<dsp:valueof param="sGroup"/>
                <dsp:getvalueof id="pval0" param="sGroup.shippingAddress"><dsp:include page="../common/DisplayAddress.jsp"><dsp:param name="address" param="sGroup.shippingAddress"/></dsp:include></dsp:getvalueof>
            
                <dsp:droplet name="ForEach">
                  <dsp:param name="array" param="sGroup.CommerceItemRelationships"/>
                  <dsp:param name="elementName" value="CiRel"/>
                  <dsp:oparam name="output">
                  <dsp:valueof param="CiRel.quantity"/>
                      <dsp:param name="id" param="CiRel.commerceItem.auxiliaryData.productId"/>
                      <dsp:valueof param="CiRel.commerceItem.auxiliaryData.productRef.displayName"/></td>
                  
                  </dsp:oparam>
                </dsp:droplet><%--ForEach--%>
              
                <%--
                The AvailableShippingMethods servlet bean permits the user to select a
                shipping method that is applied to the current ShippingGroup.
                --%>
            
                
               
                <dsp:droplet name="AvailableShippingMethods">
                 <dsp:param name="shippingGroup" param="sGroup"/>
                  
                  <dsp:oparam name="output">
                    <dsp:select bean="ShoppingCart.current.ShippingGroups[param:index].shippingMethod">
                    <dsp:droplet name="ForEach">
                      <dsp:param name="array" param="availableShippingMethods"/>
                      <dsp:param name="elementName" value="method"/>
                      <dsp:oparam name="output">
                        <dsp:getvalueof id="methodname" idtype="String" param="method">
                          <dsp:option value="<%=methodname%>"/><dsp:valueof param="method"/>
                        </dsp:getvalueof>
                      </dsp:oparam>
                    </dsp:droplet>
                    </dsp:select>
                  </dsp:oparam>
                </dsp:droplet>
             
            
				        
            </dsp:oparam>
          </dsp:droplet><%--Switch--%>
        </dsp:oparam>
      </dsp:droplet>

  
        <%--
        Pushing the CONTINUE button will apply the properties set here and
        and proceed to the billing.jsp page.
        --%>
        <input type=submit value="Continue" id="button">

   
      </dsp:form>
 
</div>
		
		
<dsp:include src="/ff/common/rightside.jsp" flush="true"/>
	 <dsp:include src="/ff/common/footer.jsp" flush="true"/>

</div>
</body>
</html>
</dsp:page>
<%-- @version $Id: //product/B2BCommerce/main/release/MotorpriseJSP/j2ee-apps/motorprise/web-app/en/checkout/shipping_method.jsp#4 $$Change: 382389 $--%>