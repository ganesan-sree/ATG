<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
<dsp:importbean bean="/atg/userprofiling/Profile" />
<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach" />
<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
<%@ page import="atg.servlet.*"%>
<dsp:page>

<dsp:a bean="ProfileFormHandler.logout" type="submit" href="/my" value="submit" iclass="nav" >Logout</dsp:a>

	






<h2>MyContent</h2>

<dsp:droplet name="/atg/targeting/TargetingForEach">
  <dsp:param bean="/atg/registry/RepositoryTargeters/MyContent" name="targeter"/>
  <dsp:oparam name="output">
    <dsp:valueof param="element"/>
<br/>
  </dsp:oparam>
</dsp:droplet>


<br/>


<dsp:droplet name="/atg/targeting/TargetingForEach">
  <dsp:param bean="/atg/registry/Slots/ww" name="targeter"/>
  <dsp:param name="fireContentEvent" value="false"/>
  <dsp:param name="fireContentTypeEvent" value="false"/>
  <dsp:oparam name="output">
HI Here this are special offers today!
<br/>
  <dsp:valueof param="element"/>
  </dsp:oparam>
  <dsp:oparam name="empty">
    No special offers today!
  </dsp:oparam>

</dsp:droplet>




</dsp:page>
