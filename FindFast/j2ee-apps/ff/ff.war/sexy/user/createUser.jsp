<%@ taglib uri="/dspTaglib" prefix="dsp"%>
<dsp:page>
<html>

<head>

	<script type="text/javascript" language="JavaScript" src="/ff/assets/js/jquery.js"></script>
	<script type="text/javascript" language="JavaScript" src="/ff/assets/js/sexy.js"></script>
	
</head>
<body>
	<form id="formSubmit" action="/ff/Ajaxhandler" method="post">
		First Name <input type="text" id="firstName"/><br/>
		Last Name <input type="text" id="lastName"/><br/>
		Login Id <input type="text" id="login"/>
		
		Password <input type="password" id="password"/><br/>
		ConfirmPassword <input type="password" id="confirmPassword"/><br/>
		Email Address <input type="text" id="email"/><br/>
		<input type="submit" value="Register" id="send"/>
	</form>
</body>
</html>
</dsp:page>