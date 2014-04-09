<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ page contentType="text/html; charset=Shift_JIS"%>
<dsp:page>
	<dsp:droplet name="/atg/dynamo/droplet/ForEach">
		<dsp:param name="array" param="product.childSKUs" />
		<dsp:oparam name="output">
			<table cellspacing="0" cellpadding="0" border="0">
				<tr>
					<td>&nbsp;</td>
					<td><span class=smallb>Part Number:</span></td>
					<td>&nbsp;</td>
					<td><span class=small><dsp:valueof
								param="element.manufacturer_part_number">No id</dsp:valueof></span>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><span class=smallb>Manufacturer:</span></td>
					<td>&nbsp;</td>
					<td><span class=small><dsp:valueof
								param="product.manufacturer.displayName">Unknown</dsp:valueof>
							<td>&nbsp;</td>
				</tr>

				<dsp:droplet name="/atg/dynamo/droplet/Switch">
					<dsp:param bean="Profile.transient" name="value" />
					<dsp:oparam name="false">
						<tr>
							<td>&nbsp;</td>
							<td><span class=smallb>Availability:</span></td>
							<td>&nbsp;</td>
							<dsp:droplet name="/atg/commerce/inventory/InventoryLookup">
								<dsp:param name="itemId" param="element.repositoryId" />
								<dsp:oparam name="output">
									<td><span class=small><dsp:valueof
												param="inventoryInfo.availabilityStatusMsg">
                  Unknown</dsp:valueof></span>
								</dsp:oparam>
							</dsp:droplet>
							<td>&nbsp;</td>
						</tr>

						<dsp:droplet name="/atg/dynamo/droplet/Switch">
							<dsp:param bean="Profile.parentOrganization.customerType"
								name="value" />
							<dsp:oparam name="Enterprise">
								<tr>
									<td>&nbsp;</td>
									<td><span class=smallb>Stock Level:</span></td>
									<td>&nbsp;</td>
									<dsp:droplet name="/atg/commerce/inventory/InventoryLookup">
										<dsp:param name="itemId" param="element.repositoryId" />
										<dsp:oparam name="output">
											<td><span class=small><dsp:valueof
														param="inventoryInfo.stockLevel">
                        Unknown</dsp:valueof></span>
										</dsp:oparam>
									</dsp:droplet>
									<td>&nbsp;</td>
								</tr>
							</dsp:oparam>
						</dsp:droplet>
						<dsp:getvalueof id="pval0" param="product">
							<dsp:getvalueof id="pval1" param="element">
								<dsp:include page="DisplayPrice.jsp" flush="true">
									<dsp:param name="Product" value="<%=pval0%>" />
									<dsp:param name="Sku" value="<%=pval1%>" />
								</dsp:include>
							</dsp:getvalueof>
						</dsp:getvalueof>
					</dsp:oparam>
				</dsp:droplet>
			</table>
		</dsp:oparam>
	</dsp:droplet>
</dsp:page>
