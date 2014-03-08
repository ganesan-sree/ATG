<%@ taglib uri="/dspTaglib" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>

<dsp:page>

<%         
/* -------------------------------------------------------
 * Display an address
 * ------------------------------------------------------- */
%>
<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>


shipping value is <dsp:valueof param="address"/>
<table cellspacing=0 cellpadding=0 broder=0>
  <tr>
    <td>
       <nobr><dsp:valueof param="address.firstName"/></nobr>     
      <nobr><dsp:valueof param="address.companyName"/></nobr><br>
      <nobr><dsp:valueof param="address.address1"/></nobr><br>
      <dsp:droplet name="IsEmpty">
        <dsp:param name="value" param="address.address2"/>
        <dsp:oparam name="false">
          <nobr><dsp:valueof param="address.address2"/></nobr><br>
        </dsp:oparam>
      </dsp:droplet>    
      <dsp:droplet name="Switch">
        <dsp:param name="value" param="address.country"/>
        <dsp:oparam name="de">
          <dsp:valueof param="address.postalCode"/> <dsp:valueof param="address.city"/>
        </dsp:oparam>
        <dsp:oparam name="default">
          <dsp:valueof param="address.city"/>,
          <dsp:valueof param="address.state"/>
          <dsp:valueof param="address.postalCode"/>
        </dsp:oparam>
      </dsp:droplet>
      <br>
    </td>
  </tr>
</table>
</dsp:page>

