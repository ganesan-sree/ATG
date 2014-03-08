<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/com/citrisys/blog/handlers/BlogHandler" />
	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/Redirect" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
	<dsp:droplet name="Switch">
		<dsp:param bean="ProfileFormHandler.profile.transient" name="value" />
		<dsp:oparam name="true">
			<dsp:droplet name="/atg/dynamo/droplet/Redirect">
				<dsp:param name="url" value="../index.jsp" />
			</dsp:droplet>
		</dsp:oparam>
	</dsp:droplet>
	<dsp:include src="/common/header.jsp">
		<dsp:param name="title" value="Home" />
	</dsp:include>
	<div class="content_wrapper">
		<div class="content">
			<div class="createBlogForm">
				<dsp:form name="createblogform" formid="createblogform"
					action="createBlog.jsp" method="post">
					<dsp:droplet name="Switch">
						<dsp:param bean="BlogHandler.formError" name="value" />
						<dsp:oparam name="true">
							<dsp:droplet name="ErrorMessageForEach">
								<dsp:param bean="BlogHandler.formExceptions" name="exceptions" />
								<dsp:oparam name="output">
									<dsp:valueof param="message" />
								</dsp:oparam>
							</dsp:droplet>
						</dsp:oparam>
					</dsp:droplet>
					<div class="form_row">
						<label class="labels"><strong>Title</strong></label>
						<dsp:input type="text" bean="BlogHandler.blogTitle" name="title"
							size="25" />
					</div>
					<div class="form_row">
						<dsp:input type="submit" bean="BlogHandler.create" value="Create" />
						<dsp:input type="hidden" bean="BlogHandler.successURL"
							value="home.jsp" />
						<dsp:input type="hidden" bean="BlogHandler.errorURL"
							value="createBlog.jsp" />
					</div>
				</dsp:form>
			</div>

		</div>
	</div>
	<dsp:include src="/common/footer.jsp" />
</dsp:page>
