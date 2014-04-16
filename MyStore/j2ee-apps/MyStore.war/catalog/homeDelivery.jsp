<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>

	<dsp:importbean bean="/com/ff/payment/homedelivery/CreateHomeDelivery" />
	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/dynamo/droplet/ComponentExists" />


	<hr width="900px">
	<h3>Enter new HomeDelivery</h3>

	<dsp:form action="billing.jsp" method="post">

<table>

	<tr>
	<th>Home Delivery Name</th>
	<td><dsp:input bean="CreateHomeDelivery.homeDeliveryName" type="text" /></td>
	</tr>
		<tr>
			<th>FirstName:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.firstName"
				beanvalue="Profile.firstName" size="30" type="text" /></td>
		</tr>
		<tr>
			<th>MiddleName:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.middleName"
				beanvalue="Profile.middleName" size="30" type="text" /></td>
		</tr>
		<tr>
			<th>LastName:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.lastName"
				beanvalue="Profile.lastName" size="30" type="text" /></td>
		</tr>
		<tr>
			<th>EmailAddress:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.email"
				beanvalue="Profile.email" size="30" type="text" /></td>
		</tr>
		<tr>
			<th>PhoneNumber:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.phoneNumber"
				beanvalue="Profile.daytimeTelephoneNumber" size="30" type="text" />
			<dsp:droplet name="ComponentExists">
				<dsp:param name="path" value="/atg/modules/B2BCommerce" />
				<dsp:oparam name="true"></td>
		</tr>
		<tr>
			<th>Address:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.address1"
				beanvalue="Profile.defaultBillingAddress.address1" size="30"
				type="text" /></td>
		</tr>
		<tr>
			<th>Address (line 2):</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.address2"
				beanvalue="Profile.defaultBillingAddress.address2" size="30"
				type="text" /></td>
		</tr>
		<tr>
			<th>City:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.city"
				beanvalue="Profile.defaultBillingAddress.city" size="30" type="text" />
			</td>
		</tr>
		<tr>
			<th>State:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.state"
				beanvalue="Profile.defaultBillingAddress.state" size="30"
				type="text" /></td>
		</tr>
		<tr>
			<th>PostalCode:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.postalCode"
				beanvalue="Profile.defaultBillingAddress.postalCode" size="30"
				type="text" /></td>
		</tr>
		<tr>
			<th>Country:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.country"
				beanvalue="Profile.defaultBillingAddress.country" size="30"
				type="text" /> </dsp:oparam> <dsp:oparam name="false"></td>
		</tr>
		<tr>
			<th>Address:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.address1"
				beanvalue="Profile.billingAddress.address1" size="30" type="text" />
			</td>
		</tr>
		<tr>
			<th>Address (line 2):</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.address2"
				beanvalue="Profile.billingAddress.address2" size="30" type="text" />
			</td>
		</tr>
		<tr>
			<th>City:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.city"
				beanvalue="Profile.billingAddress.city" size="30" type="text" /></td>
		</tr>
		<tr>
			<th>State:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.state"
				beanvalue="Profile.billingAddress.state" size="30" type="text" /></td>
		</tr>
		<tr>
			<th>PostalCode:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.postalCode"
				beanvalue="Profile.billingAddress.postalCode" size="30" type="text" />
			</td>
		</tr>
		<tr>
			<th>Country:</th>
			<td><dsp:input
				bean="CreateHomeDelivery.homeDelivery.billingAddress.country"
				beanvalue="Profile.billingAddress.country" size="30" type="text" />
			</dsp:oparam> </dsp:droplet></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><dsp:input
				bean="CreateHomeDelivery.copyToProfile" type="checkbox" /> Check to
			add card to profile</td>
		</tr>
		<tr>
			<td colspan="2" align="right"><dsp:input
				bean="CreateHomeDelivery.successURL" type="hidden"
				value="billing.jsp?init=false" /> <dsp:input
				bean="CreateHomeDelivery.eErrorURL" type="hidden"
				value="billing.jsp" /> <dsp:input
				bean="CreateHomeDelivery.create" id="button" type="submit"
				value="Enter Credit Card" /></td>
		</tr>
		</table>
	</dsp:form>

</dsp:page>