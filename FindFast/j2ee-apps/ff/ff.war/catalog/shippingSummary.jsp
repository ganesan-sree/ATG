<%@ taglib uri="/dspTaglib" prefix="dsp"%>


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
  <dsp:param param="shippingGroups" name="array"/>
  <dsp:param name="elementName" value="ShippingGroup"/>

  <!-- First output all of the address information for this shipping group -->
  <dsp:oparam name="output">

    <dsp:droplet name="Switch">
      <dsp:param name="value" param="ShippingGroup.shippingGroupClassType"/>
      
    <td>    
      <dsp:oparam name="hardgoodShippingGroup">
      
        
        <dsp:valueof param="ShippingGroup.shippingAddress.firstName"/>
        <dsp:valueof param="ShippingGroup.shippingAddress.middleName"/>
        <dsp:valueof param="ShippingGroup.shippingAddress.lastName"/><BR>
        <dsp:valueof param="ShippingGroup.shippingAddress.address1"/><BR>
        <dsp:droplet name="IsEmpty">
         <dsp:param name="value" param="ShippingGroup.shippingAddress.address2"/>
         <dsp:oparam name="false">
           <dsp:valueof param="ShippingGroup.shippingAddress.address2"/><BR>
         </dsp:oparam>
        </dsp:droplet>
        <dsp:valueof param="ShippingGroup.shippingAddress.city"/>
        <dsp:valueof param="ShippingGroup.shippingAddress.state"/> 
        <dsp:valueof param="ShippingGroup.shippingAddress.postalCode"/><BR>
        <dsp:valueof param="ShippingGroup.shippingAddress.country"/><BR>
        <dsp:droplet name="/atg/dynamo/droplet/IsNull">
         <dsp:param  param="ShippingGroup.shippingAddress.email" name="value"/>
         <dsp:oparam name="false">
        <dsp:valueof param="ShippingGroup.shippingAddress.email"/><BR>
        </dsp:oparam>
        </dsp:droplet>
        <dsp:droplet name="/atg/dynamo/droplet/IsNull">
         <dsp:param  param="ShippingGroup.shippingAddress.phoneNumber" name="value"/>
         <dsp:oparam name="false">
        Ph:<dsp:valueof param="ShippingGroup.shippingAddress.phoneNumber"/><BR>
         </dsp:oparam>
        </dsp:droplet>
         <i style="color:maroon; font-weight:medium;">Ship via <dsp:valueof param="ShippingGroup.shippingMethod"/>(
        <dsp:valueof param="ShippingGroup.PriceInfo.amount" converter="currency"/> )</i><BR>
     </dsp:oparam>    

              

      <dsp:oparam name="electronicShippingGroup">
       <i>Email to:</i><br>
       <dsp:valueof param="ShippingGroup.emailAddress"/> 
       <br>
       </td>
      </dsp:oparam>
    </dsp:droplet> <!-- End switch on type of shipping Group -->
    
     <dsp:droplet name="Switch">
    <dsp:param name="value" param="ShippingGroup.specialInstructions.allowPartialShipment"/>
    <dsp:oparam name="true">Allow partial shipments</dsp:oparam>
    <dsp:oparam name="false">Do not allow partial shipments</dsp:oparam>
    </dsp:droplet>

  </dsp:oparam>
</dsp:droplet>  
</html>
</dsp:page>