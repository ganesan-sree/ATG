<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>

<dsp:importbean bean="/atg/commerce/ShoppingCart" />
<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
<dsp:importbean bean="/atg/dynamo/droplet/Switch" />

	<dsp:include src="/common/header.jsp">
		<dsp:param name="title" value="Shopping Cart" />
	</dsp:include>
	
	<dsp:a href="../shop/shop.jsp">Home</dsp:a>
	<br/>
	<dsp:include page="../shop/breadcrumbsNavigation.jsp" />
	<br/>
	<br/>
	
	


	<dsp:droplet name="ForEach">
		<dsp:param bean="ShoppingCart.current.commerceItems" name="array" />
		<dsp:param name="elementName" value="Ci" />
		<dsp:oparam name="outputStart">
			<b>Shopping Cart:</b>
			<table width="100%">
				<thead>
					<tr>
						<th>Sku Id</th>
						<th>Item</th>
						<th>Shipping</th>
						<th>Size</th>
						<th>Weight</th>
						<th>Unit Price</th>
						<th>Total Price</th>
						<th>Inventory Status</th>
					</tr>
				</thead>
				</dsp:oparam>
				<dsp:oparam name="output">
					<tr>
						<td><dsp:valueof param="Ci.catalogRefId" /></td>
						<td><dsp:valueof
								param="Ci.auxiliaryData.catalogRef.displayName" /></td>
						<td><dsp:valueof param="Ci.shippingGroupClassType" /></td>
						<td><dsp:valueof param='Ci.auxiliaryData.catalogRef.skuSize' />&nbsp;
							<dsp:valueof param='Ci.auxiliaryData.catalogRef.skuMeasure' /></td>
						<td><dsp:droplet name="/atg/commerce/catalog/SKULookup">
								<dsp:param name="id" param="Ci.catalogRefId" />
								<dsp:param name="elementName" value="sku" />
								<dsp:oparam name="output">
									<dsp:getvalueof id="shipweight"
										param="sku.skuContent.shipCalcWgh" idtype="java.lang.String">
										<dsp:droplet name="/atg/dynamo/droplet/Compare">
											<dsp:param name="obj1" value="<%=shipweight%>" />
											<dsp:param name="obj2" value="0.0" />
											<dsp:oparam name="default">NA</dsp:oparam>
											<dsp:oparam name="greaterthan">
												<dsp:valueof param="sku.skuContent.shipCalcWgh"
													number="0.00" />&nbsp;LBS</dsp:oparam>
										</dsp:droplet>
									</dsp:getvalueof>
								</dsp:oparam>
							</dsp:droplet></td>
						<td><dsp:valueof converter="currency"
								param="Ci.priceInfo.listPrice">no price</dsp:valueof></td>
						<td><dsp:valueof converter="currency"
								param="Ci.priceInfo.amount">no price</dsp:valueof></td>

						<td><dsp:droplet
								name="/atg/commerce/inventory/InventoryLookup">
								<dsp:param param="Ci.catalogRefId" name="itemId" />
								<dsp:param value="false" name="useCache" />
								<dsp:oparam name="output">									
									Count: <dsp:valueof param="inventoryInfo.stockLevel" />
									<dsp:valueof
										param="Ci.auxiliaryData.catalogRef.skuStatus.skuStatus" />
									<dsp:droplet name="Switch">
										<dsp:param param="inventoryInfo.availabilityStatus"
											name="value" />
										<dsp:oparam name="1001">
											<dsp:valueof param="inventoryInfo.availabilityStatusMsg" />
											<%-- 					<dsp:input bean="CartModifierFormHandler.outofStock" type="hidden" --%>
											<%-- 						value="true" /> --%>
										</dsp:oparam>
									</dsp:droplet>
								</dsp:oparam>
							</dsp:droplet></td>


					</tr>
				</dsp:oparam>

				<dsp:oparam name="outputEnd">
			</table>
		</dsp:oparam>

		<dsp:oparam name="empty">
		No Items in the Cart
		</dsp:oparam>
	</dsp:droplet>


	<div align="right">
	<dsp:include page="ordertotals.jsp">
		<dsp:param name="order" bean="ShoppingCart.current" />
	</dsp:include>
</div>
	<dsp:include src="/common/footer.jsp" />
</dsp:page>
