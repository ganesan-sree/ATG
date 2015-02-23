<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"
	prefix="dsp"%>
<dsp:page>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recently Viewed Product</title>
</head>
<body>
	<dsp:droplet name="/atg/commerce/catalog/ProductLookup">
		<dsp:param value="164199" name="id" />

		<dsp:oparam name="output">
DFFF
  <dsp:droplet name="/cts/commerce/catalog/ProductBrowsed">
				<dsp:param param="element" name="eventobject" />
			</dsp:droplet>
		</dsp:oparam>
	</dsp:droplet>




	<dsp:importbean bean="/atg/commerce/catalog/ProductLookup" />
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
	<dsp:importbean
		bean="/cts/commerce/catalog/recentlyviewed/RecentlyViewedFilterDroplet" />
	<dsp:importbean bean="/atg/userprofiling/Profile" />

	<dsp:valueof bean="Profile.recentlyViewedProducts" />

	<dsp:droplet name="RecentlyViewedFilterDroplet">
		<dsp:param name="collection" bean="Profile.recentlyViewedProducts" />
		<dsp:param name="exclude" param="exclude" />
		<dsp:param name="size" param="size" />

		<dsp:oparam name="output">
	DDDDDUUUU
      <dsp:getvalueof var="recentlyViewedProducts"
				param="filteredCollection" />
			<dsp:valueof param="filteredCollection" />


			<dsp:droplet name="ForEach">
				<dsp:param name="array" param="filteredCollection" />
				<dsp:oparam name="outputStart">
					<%-- Add atg_store_recentlyViewedProducts css id attribute to replace this id --%>
					<div id="atg_store_recentlyViewedProducts">
						<%-- Display title and open unordered list tag --%>
						<h3>Recently Viewed Product</h3>
						<ul class="atg_store_product">
				</dsp:oparam>
				<dsp:oparam name="output">
					<dsp:param name="recentlyViewedProduct" param="element" />
					<dsp:valueof param="recentlyViewedProduct.product" />
					<li></li>
				</dsp:oparam>
				<dsp:oparam name="outputEnd">
					</ul>
					</div>
				</dsp:oparam>
				<%-- end ForEach droplet --%>
			</dsp:droplet>

		</dsp:oparam>
		<%-- End RecentlyViewedFilterDroplet --%>
	</dsp:droplet>

</body>
	</html>
</dsp:page>