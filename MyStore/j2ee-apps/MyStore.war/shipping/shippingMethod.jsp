<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>
<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>
<dsp:importbean bean="/atg/commerce/ShoppingCart"/>
<dsp:importbean bean="/atg/commerce/pricing/UserPricingModels"/>
<dsp:importbean bean="/atg/commerce/pricing/AvailableShippingMethods"/>
<dsp:importbean bean="/atg/dynamo/droplet/IsNull"/>
<dsp:importbean bean="/atg/commerce/order/purchase/ShippingGroupDroplet"/>
<dsp:importbean bean="/atg/commerce/order/purchase/ShippingGroupFormHandler"/>

<div id="main_container">

	 <dsp:include src="../catalog/category.jsp" flush="true"/>
<div class="center_content">

	<h2>Shipping Informations</h2>

 <dsp:form action="../catalog/billing.jsp" method="post">
 

    <%-- put errors here --%>
    <table border=0 cellpadding=4 width=80%>
      <tr><td><dsp:img src="../images/d.gif"/></td></tr>
      <tr>
        <td colspan=3><span class="big">Shipping Method</span>
        <dsp:include page="../common/FormError.jsp"></dsp:include></td>
      </tr>
      
      <%--
      Each ShippingGroup will be assigned a shipping method here.
      --%>
      <dsp:droplet name="ForEach">
 
    <dsp:param bean="ShoppingCart.current.shippingGroups" name="array"/>
        <dsp:param name="elementName" value="sGroup"/>
        <dsp:oparam name="output">

          <tr valign=top>
            <td colspan=2>
            <table width=100% cellpadding=3 cellspacing=0 border=0>
              <tr>
                <td class=box-top>&nbsp;Shipping Group <dsp:valueof param="count"/></td>
              </tr>
            </table>
            </td>
          </tr>
          
          <dsp:droplet name="Switch">
            <dsp:param name="value" param="sGroup.shippingGroupClassType"/>
            <dsp:oparam name="electronicShippingGroup">
              Delivered to <dsp:valueof param="sGroup.emailAddress"/>
            </dsp:oparam>
            <dsp:oparam name="default">
          
            <tr valign=top>
              <td align=right><span class=smallb>Shipping address</span></td>
              <td width=75%>
                <dsp:getvalueof id="pval0" param="sGroup.shippingAddress"><dsp:include page="../common/DisplayAddress.jsp"><dsp:param name="address" value="<%=pval0%>"/></dsp:include></dsp:getvalueof>
              </td>
            </tr>
            <tr valign=top>
              <td align=right><span class=smallb>Items</span></td>
              <td width="75%">
                <table border=0 cellpadding=1  width=75%>
                <dsp:droplet name="ForEach">
                  <dsp:param name="array" param="sGroup.CommerceItemRelationships"/>
                  <dsp:param name="elementName" value="CiRel"/>
                  <dsp:oparam name="output">
                  <tr valign=top>
                      <td><dsp:valueof param="CiRel.quantity"/>&nbsp;
                      <dsp:a href="../catalog/product.jsp"><dsp:param name="id" param="CiRel.commerceItem.auxiliaryData.productId"/>
                          <dsp:valueof param="CiRel.commerceItem.auxiliaryData.productRef.displayName"/></dsp:a></td>
                    </tr>
                  </dsp:oparam>
                </dsp:droplet><%--ForEach--%>
                </table>
              </td>
            </tr>
            <tr valign=top>
              <td align=right width=25%><span class=smallb>Shipping method</span></td>
              <td align=left>
                <%--
                The AvailableShippingMethods servlet bean permits the user to select a
                shipping method that is applied to the current ShippingGroup.
                --%>
                <dsp:droplet name="AvailableShippingMethods">
                  <dsp:param name="shippingGroup" param="sGroup"/>
                  <dsp:param bean="UserPricingModels.shippingPricingModels" name="pricingModels"/>
                  <dsp:param bean="Profile" name="profile"/>
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
              </td>
            </tr>
            </dsp:oparam>
          </dsp:droplet><%--Switch--%>
        </dsp:oparam>
      </dsp:droplet>

      <tr valign="top">
      <td></td>
        <td colspan="2">
        <span class=smallb>
        <dsp:a href="ship_to_multiple.jsp?init=false">Edit shipping groups</dsp:a></span>
        <p>
        <%--
        Pushing the CONTINUE button will apply the properties set here and
        and proceed to the billing.jsp page.
        --%>
        <input type=submit 
               value="Continue">
 
 
 
 
 
   
      </dsp:form>



















		









		</div>
		
		
</div>
</body>
</html>
</dsp:page>
<%-- @version $Id: //product/B2BCommerce/main/release/MotorpriseJSP/j2ee-apps/motorprise/web-app/en/checkout/shipping_method.jsp#4 $$Change: 382389 $--%>