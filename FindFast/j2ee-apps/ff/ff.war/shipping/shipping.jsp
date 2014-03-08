<%@ taglib uri="/dspTaglib" prefix="dsp"%>


<dsp:page>
	<dsp:importbean bean="/atg/commerce/order/purchase/ShippingGroupDroplet"/>
	<dsp:importbean bean="/atg/commerce/order/purchase/ShippingGroupFormHandler"/>
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
	<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
	<dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
	
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
	<div class="center_title_bar">Shipping Informations</div>
	
	<dsp:droplet name="ErrorMessageForEach">
		<dsp:param name="exceptions" bean="ShippingGroupFormHandler.formExceptions"/>
		<dsp:oparam name="outputStart">
			<ul></ul>
		</dsp:oparam>
		<dsp:oparam name="output">
			<font color="red"><dsp:valueof param="element"/></font>
		</dsp:oparam>
		<dsp:oparam name="outputEnd">
			</ul>
		</dsp:oparam>
	</dsp:droplet>
	<dsp:droplet name="ShippingGroupDroplet">
		
		<dsp:param name="shippingGroupTypes" value="hardgoodShippingGroup"/>
		<dsp:param name="clear" param="false"/> 
		<dsp:param name="initShippingGroups" value="true"/>
		<dsp:param name="initShippingInfos" value="true"/>
		<dsp:oparam name="output">
		<dsp:valueof param="shippingGroups"/>
			<!-- ForEach Droplet -->
				<dsp:form method="post" action="shippingMethod.jsp">
							<dsp:input type="hidden" bean="ShippingGroupFormHandler.applyShippingGroupsSuccessURL" value="shippingMethod.jsp" />
							<dsp:input type="hidden" bean="ShippingGroupFormHandler.applyDefaultShippingGroup" value="true"/>
		<dsp:select bean="ShippingGroupDroplet.shippingGroupMapContainer.defaultShippingGroupName" id="shippingGroup">
			
					
					<dsp:droplet name="ForEach">
									<dsp:param name="array" param="shippingGroups"/>
									<dsp:oparam name="outputStart">
									
									</dsp:oparam>
									<dsp:oparam name="output">
										
										<dsp:option paramvalue="key"> 
										<dsp:valueof param="key" />
										</dsp:option>
										</dsp:oparam>
								
									<dsp:oparam name="outputEnd">
										
										<dsp:input type="submit" bean="ShippingGroupFormHandler.applyShippingGroups" value="Ship to this Address" />
									</dsp:oparam>
									<dsp:oparam name="empty">
										No address found add New Shipping Address using the following link.
									</dsp:oparam>
								</dsp:droplet>
					</dsp:select>
				
						
						
								
						
						
				
					
				<div class="center_title_bar"><a href="hardGoodSG.jsp" >Click Here To Create New Shipping Address</a></div>
			<!-- End ForEach Droplet -->
			 	</dsp:form>
		</dsp:oparam>
 	</dsp:droplet>
 </div>
		
		
<dsp:include src="/ff/common/rightside.jsp" flush="true"/>
	 <dsp:include src="/ff/common/footer.jsp" flush="true"/>

</div>
</dsp:page>