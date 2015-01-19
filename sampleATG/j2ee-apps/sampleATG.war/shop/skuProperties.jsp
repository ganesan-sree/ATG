<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>

	<table>
		<tr>
			<td>Sku Id</td>
			<td><dsp:valueof param="sku.id" /></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><dsp:valueof param="sku.listPrice" />$</td>
		</tr>
		<tr>
			<td>Sku Image</td>
			<td><img src='<dsp:valueof param="sku.largeImage.url"/>' /></td>
		</tr>

	</table>
	<dsp:form id="addSku" action="skuProperties.jsp">
		<dsp:input
			bean="/atg/commerce/order/purchase/CartModifierFormHandler.addItemCount"
			value="1" type="hidden" />
		<dsp:input
			bean="/atg/commerce/order/purchase/CartModifierFormHandler.addItemToOrderSuccessURL"
			value="../checkout/shoppingCart.jsp" type="hidden" />
		<dsp:input
			bean="/atg/commerce/order/purchase/CartModifierFormHandler.addItemToOrderErrorURL"
			value="../genericError.jsp" type="hidden" />
		<dsp:input
			bean="/atg/commerce/order/purchase/CartModifierFormHandler.items[0].productId"
			paramvalue="productId" type="hidden" />
		<dsp:input
			bean="/atg/commerce/order/purchase/CartModifierFormHandler.items[0].quantity"
			type="hidden" value="1" />
		<dsp:input
			bean="/atg/commerce/order/purchase/CartModifierFormHandler.items[0].catalogRefId"
			paramvalue="sku.id" type="hidden" />
		<dsp:input
			bean="/atg/commerce/order/purchase/CartModifierFormHandler.pageFlow"
			value="true" type="hidden" />
		<dsp:input
			bean="/atg/commerce/order/purchase/CartModifierFormHandler.addItemToOrder"
			value="add" type="hidden" />
		<input type="submit" value="Add to Cart" />
	</dsp:form>



</dsp:page>

