<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
<dsp:importbean bean="/atg/userprofiling/Profile" />
<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach" />
<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
<%@ page import="atg.servlet.*"%>
<dsp:page>



<dsp:droplet name="/atg/commerce/catalog/custom/CatalogLookup">
	<dsp:param name="id" value="eletronic"/>
	<dsp:param name="elementName" value="catalog"/>
	<dsp:oparam name="output">
		<dsp:setvalue bean="Profile.catalog" paramvalue="catalog"/>
		<dsp:valueof param="catalog"/>
		<dsp:valueof param="catalog.displayName" valueishtml="true"/>
	</dsp:oparam>
</dsp:droplet>


<br/>


	<dsp:droplet name="/atg/commerce/catalog/CategoryLookup">	
	<dsp:param name="id" value="mobile"/>
	<dsp:oparam name="output">

			<dsp:valueof param="element.displayName" valueishtml="true"/>
		
		hello
		</dsp:oparam>
	</dsp:droplet>
	
	 <dsp:droplet name="/atg/dynamo/droplet/ForEach">
   <dsp:param bean="/atg/userprofiling/Profile.catalog.allRootCategories"
        name="array"/>
  <dsp:oparam name="output">
    <tr>
      <td>
      
      <dsp:valueof param="element.displayName" valueishtml="true"/>
      <dsp:valueof  param="element.template.url"/>


    </td>
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
				<li><dsp:a href="display_product.jsp">
						<dsp:param name="itemId" param="element.repositoryId" />
						<dsp:valueof param="element.displayName" />
					</dsp:a></li>
			</dsp:oparam>
			<dsp:oparam name="empty">
					Empty
				</dsp:oparam>
		</dsp:droplet>
	</ul>








</dsp:page>
