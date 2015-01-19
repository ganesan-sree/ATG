<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty" />



	<dsp:droplet name="/atg/commerce/catalog/ProductLookup">
		<dsp:param param="productId" name="id" />
		<dsp:param name="elementName" value="product" />
		<dsp:oparam name="output">

			<table border="1">
				<tr>
					<td><span class=categoryhead>
					<dsp:valueof param="product.displayName">No name</dsp:valueof></span> 
					<br> <b>
					<dsp:valueof param="product.description" /></b></td>

				</tr>
				<tr valign=top>
					<td><dsp:droplet name="IsEmpty">
							<dsp:param name="value" param="product.largeImage.url" />
							<dsp:oparam name="false">
								<dsp:getvalueof id="imageURL" param="product.largeImage.url"
									idtype="java.lang.String">
									<dsp:img hspace="70" alt="Product image" src="<%=imageURL%>" />
								</dsp:getvalueof>
							</dsp:oparam>
						</dsp:droplet> <br> <span>Product Description</span>
						<br> 
						<span>
						<dsp:valueof param="product.longDescription"> No description</dsp:valueof> 
						</span></td>
				</tr>
			</table>
			<dsp:include page="skuProperties.jsp">
				<dsp:param name="sku" param="product.childSKUs[0]" />
				<dsp:param name="productId" param="productId" />
			</dsp:include>
		</dsp:oparam>
	</dsp:droplet>
</dsp:page>
