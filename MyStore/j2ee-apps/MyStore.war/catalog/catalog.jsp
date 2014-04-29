<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
<dsp:importbean bean="/atg/userprofiling/Profile" />
<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach" />
<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
<%@ page import="atg.servlet.*"%>
<dsp:page>

<dsp:a bean="ProfileFormHandler.logout" type="submit" href="/my" value="submit" iclass="nav" >Logout</dsp:a>

	<dsp:droplet name="/atg/commerce/catalog/custom/CatalogLookup">
		<dsp:param name="id" value="eletronic" />
		<dsp:param name="elementName" value="catalog" />
		<dsp:oparam name="output">
			<dsp:setvalue bean="Profile.catalog" paramvalue="catalog" />
			<dsp:valueof param="catalog" />
			<dsp:valueof param="catalog.displayName" valueishtml="true" />
		</dsp:oparam>
	</dsp:droplet>


	<br />


	<dsp:droplet name="/atg/commerce/catalog/CategoryLookup">
		<dsp:param name="id" value="mobile" />
		<dsp:oparam name="output">

			<dsp:valueof param="element.displayName" valueishtml="true" />
		
		hello
		</dsp:oparam>
	</dsp:droplet>

	<dsp:droplet name="/atg/dynamo/droplet/ForEach">
		<dsp:param bean="/atg/userprofiling/Profile.catalog.allRootCategories"
			name="array" />
		<dsp:oparam name="output">
			<tr>
				<td><dsp:valueof param="element.displayName" valueishtml="true" />
					<dsp:valueof param="element.template.url" /></td>
			</tr>
		</dsp:oparam>

		<dsp:oparam name="empty">
			<p>No root categories found.
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





				<li><dsp:a href="category.jsp">
						<dsp:param name="itemId" param="element.repositoryId" />
						<dsp:param name="catalogId" param="element.catalog.Id"></dsp:param>

						<dsp:valueof param="element.displayName" />
					</dsp:a></li>


			</dsp:oparam>
			<dsp:oparam name="empty">
					Empty
				</dsp:oparam>
		</dsp:droplet>
	</ul>


<h2>MyContent</h2>

<dsp:droplet name="/atg/targeting/TargetingForEach">
  <dsp:param bean="/atg/registry/RepositoryTargeters/MyContent" name="targeter"/>
  <dsp:oparam name="output">
    <dsp:getvalueof var="a7" param="element.URL" vartype="java.lang.String">
      <dsp:a href="${a7}">
        <dsp:valueof param="element.displayName"/>
      </dsp:a>
    </dsp:getvalueof>
    <dsp:getvalueof id="img14" param="element.image"
    idtype="java.lang.String">
      <dsp:img src="${img14}"/>
    </dsp:getvalueof>
    <p>
    <dsp:valueof param="element"/>
  </dsp:oparam>
</dsp:droplet>



<h2>My/NameContent</h2>


<dsp:droplet name="/atg/targeting/TargetingForEach">
  <dsp:param bean="/atg/registry/RepositoryTargeters/My/NameContent" name="targeter"/>
  <dsp:oparam name="output">
    <dsp:getvalueof var="a7" param="element.address" vartype="java.lang.String">
      <dsp:a href="${a7}">
        <dsp:valueof param="element.name"/>
      </dsp:a>
    </dsp:getvalueof>
    <dsp:getvalueof id="img14" param="element.image"
    idtype="java.lang.String">
      <dsp:img src="${img14}"/>
    </dsp:getvalueof>
    <p>
    <dsp:valueof param="element"/>
  </dsp:oparam>
</dsp:droplet>

</dsp:page>