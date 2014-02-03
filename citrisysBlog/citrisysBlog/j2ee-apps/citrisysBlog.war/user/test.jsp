<%@ taglib uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" prefix="dsp" %>

<dsp:page>

<HTML>
<HEAD>
<TITLE>Registration Form</TITLE>
</HEAD>

<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>
<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>

<%-- The next line sets the Profile Form Handler's extractDefaultValuesFromProfile
     property to false, to ensure that the fields in the form are blank when the
     user accesses the page.  --%>
<dsp:setvalue bean="ProfileFormHandler.extractDefaultValuesFromProfile"
value="false"/>

<BODY>

<%-- The Switch bean checks whether the current profile is a transient profile.
     If it isn't, this means that the user is logged in and therefore cannot
     register, so a warning message is displayed. If the current profile is
     transient, the registration form is displayed.  --%>
<dsp:droplet name="Switch">
   <dsp:param bean="ProfileFormHandler.profile.transient" name="value"/>
   <dsp:oparam name="false">
    You are currently logged in. If you wish to register as a new user
    please logout first.
   </dsp:oparam>

   <dsp:oparam name="default">

<%-- The next two lines set the action page for the form and the createSuccessURL
     page. The createErrorURL is not defined, so if there is an error, the user
     is directed to the action page. In this example, the action page is the
     same as the current page, so the page is redisplayed with the appropriate
     error messages. --%>
   <dsp:form name="test" method="post" >
     

<%-- This line sets the confirmPassword property to true, so the user is
     required to confirm the password entered. --%>
      <dsp:input bean="ProfileFormHandler.confirmPassword" type="hidden"
      value="true"/>

<h3>Register as a user:</h3>

<%-- The Switch bean checks the value of the formExceptions property. If the
     value of this property is true, there were errors when the form was
     submitted. The ProfileErrorMessageForEach bean cycles through the
     formExceptions array, and displays the message associated with
     each error. --%>
<dsp:droplet name="Switch">
<dsp:param bean="ProfileFormHandler.formError" name="value"/>
<dsp:oparam name="true">
  <UL>
    <dsp:droplet name="ProfileErrorMessageForEach">
      <dsp:param bean="ProfileFormHandler.formExceptions" name="exceptions"/>
      <dsp:oparam name="output">
     <LI> <dsp:valueof param="message"/>
      </dsp:oparam>
    </dsp:droplet>
    </UL>
</dsp:oparam>
</dsp:droplet>

<%-- This hidden input tag sets the member property of the value Dictionary
     to true. When the form is submitted, the member property of the permanent
     profile is therefore set to true, indicating this user is a member rather
     than a guest. --%>
<dsp:input bean="ProfileFormHandler.value.member" type="hidden"
value="true"/>

<table width=456 border=0>

<%-- The next 30 or so lines create the actual fields the user fills in, and
     uses these fields to set properties in the Profile Form Handler's value
     Dictionary. When the form is submitted, the values in the value Dictionary
     are then copied to properties in the user's permanent profile. --%>
  <tr>
    <td valign=middle align=right>User Name:</td>
    <td><dsp:input bean="ProfileFormHandler.value.login" maxsize="20" size="20"
type="text"/></td>
  </tr>

  <tr>
    <td valign=middle align=right>Password:</td>
    <td><dsp:input bean="ProfileFormHandler.value.password" maxsize="35" size="35"
type="password"/></td>
  </tr>

<%-- When the user submits the form, the Profile Form Handler checks
     whether the value in the confirmpassword field matches the value in
     the password field. If the values don't match, the Profile Form Handler
     produces an error, and does not create the new profile. --%>

  <tr>
    <td valign=middle align=right>Password Confirmation:</td>
    <td><dsp:input bean="ProfileFormHandler.value.confirmpassword" maxsize="35"
size="35" type="password"/></td>
  </tr>

  <tr>
    <td valign=middle align=right>Email Address:</td>
    <td><dsp:input bean="ProfileFormHandler.value.email" maxsize="30" size="30"
type="text"/></td>
  </tr>

  <tr>
    <td valign=middle align=right>Gender:</td>
    <td>
    <dsp:input bean="ProfileFormHandler.value.gender" type="radio"
value="male"/>Male
    <dsp:input bean="ProfileFormHandler.value.gender" type="radio"
value="female"/>Female
    </td>
  </tr>

<%-- This line invokes the Profile Form Handler's create operation, which creates
     a new permanent profile using the values in the value Dictionary. --%>
  <tr>
    <td valign=middle align=right></td>
    <td>
    <dsp:input bean="ProfileFormHandler.create" type="submit" value="Register"/>
    
    	<dsp:input type="hidden" bean="ProfileFormHandler.createSuccessURL"
				value="../index.jsp" />
			<dsp:input type="hidden" bean="ProfileFormHandler.createErrorURL"
				value="<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>" />
				<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>
    
    
    </td>
  </tr>
</table>

</dsp:form>
</dsp:oparam>
</dsp:droplet>

</BODY>
</HTML>
</dsp:page>