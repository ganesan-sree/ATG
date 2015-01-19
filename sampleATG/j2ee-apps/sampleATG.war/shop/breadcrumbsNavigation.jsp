<%--
  Track the shopper's category navigation to provide the appropriate breadcrumbs.
  
  Required Parameters:
    None         

  Optional Parameters:
    None     
--%>

<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<dsp:page>
   <dsp:importbean bean="/atg/commerce/catalog/CatalogNavHistory"/>
     <dsp:droplet name="/atg/dynamo/droplet/ForEach">
   <dsp:param bean="CatalogNavHistory.navHistory" name="array"/>
   <dsp:param name="elementName" value="historyElement"/>
   <dsp:oparam name="outputStart">
      Navigation History: 
   </dsp:oparam>
   <dsp:oparam name="output">

			<dsp:droplet name="/atg/dynamo/droplet/Switch">
				<dsp:param name="value" param="count" />
				<dsp:oparam name="1">
            &nbsp; <dsp:a href="shop.jsp">Home</dsp:a> &gt;
          </dsp:oparam>
				<dsp:oparam name="default">
            &gt;
          </dsp:oparam>
			</dsp:droplet>


			<dsp:getvalueof id="templateURL" param="historyElement.template.url" idtype="java.lang.String">      
       <dsp:a href="categoryNavigation.jsp">
         <dsp:param name="id" param="historyElement.repositoryId"/>
         <dsp:param name="navAction" value="pop"/>
         <dsp:param bean="CatalogNavHistory.navCount" name="navCount"/>
       <b>  <dsp:valueof param="historyElement.displayName"/>
       </dsp:a> >></b>
      </dsp:getvalueof>
   </dsp:oparam>
   <dsp:oparam name="empty">
       No navigation history.
   </dsp:oparam>
</dsp:droplet>

</dsp:page>

