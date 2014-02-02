<%@ taglib uri="/dspTaglib" prefix="dsp"%>
<dsp:page>

<html>
<head>
  <title>Logout Form</title>
</head>

<dsp:importbean bean="/atg/userprofiling/Profile"/>
<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>
<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>

<body>

  <dsp:form action="/ff" method="post">

    <dsp:input bean="ProfileFormHandler.logoutSuccessURL" type="hidden" value="../index.jsp"/>

    <strong><font size="+1">
      <dsp:droplet name="Switch">
        <dsp:param bean="Profile.transient" name="value"/>
        <dsp:oparam name="false">
          Thank you for visiting <dsp:valueof bean="Profile.Login"/>
        </dsp:oparam>
        <dsp:oparam name="default">
          Thank you for visiting!
        </dsp:oparam>
      </dsp:droplet>
    </font></strong>

    <br>Click on the button below to logout.<p>

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

    <dsp:input bean="ProfileFormHandler.logout" type="submit" value="logout"/>

  </dsp:form>

</body>
</html>


</dsp:page>
