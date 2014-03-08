<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>
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

			<div class="create-blog">
				<div class="blog-links">
					<dsp:a href="createBlog.jsp">Create Blog</dsp:a>
					<dsp:a href="allBlogs.jsp">View all blogs</dsp:a>
				</div>
			</div>
			<dsp:include src="bloglist.jsp">
				<dsp:param name="view" value="user" />
			</dsp:include>
		</div>
	</div>
	<dsp:include src="/common/footer.jsp" />
</dsp:page>