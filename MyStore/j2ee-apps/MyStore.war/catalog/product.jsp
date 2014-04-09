<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
<dsp:droplet name="/atg/commerce/catalog/ProductLookup">
 <dsp:param param="itemId" name="id"/>
  <dsp:oparam name="output">
…
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
…
</dsp:oparam>
</dsp:droplet>




</dsp:page>