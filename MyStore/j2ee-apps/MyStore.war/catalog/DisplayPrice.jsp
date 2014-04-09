<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ page contentType="text/html; charset=Shift_JIS" %>
<dsp:page>

<dsp:droplet name="/atg/commerce/catalog/CategoryLookup">
<dsp:param bean="/atg/dynamo/servlet/RequestLocale.locale"
     name="repositoryKey"/>

<dsp:oparam name="output">

  <dsp:droplet name="/atg/dynamo/droplet/ForEach">
   <dsp:param name="array" param="element.childCategories"/>
   <dsp:param name="elementName" value="child"/>
   <dsp:param bean="/OriginatingRequest.requestLocale.locale"
        name="repositoryKey"/>

   <dsp:oparam name="output">
   <dsp:include page="../common/ItemLink.jsp" flush="true">
    <dsp:param name="Item" param="child"/>
    <dsp:param name="navAction" value="jump"/>
    <dsp:param name="Image" param="child.thumbnailImage"/>
    <dsp:param name="DisplayText" param="child.displayName"/>
   </dsp:include>
   <br>

   <dsp:droplet name="/atg/dynamo/droplet/ForEach">
    <dsp:param name="array" param="child.childCategories"/>
    <dsp:param name="elementName" value="grandChild"/>

    <dsp:oparam name="output">
       &nbsp; &nbsp;
   <dsp:include page="../common/ItemLink.jsp" flush="true">
      <dsp:param name="Item" param="grandChild"/>
      <dsp:param name="navAction" value="jump"/>
      <dsp:param name="Image" param="grandChild.thumbnailImage"/>
      <dsp:param name="DisplayText"
           param="grandChild.displayName"/>
   </dsp:include>

       <br>
       </dsp:oparam>
      </dsp:droplet>

    </dsp:oparam>
   </dsp:droplet>

  </dsp:oparam>
</dsp:droplet>
</dsp:page>
