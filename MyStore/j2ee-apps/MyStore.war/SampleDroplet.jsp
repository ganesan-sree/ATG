<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<dsp:page>

		<h1>Sample Droplet</h1>

		<dsp:droplet name="/com/cts/droplet/SampleDroplet">

			<dsp:param name="profile" bean="/atg/userprofiling/Profile" />

			<dsp:param name="currentPage" value="SampleDroplet.jsp" />

			<dsp:oparam name="output">

				<dsp:valueof param="message" />

			</dsp:oparam>

			<dsp:oparam name="error">

            Error: <dsp:valueof param="errorMsg" />

			</dsp:oparam>

		</dsp:droplet>

	</dsp:page>
</body>
</html>