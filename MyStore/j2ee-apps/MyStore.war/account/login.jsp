<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	
	
	
	<dsp:droplet name="Switch">
		<dsp:param bean="ProfileFormHandler.profile.transient" name="value" />
		<dsp:oparam name="false">		
			<dsp:droplet name="/atg/dynamo/droplet/Redirect">
				<dsp:param name="url" value="/blog/home.jsp" />
			</dsp:droplet>
		</dsp:oparam>
	</dsp:droplet>
	
	
	<dsp:include src="/common/header.jsp">
		<dsp:param name="title" value="Login" />
	</dsp:include>

	<div class="content_wrapper">

		<div class="content">
			<div class="login-wrapper">
				<dsp:droplet name="Switch">
					<dsp:param bean="ProfileFormHandler.formError" name="value" />
					<dsp:oparam name="true">
						<div class="prod_box_big">
							<div class="top_prod_box_big"></div>
							<div class="center_prod_box_big">
								<div align="left">
									<font color="cc0000">
									 <dsp:droplet	name="ProfileErrorMessageForEach">
											<dsp:param bean="ProfileFormHandler.formExceptions"
												name="exceptions" />
											<dsp:oparam name="outputStart">
												<ul>
											</dsp:oparam>
											<dsp:oparam name="output">
												<li><font color="red"><dsp:valueof
															param="message" /></font></li>
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


				<dsp:form name="loginform" formid="loginform" action="login.jsp"
					method="post">
					<div class="center_title_bar">Enter Your Login Credentials</div>

					<div class="form_row">
						<label class="contact"><strong>Email</strong></label>
						<dsp:input type="text" bean="ProfileFormHandler.value.login"
							name="login" size="25" iclass="textbox" />
					</div>

					<div class="form_row">
						<label class="contact"><strong>Password</strong></label>
						<dsp:input type="password"
							bean="ProfileFormHandler.value.password" iclass="textbox" />
					</div>

					<div class="form_row">
						<dsp:input type="submit" bean="ProfileFormHandler.login"
							value="Login" />
						<dsp:input type="hidden" bean="ProfileFormHandler.loginSuccessURL"
							value="../blog/home.jsp" />
						<dsp:input type="hidden" bean="ProfileFormHandler.loginErrorURL"
							value="login.jsp" />

					</div>

				</dsp:form>
			</div>
		</div>

	</div>
	<dsp:include src="/common/footer.jsp" />
</dsp:page>
