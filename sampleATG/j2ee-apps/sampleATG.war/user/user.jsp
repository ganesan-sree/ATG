<%@ taglib uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" prefix="dsp" %>
<dsp:page>
<HTML>
<HEAD>
<TITLE>Registration Form</TITLE>
</HEAD>
<BODY>

<dsp:importbean bean="/com/easymed/UserHandler" /> 
   <dsp:form  method="post">
      <dsp:input bean="UserHandler.successURL" type="hidden"
      value="../index.jsp"/>
      <dsp:input bean="UserHandler.errorURL" type="hidden"
      value="../genericError.jsp"/>
           
<h3>Register as a user:</h3>	   
<%-- <dsp:droplet name="Switch"> --%>
<%-- <dsp:param bean="UserHandler.formError" name="value"/> --%>
<%-- <dsp:oparam name="true"> --%>
<!--   <UL> -->
<%--     <dsp:droplet name="ProfileErrorMessageForEach"> --%>
<%--       <dsp:param bean="UserHandler.formExceptions" name="exceptions"/> --%>
<%--       <dsp:oparam name="output"> --%>
<%--      <LI> <dsp:valueof param="message"/> --%>
<%--       </dsp:oparam> --%>
<%--     </dsp:droplet> --%>
<!--     </UL> -->
<%-- </dsp:oparam> --%>
<%-- </dsp:droplet> --%>


<table width=456 border=0>
  <tr>
    <td valign=middle align=right>User Name:</td>
    <td>
      <dsp:input bean="UserHandler.userName" type="text" />
</td>
  </tr>
  <tr>
    <td valign=middle align=right>Password:</td>
    <td>
    <dsp:input bean="UserHandler.password" maxsize="35" size="35" type="password"/>
</td>
  </tr>
  <tr>
    <td valign=middle align=right>Email Address:</td>
    <td>
    <dsp:input bean="UserHandler.email" maxsize="30" size="30" type="text"/>
</td>
  </tr>
  <tr>
    <td valign=middle align=right>Gender:</td>
    <td>
    <dsp:input bean="UserHandler.gender" type="radio" value="male"/>Male
    <dsp:input bean="UserHandler.gender" type="radio" value="female"/>Female
    </td>
  </tr>
  <tr>
    <td valign=middle align=right></td>
    <td><dsp:input bean="UserHandler.create" type="submit" value="Register"/></td>
  </tr>
</table>
</dsp:form>

</BODY>
</HTML>
</dsp:page>