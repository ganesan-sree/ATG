<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/com/citrisys/blog/handlers/PostHandler" />
	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/Redirect" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
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
		
			<div class="createPostForm">
				<dsp:form name="createpostform" formid="createpostform"
					action="createPost.jsp" method="post">
					<dsp:valueof param="blogId"></dsp:valueof>
					<div class="form_row">
						<label class="labels"><strong>Title</strong></label>
						<dsp:input type="text" bean="PostHandler.postTitle" name="title"
							size="25" />
					</div>
					<div class="form_row">
						<label class="labels"><strong>Content</strong></label>
						<dsp:textarea bean="PostHandler.postContent" name="content" />
					</div>
					<div class="form_row">
						<dsp:input type="submit" bean="PostHandler.create" value="Create" />
						<dsp:input type="hidden" bean="PostHandler.successURL"
							value="home.jsp" />
						<dsp:input type="hidden" bean="PostHandler.errorURL"
							value="createBlog.jsp" />

						<dsp:input type="hidden" bean="PostHandler.blogId"
							paramvalue="blogId" />
					</div>
				</dsp:form>
			</div>
			
		</div>
	</div>
	<dsp:include src="/common/footer.jsp" />
</dsp:page>
