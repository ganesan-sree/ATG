<%@ taglib uri="/dspTaglib" prefix="dsp"%>

<dsp:page>

<html>
<head>
  <title>Login Form</title>
</head>

<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>
<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>

<!-- This form should not show what the current profile attributes are so we will
     disable the ability to extract default values from the profile. -->
<dsp:setvalue bean="ProfileFormHandler.extractDefaultValuesFromProfile" value="false"/>

<body>

  <dsp:droplet name="Switch">
    <dsp:param bean="ProfileFormHandler.profile.transient" name="value"/>
    <dsp:oparam name="false">
      You are currently logged in. If you wish to login as a different user
      please logout first.
    </dsp:oparam>

    <dsp:oparam name="default">
      <dsp:form action="registration.jsp" method="post">
        <dsp:input bean="ProfileFormHandler.loginSuccessURL" type="hidden" value="/ff"/>

        <dsp:droplet name="Switch">
          <dsp:param bean="ProfileFormHandler.formError" name="value"/>
          <dsp:oparam name="true">
            <font color="cc0000"><strong><ul>
              <dsp:droplet name="ProfileErrorMessageForEach">
                <dsp:param bean="ProfileFormHandler.formExceptions" name="exceptions"/>
                <dsp:oparam name="output">
                  <li> <dsp:valueof param="message"/>
                </dsp:oparam>
              </dsp:droplet>
            </ul></strong></font>
          </dsp:oparam>
        </dsp:droplet>

        <table width="90%" border="0" cellpadding="10px" cellspacing="0" style="text-indent:20px; background-color:#e8e8e8;">
        <tr style="background-color:#e8e8e8; padding:0px; margin:0;">
        <td style="background-color:transparent; background-image:url(../img/profile/bghd.png); border:1px solid #1d2753;">
       <font id="member">Members Login</font>
        </td>
        <td>
        </td>
        </tr>
          <tr>
            <th valign="middle" align="right" style="border-top:1px outset #1d2753; border-left:3px outset #1d2753; ">User Name:</th>
            <td style="border-top:1px outset #1d2753; border-right:3px outset #1d2753; ">
            <dsp:input bean="ProfileFormHandler.value.login" maxsize="20" size="20" type="text"/></td>
          </tr>

          <tr>
            <th valign="middle" align="right" style="border-left:3px outset #1d2753; ">Password:</th>
            <td style="border-right:3px outset #1d2753; ">
            <dsp:input bean="ProfileFormHandler.value.password" maxsize="35" size="20" type="password"/></td>
          </tr>

          <tr>
            <td valign="middle" align="center" style="text-indent:200px; border-left:3px outset #1d2753; border-right:3px outset #1d2753;" colspan="2">
            <dsp:input bean="ProfileFormHandler.Login" type="submit" value="login" id="button" style="background-image:url(../img/profile/bghd.png);" />
            </td>
          </tr>
           <tr>
            <td valign="middle" align="center" style="border-left:3px outset #1d2753; border-right:3px outset #1d2753;" colspan="2">
            <dsp:a href="forgotPassword.jsp">Forgot Password</dsp:a></td>
          </tr>
          <tr>
            <td valign="middle" align="center" style="border:3px outset #1d2753; border-top:none;" colspan="2">
           <a href="registration.jsp">
		   New Users Click here
		   </a></td>
          </tr>
        </table>

      </dsp:form>
    </dsp:oparam>
  </dsp:droplet>
</body>
</html>


</dsp:page>
