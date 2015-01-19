<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>


	<dsp:include src="/common/header.jsp">
		<dsp:param name="title" value="Catalog" />
	</dsp:include>
	

	<dsp:include page="breadcrumbsNavigation.jsp" />
	
	
	
	
<%-- 	<dsp:droplet name="/atg/commerce/catalog/CategoryLookup"> --%>
<%-- 		<dsp:param name="id" value="cat2496" /> --%>
<%-- 		<dsp:oparam name="output"> --%>
<%-- 		</dsp:oparam> --%>
<%-- 	</dsp:droplet> --%>



	<dsp:droplet name="/atg/dynamo/droplet/ForEach">
		<dsp:param name="array"
			bean="/atg/userprofiling/Profile.catalog.allRootCategories" />
		<dsp:param name="elementName" value="category" />
		<dsp:oparam name="output">
			<br />
			<dsp:a href="categoryNavigation.jsp">
				<dsp:valueof param="category.displayName" />
				<dsp:param name="categoryId" param="category.id" />
			</dsp:a>
		</dsp:oparam>
		<dsp:oparam name="empty">
			<p>No root categories found.
		</dsp:oparam>
	</dsp:droplet>

	<dsp:include src="/common/footer.jsp" />
</dsp:page>
