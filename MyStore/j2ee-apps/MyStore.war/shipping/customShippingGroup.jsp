<%@ taglib uri="/dsp" prefix="dsp"%>


<dsp:page>
	<dsp:importbean bean="/atg/commerce/order/purchase/ShippingGroupDroplet"/>
	<dsp:importbean bean="/atg/commerce/order/purchase/ShippingGroupFormHandler"/>
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
	<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
	<dsp:importbean bean="/atg/commerce/order/purchase/CreateHardgoodShippingGroupFormHandler"/>
	<dsp:importbean bean="/atg/userprofiling/Profile"/>
	<dsp:importbean bean="/com/ff/shipping/CreateCustomShippingGroup"/>
	
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

		<table>
			<tr>
				<td>Nick Name</td>
				<td><dsp:input type="text" bean="CreateCustomShippingGroup.customShippingGroupName"/>
				<td>Mobile Number</td>
				<td><dsp:input type="text" bean="CreateCustomShippingGroup.mobileNumber" /></td>
				
			</tr>
						<tr>
				<dsp:input type="hidden" bean="CreateCustomShippingGroup.successURL" value="shipping.jsp?init=false"/>
				<td><dsp:input type="submit" bean="CreateCustomShippingGroup.create" value="Save" /></td>
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