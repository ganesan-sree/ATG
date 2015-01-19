<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>


	<dsp:include src="/common/header.jsp">
		<dsp:param name="title" value="Products" />
	</dsp:include>
	
	<dsp:include page="breadcrumbsNavigation.jsp" />
	
	
	
	<dsp:droplet name="/atg/commerce/catalog/CategoryLookup">
		<dsp:param name="id" param="categoryId" />
		<dsp:param name="elementName" value="category" />
		<dsp:oparam name="output">
			<dsp:droplet name="/atg/dynamo/droplet/ForEach">
				<dsp:param name="array" param="category.childCategories" />
				<dsp:param name="elementName" value="category" />
				<dsp:oparam name="output">
					<br />
					<dsp:a href="categoryNavigation.jsp">
						<dsp:valueof param="category.displayName" />
						<dsp:param name="categoryId" param="category.id" />
					</dsp:a>
				</dsp:oparam>
			</dsp:droplet>

			<dsp:droplet name="/atg/dynamo/droplet/ForEach">
				<dsp:param name="array" param="category.childProducts" />
				<dsp:param name="elementName" value="childProduct" />
				<dsp:oparam name="output">
					<dsp:include page="displayProduct.jsp">
						<dsp:param name="productId" param="childProduct.id" />
					</dsp:include>																	
				</dsp:oparam>
			</dsp:droplet>


			<dsp:droplet name="/atg/commerce/catalog/CatalogNavHistoryCollector">
				<dsp:param name="item" param="category" />
				<dsp:param name="navAction" param="navAction" />
<%-- 				<dsp:param param="navCount" name="navCount" /> --%>
			</dsp:droplet>

		</dsp:oparam>
	</dsp:droplet>


	<dsp:include src="/common/footer.jsp" />
</dsp:page>