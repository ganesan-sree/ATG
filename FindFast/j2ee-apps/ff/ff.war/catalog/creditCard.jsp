<%@ taglib uri="/dspTaglib" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>

<dsp:importbean bean="/atg/commerce/order/purchase/CreateCreditCardFormHandler"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>
<dsp:importbean bean="/atg/dynamo/droplet/ComponentExists"/>
<script language="javascript">
  window.onload=function populateYearSelect()
  {
  		d = new Date();
       curr_year = d.getFullYear();
       document.getElementById("mon").selectedIndex = d.getMonth();
       var yr=d.getFullYear();
       for (i=0; i<10 ;i++)
       {
       document.getElementById("year").options[i].text=yr++;
       document.getElementById("year").options[i].value=yr;
       }
       document.getElementById("year").selectedIndex=0;
  }
 </script>
       
<hr width="900px">
<h3>Enter new CreditCard information</h3>

<dsp:form action="creditCard.jsp" method="post">
<table id="hardgood">
<tr>
<th>
CreditCard NickName:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCardName" size="30" type="text" beanvalue="Profile.firstName"/>
</td>
</tr>
<tr>
<th>
CreditCardNumber:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.CreditCardNumber" maxsize="20" size="20" type="text" value="4111111111111111"/>
</td>
</tr>
<tr>
<th>
CreditCardType:</th><td>
<dsp:select bean="CreateCreditCardFormHandler.creditCard.creditCardType" required="<%=true%>">
<dsp:option value="Visa"/>Visa
<dsp:option value="MasterCard"/>Master Card
<dsp:option value="American Express"/>American Express
</dsp:select>

</td>
</tr>
<tr>
<th>ExpirationMonth: </th><td>
<dsp:select bean="CreateCreditCardFormHandler.creditCard.ExpirationMonth" id="mon">
<dsp:option value="1"/>January
<dsp:option value="2"/>February
<dsp:option value="3"/>March
<dsp:option value="4"/>April
<dsp:option value="5"/>May
<dsp:option value="6"/>June
<dsp:option value="7"/>July
<dsp:option value="8"/>August
<dsp:option value="9"/>September
<dsp:option value="10"/>October
<dsp:option value="11"/>November
<dsp:option value="12"/>December
</dsp:select>

</td>
</tr>
<tr>
<th>
ExpirationYear: </th><td>
<dsp:select bean="CreateCreditCardFormHandler.creditCard.expirationYear" id="year">
<dsp:option />
<dsp:option />
<dsp:option />
<dsp:option />
<dsp:option />
<dsp:option />
<dsp:option />
<dsp:option />
<dsp:option />
<dsp:option />
</dsp:select>


</td>
</tr>
<tr>
<th>FirstName:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.firstName" beanvalue="Profile.firstName" size="30" type="text"/>
</td>
</tr>
<tr>
<th>MiddleName:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.middleName" beanvalue="Profile.middleName" size="30" type="text"/>
</td>
</tr>
<tr>
<th>LastName:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.lastName" beanvalue="Profile.lastName" size="30" type="text"/>
</td>
</tr>
<tr>
<th>EmailAddress:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.email" beanvalue="Profile.email" size="30" type="text"/>
</td>
</tr>
<tr>
<th>PhoneNumber:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.phoneNumber" beanvalue="Profile.daytimeTelephoneNumber" size="30" type="text"/>
<dsp:droplet name="ComponentExists">
  <dsp:param name="path" value="/atg/modules/B2BCommerce"/>
  <dsp:oparam name="true">
</td>
</tr>
<tr>
<th>Address:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.address1" beanvalue="Profile.defaultBillingAddress.address1" size="30" type="text"/>
</td>
</tr>
<tr>
<th>Address (line 2):</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.address2" beanvalue="Profile.defaultBillingAddress.address2" size="30" type="text"/>
</td>
</tr>
<tr>
<th>City:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.city" beanvalue="Profile.defaultBillingAddress.city" size="30" type="text"/>
</td>
</tr>
<tr>
<th>State:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.state" beanvalue="Profile.defaultBillingAddress.state" size="30" type="text"/>
</td>
</tr>
<tr>
<th>PostalCode:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.postalCode" beanvalue="Profile.defaultBillingAddress.postalCode" size="30" type="text"/>
</td>
</tr>
<tr>
<th>Country:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.country" beanvalue="Profile.defaultBillingAddress.country" size="30" type="text"/>
  </dsp:oparam>
  <dsp:oparam name="false">
</td>
</tr>
<tr>
<th>Address:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.address1" beanvalue="Profile.billingAddress.address1" size="30" type="text"/>
</td>
</tr>
<tr>
<th>Address (line 2):</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.address2" beanvalue="Profile.billingAddress.address2" size="30" type="text"/>
</td>
</tr>
<tr>
<th>City:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.city" beanvalue="Profile.billingAddress.city" size="30" type="text"/>
</td>
</tr>
<tr>
<th>State:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.state" beanvalue="Profile.billingAddress.state" size="30" type="text"/>
</td>
</tr>
<tr>
<th>PostalCode:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.postalCode" beanvalue="Profile.billingAddress.postalCode" size="30" type="text"/>
</td>
</tr>
<tr>
<th>Country:</th><td><dsp:input bean="CreateCreditCardFormHandler.creditCard.billingAddress.country" beanvalue="Profile.billingAddress.country" size="30" type="text"/>
  </dsp:oparam>
</dsp:droplet>
</td>
</tr>
<tr>
<td colspan="2" align="center"><dsp:input bean="CreateCreditCardFormHandler.copyToProfile" type="checkbox"/> Check to add card to profile
</td>
</tr>
<tr>
<td colspan="2" align="right">

<dsp:input bean="CreateCreditCardFormHandler.newCreditCardSuccessURL" type="hidden" value="billing.jsp?init=false"/>
<dsp:input bean="CreateCreditCardFormHandler.newCreditCardErrorURL" type="hidden" value="creditCard.jsp"/>
<dsp:input bean="CreateCreditCardFormHandler.newCreditCard" id="button" type="submit" value="Enter Credit Card"/>
</td>
</tr>
</table>
</dsp:form>

</dsp:page>