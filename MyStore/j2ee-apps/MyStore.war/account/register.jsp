<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<%@ taglib uri="/core" prefix="core"%>
<dsp:page>

	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:importbean bean="/atg/dynamo/droplet/RQLQueryForEach" />
	<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach" />
	<dsp:importbean bean="/electronix/droplet/PopulateMonthDroplet" />
	<dsp:droplet name="Switch">
		<dsp:param bean="ProfileFormHandler.profile.transient" name="value" />
		<dsp:oparam name="false">

			<dsp:droplet name="/atg/dynamo/droplet/Redirect">
				<dsp:param name="url" value="../catalog/catalog.jsp" />
			</dsp:droplet>
		</dsp:oparam>
	</dsp:droplet>

	<dsp:droplet name="Switch">
		<dsp:param bean="ProfileFormHandler.formError" name="value" />
		<dsp:oparam name="true">
			<div class="prod_box_big">
				<div class="top_prod_box_big"></div>
				<div class="center_prod_box_big">
					<div align="left">
						<font color="cc0000"> <dsp:droplet
								name="ProfileErrorMessageForEach">
								<dsp:param bean="ProfileFormHandler.formExceptions"
									name="exceptions" />
								<dsp:oparam name="outputStart">
									<ul>
								</dsp:oparam>
								<dsp:oparam name="output">
									<li><font color="red"><dsp:valueof param="message" /></font></li>
								</dsp:oparam>
								<dsp:oparam name="outputEnd">
									</ul>
								</dsp:oparam>
							</dsp:droplet>
						</font>
					</div>
					<%-- End of left div tag --%>
				</div>
				<%-- End of center_prod_box_big div tag --%>
				<div class="bottom_prod_box_big"></div>
			</div>
			<%-- End of prod_box_big --%>
		</dsp:oparam>
		<%-- End of true oparam --%>
	</dsp:droplet>
	<%-- End of Switch Droplet --%>


	<dsp:form name="registration_form"
		action="<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>">
		<%-- This line sets the confirmPassword property to true, so the user is
     								required to confirm the password entered. --%>
		<dsp:input bean="ProfileFormHandler.confirmPassword" type="hidden"
			value="true" />
		<div class="center_title_bar">Personal Information</div>
		<div class="prod_box_big">
			<div class="top_prod_box_big"></div>
			<div class="center_prod_box_big">
				<div class="form">
					<div class="form_row">
						<label class="contact"><strong>First Name</strong></label>
						<dsp:input type="text" bean="ProfileFormHandler.value.firstName"
							iclass="textbox" />
					</div>

					<div class="form_row">
						<label class="contact"><strong>Last Name</strong></label>
						<dsp:input type="text" bean="ProfileFormHandler.value.lastName"
							iclass="textbox" />
					</div>

					<div class="form_row" align="left">
						<label class="contact"><strong>Gender</strong></label>
						<dsp:input bean="ProfileFormHandler.value.gender" type="radio"
							value="male" iclass="button" />
						Male
						<dsp:input bean="ProfileFormHandler.value.gender" type="radio"
							value="female" iclass="button" />
						Female
					</div>

				</div>
			</div>
			<div class="bottom_prod_box_big"></div>
		</div>
		<%-- End of Personal Information --%>

		<div class="center_title_bar">Account Information</div>
		<div class="prod_box_big">
			<div class="top_prod_box_big"></div>
			<div class="center_prod_box_big">
				<div class="form">
					<div class="form_row">
						<label class="contact"><strong>Email</strong></label>
						<dsp:input type="text" bean="ProfileFormHandler.value.login"
							name="email" size="20" iclass="textbox" />
					</div>

					<div class="form_row">
						<label class="contact"><strong>Password</strong></label>
						<dsp:input type="password"
							bean="ProfileFormHandler.value.password" value="" name="password"
							size="8" iclass="textbox" />
						<i>(Password must have 2 characters, 2 numbers and 2 special
							characters)</i>
					</div>

					<div class="form_row">
						<label class="contact"><strong>Confirm Password</strong></label>
						<dsp:input type="password"
							bean="ProfileFormHandler.value.confirmPassword" value=""
							name="confirmPassword" size="8" iclass="textbox" />
					</div>
				</div>
			</div>
			<div class="bottom_prod_box_big"></div>
		</div>
		<%-- End of Account Information --%>
		<div class="form_row">
			<dsp:input type="submit" bean="ProfileFormHandler.create"
				value="Register" iclass="button" />
			<dsp:input type="submit" bean="ProfileFormHandler.clear"
				value="Cancel" iclass="button" />

			<dsp:input type="hidden" bean="ProfileFormHandler.createSuccessURL"
				value="../index.jsp" />
			<dsp:input type="hidden" bean="ProfileFormHandler.createErrorURL"
				value="<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>" />
			<dsp:input type="hidden" bean="ProfileFormHandler.cancelURL"
				value="<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>" />
		</div>


	</dsp:form>
</dsp:page>
