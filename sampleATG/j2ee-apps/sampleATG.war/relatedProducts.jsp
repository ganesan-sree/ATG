<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"
	prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/atg/dynamo/droplet/IsNull" />
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Related Product</title>
</head>
<body>
	<dsp:droplet name="/atg/commerce/catalog/ProductLookup">
		<dsp:param value="164199" name="id" />
		<dsp:oparam name="output">
			<p>
				<!-- Display a table of related products. -->
				<dsp:droplet name="/atg/dynamo/droplet/TableForEach">
					<dsp:param name="array" param="element.relatedProducts" />
					<dsp:param name="elementName" value="relatedProduct" />
					<dsp:param name="numColumns" value="2" />

					<dsp:oparam name="outputStart">

						<!-- Display this header only if there are some related products -->
						<b>Related products</b>
						<P>
						<table cellspacing=4 cellpadding=0 border=0>
							</dsp:oparam>

							<dsp:oparam name="outputRowStart">
								<tr valign=top>
							</dsp:oparam>

							<dsp:oparam name="output">

								<dsp:droplet name="IsNull">
									<dsp:param name="value" param="relatedProduct" />
									<dsp:oparam name="false">
										<td><dsp:valueof param="relatedProduct" /></td>
										<td><dsp:valueof param="relatedProduct.thumbnailImage" />
										</td>
										<td><dsp:valueof param="relatedProduct.displayName" /></td>
									</dsp:oparam>
								</dsp:droplet>

							</dsp:oparam>

							<dsp:oparam name="outputRowsEnd">
								</tr>
							</dsp:oparam>

							<dsp:oparam name="outputEnd">
						</table>
					</dsp:oparam>

					<dsp:oparam name="empty">
					</dsp:oparam>

				</dsp:droplet>
		</dsp:oparam>
	</dsp:droplet>
</body>
	</html>
</dsp:page>