<%@ taglib uri="/dspTaglib" prefix="dsp"%>


<dsp:page>

<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>

<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:importbean bean="/ff/user/FFUserProfileFormHandler"/>
<dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>

<html>
<head>

<link rel="stylesheet" type="text/css" href="/ff/css/tool_shop/style.css" />
<SCRIPT LANGUAGE="JavaScript" SRC="../js/country.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" SRC="../js/calendar.js"></SCRIPT>



</head>
<body>
<div id="main_container">
	 <dsp:include src="/ff/common/header.jsp" flush="true"/>
	 <dsp:include src="/ff/common/category.jsp" flush="true"/>
<div class="center_content">


<div class="oferta">
                	<img src="/ff/css/tool_shop/images/p1.png" width="165" height="113" border="0" class="oferta_img" alt="" title="" />

                	
                    <div class="oferta_details">
                            <div class="oferta_title">Power Tools BST18XN Cordless</div>
                            <div class="oferta_text">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            </div>
                            <a href="details.html" class="prod_buy">details</a>
                    </div>
                </div>

   
   


 <dsp:droplet name="Switch">
<dsp:param bean="ProfileFormHandler.formError" name="value"/>
<dsp:oparam name="true">
  <UL>
    <dsp:droplet name="ProfileErrorMessageForEach">
      <dsp:param bean="ProfileFormHandler.formExceptions" name="exceptions"/>
      <dsp:oparam name="output">
     <font color="red"><LI> <dsp:valueof param="message"/></font>
      </dsp:oparam>
    </dsp:droplet>
    </UL>
</dsp:oparam>
</dsp:droplet>

<dsp:droplet name="Switch">
	<dsp:param name="value" bean="Profile.transient"/>
	<dsp:oparam name="false">
		Already Loggeg in
	</dsp:oparam>
	<dsp:oparam name="true">

   	<div class="center_title_bar">User Registration</div>
		<dsp:form method="post" id="register" action="registration.jsp" enctype="multipart/form-data">
		<dsp:input bean="ProfileFormHandler.value.member" type="hidden" value="true"/>
		<dsp:input type="hidden" bean="ProfileFormHandler.successURL" value="/ff/" />
		<dsp:input type="hidden" bean="ProfileFormHandler.errorURL" value="registration.jsp" />
           		<div class="oferta">
			<div class="oferta_details">
                            <div class="oferta_title">Personal Details</div>

		<table>
			<tr>
				<td>First Name</td>
				<td><dsp:input type="text" bean="ProfileFormHandler.value.firstName"/></td>
				<td>Middle Name</td>
				<td>
					<dsp:input bean="ProfileFormHandler.value.middleName" type="text"/>
				</td>
				<td>Last Name</td>
				<td><dsp:input type="text" bean="ProfileFormHandler.value.lastName" /></td>
			</tr>
			<tr>
				<td>Login Name</td>
				<td><dsp:input type="text" bean="ProfileFormHandler.value.login" /></td>
				<td>Password</td>
				<td><dsp:input type="password" bean="ProfileFormHandler.value.password"/></td>
				<td>ConfirmPassword</td>
				<td><dsp:input type="password" bean="ProfileFormHandler.value.confirmPassword"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><dsp:input type="text" bean="ProfileFormHandler.value.email"/></td>
				<td>Gender</td>
				<td><dsp:select bean="ProfileFormHandler.value.gender">

				<dsp:option value="male">Male</dsp:option>
				<dsp:option value="female">Female</dsp:option>
				</dsp:select>
				</td>
			
				<td>Date of Birth</td>
				<td><dsp:input type="text" bean="ProfileFormHandler.value.dateOfBirth" id="datedisplay" date="dd/mm/yy"/></td>
				<td><div id="calendar" style="display:none;"></td>
				<td><input type="button" id="click" value="click" onclick="showcalendar()"></td>

				
			</tr>
			<tr>
				<td><dsp:input type="submit" bean="ProfileFormHandler.create" value="Save" /></td>
			</tr>
		</table>
		</div>
		</div>
    

			
	</dsp:form>
	</dsp:oparam>
</dsp:droplet>
</div>
	 <dsp:include src="/ff/common/rightside.jsp" flush="true"/>
	 <dsp:include src="/ff/common/footer.jsp" flush="true"/>

</div>

</dsp:page>
