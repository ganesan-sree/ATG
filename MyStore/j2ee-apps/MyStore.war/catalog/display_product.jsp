<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
	<dsp:importbean bean="/ff/user/FFUserProfileFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach" />
	<dsp:importbean bean="/atg/commerce/catalog/CategoryLookup" />
	<dsp:importbean bean="/atg/commerce/catalog/ProductLookup" />
	<html>
<head>
</head>
<body>
	<div>
		<div>
			<div>Product Display</div>
			<dsp:droplet name="CategoryLookup">
			<font><dsp:valueof param="category_id" /></font>
				<dsp:param name="id" param="category_id" />
				<dsp:oparam name="output">
				
					<dsp:droplet name="ForEach">
						<dsp:param name="array" param="element.fixedChildProducts" />
						<dsp:oparam name="output">
				
							<div>
								<div>
									<div>
										<dsp:a href="display_sku.jsp">
											<dsp:param name="product_id" param="element.repositoryId" />
											<dsp:valueof param="element.displayName" />
										</dsp:a>
									</div>
									<div>
										<dsp:a href="display_sku.jsp">
											<dsp:param name="product_id" param="element.repositoryId" />
											<img src="<dsp:valueof param="element.smallImage.url"/>" />
										</dsp:a>
										<dsp:valueof param="element.smallImage.url"/>
									</div>
									<div>
										<span >350$</span> <span>270$</span>
									</div>
								</div>
							</div>


						</dsp:oparam>
						<dsp:oparam name="empty">
							<h2>
								<font color="red">No Products Found </font>
							</h2>
						</dsp:oparam>
					</dsp:droplet>
				</dsp:oparam>
				<dsp:oparam name="empty">
					<h2>
						<font color="red">No Category Found </font>
					</h2>
				</dsp:oparam>
			</dsp:droplet>

		</div>

	</div>
</dsp:page>
