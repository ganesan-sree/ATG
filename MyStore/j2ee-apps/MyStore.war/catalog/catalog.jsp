<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
<dsp:importbean bean="/atg/userprofiling/Profile" />
<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach" />
<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
<%@ page import="atg.servlet.*"%>
<dsp:page>

	<dsp:droplet name="/atg/commerce/catalog/CategoryLookup">
		<dsp:oparam name="output">
		</dsp:oparam>
	</dsp:droplet>
	<div class="title_box">Categories</div>
	<ul class="left_menu">
		<dsp:droplet name="/atg/dynamo/droplet/RQLQueryForEach">
			<dsp:param name="queryRQL" value="ALL" />
			<dsp:param name="repository"
				bean="/atg/commerce/catalog/ProductCatalog" />
			<dsp:param name="itemDescriptor" value="category" />
			<dsp:oparam name="output">
				<li><dsp:a href="display_product.jsp">
						<dsp:param name="category_id" param="element.repositoryId" />
						<dsp:valueof param="element.displayName" />
					</dsp:a></li>
			</dsp:oparam>
			<dsp:oparam name="empty">
					Empty
				</dsp:oparam>
		</dsp:droplet>
	</ul>








</dsp:page>
