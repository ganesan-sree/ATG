<%@ taglib uri="/dspTaglib" prefix="dsp"%>


<dsp:page>
	<dsp:importbean bean="/atg/commerce/order/purchase/ShippingGroupDroplet"/>
	<dsp:importbean bean="/atg/commerce/order/purchase/ShippingGroupFormHandler"/>
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
	<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
	<dsp:importbean bean="/atg/commerce/order/purchase/CreateHardgoodShippingGroupFormHandler"/>
	<dsp:importbean bean="/atg/userprofiling/Profile"/>
	
	<html>
<head>

<link rel="stylesheet" type="text/css" href="/ff/css/tool_shop/style.css" />
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/country.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/calendar.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" SRC="/ff/js/maxrating.js"></SCRIPT>



</head>
<body>
<div id="main_container">
	 <dsp:include src="/ff/common/header.jsp" flush="true"/>
	 <dsp:include src="/ff/common/category.jsp" flush="true"/>
<div class="center_content">

<dsp:include page="../common/promotedProduct.jsp"></dsp:include>
	<div class="center_title_bar">Create New Shipping Information</div>
	
	<dsp:form id="register" action="hardGoodSG.jsp" method="post">
		
		
		<div class="oferta">
			<div class="oferta_details">
                            <div class="oferta_title">Shipping Details</div>
                            <dsp:input type="hidden" bean="CreateHardgoodShippingGroupFormHandler.addToProfile" value="true"/>

		<table>
			<tr>
				<td>Nick Name</td>
				<td><dsp:input type="text" bean="CreateHardgoodShippingGroupFormHandler.hardgoodShippingGroupName"/>
				<td>First Name</td>
				<td><dsp:input type="text" bean="CreateHardgoodShippingGroupFormHandler.HardGoodShippingGroup.ShippingAddress.firstName" beanvalue="Profile.firstName"/></td>
				<td>Last Name</td>
				<td><dsp:input type="text" bean="CreateHardgoodShippingGroupFormHandler.HardGoodShippingGroup.ShippingAddress.lastName" beanvalue="Profile.lastName" /></td>
			</tr>
			<tr>
				<td>Address 1</td>
				<td><dsp:input type="text" bean="CreateHardgoodShippingGroupFormHandler.HardGoodShippingGroup.ShippingAddress.address1" beanvalue="Profile.shippingAddress.address1" /></td>
				<td>Address 2</td>
				<td><dsp:input type="text" bean="CreateHardgoodShippingGroupFormHandler.HardGoodShippingGroup.ShippingAddress.address2" beanvalue="Profile.shippingAddress.address2" /></td>
				<td>City</td>
				<td><dsp:input type="text" bean="CreateHardgoodShippingGroupFormHandler.HardGoodShippingGroup.ShippingAddress.city" beanvalue="Profile.shippingAddress.city" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td><dsp:input type="text" bean="CreateHardgoodShippingGroupFormHandler.HardGoodShippingGroup.ShippingAddress.state" beanvalue="Profile.shippingAddress.state" /></td>
				<td>Country</td>
				<td><dsp:input type="text" bean="CreateHardgoodShippingGroupFormHandler.HardGoodShippingGroup.ShippingAddress.country" beanvalue="Profile.shippingAddress.country" /></td>

				
				</td>
			
				<td>Postal Code</td>
					<td><dsp:input type="text" bean="CreateHardgoodShippingGroupFormHandler.HardGoodShippingGroup.ShippingAddress.postaCode" beanvalue="Profile.shippingAddress.postalCode" /></td>
				
				
			</tr>
			<tr>
				<dsp:input type="hidden" bean="CreateHardgoodShippingGroupFormHandler.newHardgoodShippingGroupSuccessURL" value="shipping.jsp?init=false"/>
				<td><dsp:input type="submit" bean="CreateHardgoodShippingGroupFormHandler.newHardgoodShippingGroup" value="Save" /></td>
			</tr>
		</table>
		</div>
		</div>
		
		
	</dsp:form>
	
	</div>
		
		
<dsp:include src="/ff/common/rightside.jsp" flush="true"/>
	 <dsp:include src="/ff/common/footer.jsp" flush="true"/>
	 
	 

</div>
</dsp:page>