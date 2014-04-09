<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>
	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:droplet name="Switch">
		<dsp:param bean="ProfileFormHandler.profile.transient" name="value" />
		<dsp:oparam name="false">
			<dsp:droplet name="/atg/dynamo/droplet/Redirect">
				<dsp:param name="url" value="catalog/catalog.jsp" />
			</dsp:droplet>
		</dsp:oparam>
		</dsp:droplet>

			<dsp:include src="/common/header.jsp">
				<dsp:param name="title" value="Home" />
			</dsp:include>
			<div class="content-wrapper">

				<div class="content">
				Server info: <%= application.getServerInfo() %><br>  
Servlet version: <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %><br>  
JSP version: <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %><br>  
Java version: <%= System.getProperty("java.version") %><br> 

				<div class="authentication" >
					<div class="login">
						<a href="./account/login.jsp">Login</a>
					</div>
					<div class="register">
						<a href="./account/register.jsp">Register</a>
					</div>
					<div class="register">
						<a href="./user/newUser.jsp">NewRegister</a>
					</div>
				</div>
				</div>
			</div>

			<dsp:include src="/common/footer.jsp" />
</dsp:page>
