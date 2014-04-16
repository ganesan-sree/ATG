<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
<dsp:importbean bean="/atg/userprofiling/Profile" />
<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach" />
<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
<%@ page import="atg.servlet.*"%>
<dsp:page>
	<dsp:droplet name="/atg/commerce/catalog/custom/CatalogLookup">
		<dsp:param name="id" param="catalogId" />
		<dsp:param name="elementName" value="catalog" />
		<dsp:oparam name="output">
			<dsp:setvalue bean="Profile.catalog" paramvalue="catalog" />
			<dsp:valueof param="catalog" />
			<dsp:valueof param="catalog.displayName" valueishtml="true" />
		</dsp:oparam>
	</dsp:droplet>


	<div>
		Product Display

		<dsp:droplet name="/atg/commerce/catalog/CategoryLookup">
			<dsp:param name="id" param="itemId" />
			<dsp:oparam name="output">
				<dsp:valueof param="element.displayName" />
				<dsp:droplet name="/atg/dynamo/droplet/ForEach">
					<dsp:param param="element.childCategories" name="array" />
					<dsp:oparam name="outputStart">
						<b>Child Categories:</b>
						<ul>
					</dsp:oparam>
					<dsp:oparam name="output">
						<li><dsp:getvalueof id="a24" param="element.template.url"
								idtype="java.lang.String">
								<dsp:a href="<%=a24%>">
									<dsp:valueof param="element.displayName" />
									<dsp:param param="element.repositoryId" name="itemId" />
									
								</dsp:a>
							</dsp:getvalueof>
					</dsp:oparam>
					<dsp:oparam name="outputEnd">
						</ul>
					</dsp:oparam>
				</dsp:droplet>

				<dsp:droplet name="/atg/commerce/catalog/ForEachItemInCatalog">
					<dsp:param param="element.childProducts" name="array" />
					<dsp:oparam name="outputStart">
						<p>
							<b>Child Products:</b>
						<ul>
					</dsp:oparam>
					<dsp:oparam name="output">

						<li><dsp:getvalueof id="a61" param="element.template.url"
								idtype="java.lang.String">
								<dsp:a href="display_sku.jsp">
									<dsp:valueof param="element.displayName" />
															
									
									<dsp:param param="element.repositoryId" name="itemId" />
									<dsp:param name="catalogId" param="catalogId"/>
									
								</dsp:a>
							</dsp:getvalueof>
							<dsp:valueof param="element.longDescription" />
					</dsp:oparam>
					<dsp:oparam name="outputEnd">
						</ul>
					</dsp:oparam>
				</dsp:droplet>
			</dsp:oparam>
		</dsp:droplet>




	</div>

</dsp:page>