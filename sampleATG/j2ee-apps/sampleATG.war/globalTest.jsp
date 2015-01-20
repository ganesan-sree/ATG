<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" prefix="dsp" %>
<dsp:page>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Global testing page</title>
</head>
<body>
<dsp:importbean bean="/com/bean/handler/UserHandler" />

	<div id="global">
		<h3>Global Property validation</h3>
		<dsp:form method="post">
			<dsp:input bean="UserHandler.successURL" type="hidden"
				value="globalTest.jsp" />
			<dsp:input bean="UserHandler.errorURL" type="hidden"
				value="../genericError.jsp" />
						
			<dsp:input bean="UserHandler.global" type="submit"
				value="Global Varible" />
		</dsp:form>
	</div>
	
</body>
</html>
</dsp:page>