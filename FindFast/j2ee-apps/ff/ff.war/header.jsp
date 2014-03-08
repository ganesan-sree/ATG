<%@ taglib uri="/dspTaglib" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/ff/help/HeaderDetails"/>
	<dsp:droplet name="HeaderDetails">
		<dsp:oparam name="output">
			<dsp:valueof param="result"/>
			<dsp:getvalueof id="headerNames" param="result" idtype="java.util.Enumeration">
				<%
					 while(headerNames.hasMoreElements()) {
				      String headerName = (String)headerNames.nextElement();
				      out.println(headerName+"----");
				      out.println(request.getHeader(headerName));
				      						out.println("<br>");
				    }
				   
									
				%>
				</dsp:getvalueof>
		</dsp:oparam>
	</dsp:droplet>
</dsp:page>