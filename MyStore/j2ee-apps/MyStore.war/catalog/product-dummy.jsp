<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/atg/store/order/purchase/CartFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/OriginatingRequest" var="orgRequest" />

	<dsp:droplet name="/atg/commerce/catalog/custom/CatalogLookup">
		<dsp:param name="id" value="homeStoreCatalog" />
		<dsp:param name="elementName" value="catalog" />
		<dsp:oparam name="output">
			<dsp:setvalue bean="Profile.catalog" paramvalue="catalog" />
			<dsp:valueof param="catalog" />
			<dsp:valueof param="catalog.displayName" valueishtml="true" />
		</dsp:oparam>
	</dsp:droplet>








	<div class="center_title_bar">
		Product Display






		<dsp:droplet name="/atg/commerce/catalog/CategoryLookup">
<dsp:param name="id" value="cat10022"/>
			<dsp:oparam name="output">
			<dsp:valueof param="element.displayName" />
				<dsp:droplet name="/atg/dynamo/droplet/ForEach">
					<dsp:param param="element.childCategories" name="array" />
					<dsp:oparam name="outputStart">
						<p>
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
								<dsp:a href="product-dummy.jsp">
									<dsp:valueof param="element.displayName" />
									<dsp:param param="element.repositoryId" name="itemId" />
								</dsp:a>
							</dsp:getvalueof>
					</dsp:oparam>
					<dsp:oparam name="outputEnd">
						</ul>
					</dsp:oparam>
				</dsp:droplet>
			</dsp:oparam>
		</dsp:droplet>









	</div>


<dsp:droplet name="/atg/commerce/catalog/ProductLookup">

  <dsp:param param="itemId" name="id"/>

  <dsp:param bean="/OriginatingRequest.requestLocale.locale"
       name="repositoryKey"/>
  <dsp:param name="elementName" value="Product"/>
  <dsp:oparam name="output">

. . .
    <dsp:valueof param="Product.displayName"/>

. . .
  </dsp:oparam>
</dsp:droplet>











<dsp:droplet name="/atg/commerce/catalog/ProductLookup">
 <dsp:param param="itemId" name="id"/>
  <dsp:oparam name="output">

<table border=0 cellpadding=4>
<tr>
   <td>
      <span class=categoryhead>
      <dsp:valueof param="element.displayName">No name</dsp:valueof></span>
      <br>
      <b><dsp:valueof param="element.description"/></b></td>
   </td>
</tr>
<tr valign=top>
   <td>
      <dsp:include page="../common/FormError.jsp" flush="false"></dsp:include>
      <dsp:droplet name="IsEmpty">
         <dsp:param name="value" param="element.largeImage.url"/>
         <dsp:oparam name="false">
      <dsp:getvalueof id="imageURL" param="element.largeImage.url"
         idtype="java.lang.String">
         <dsp:img hspace="70" alt="Product image" src="<%=imageURL%>"/>
      </dsp:getvalueof>
      </dsp:oparam>
      </dsp:droplet>

      <dsp:getvalueof id="pval0" param="element"><dsp:include
         page="SKUProperties.jsp" flush="false"><dsp:param name="product"
         value="<%=pval0%>"/></dsp:include></dsp:getvalueof>
      <br>
      <span class=smallb>Product Description</span><br>
      <span class=small><dsp:valueof param="element.longDescription">
         No description</dsp:valueof>
      </span>
   </td>
</tr>
</table>
</dsp:oparam>
</dsp:droplet>








</dsp:page>