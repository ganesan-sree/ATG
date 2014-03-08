<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/com/citrisys/blog/handlers/PostHandler" />
	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/Redirect" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:importbean bean="/com/citrisys/blog/droplet/PostItemLookupDroplet" />
	
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
			<div class="PostForm">
				<dsp:form name="postform" formid="postform" action="<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>">
					<dsp:droplet name="PostItemLookupDroplet">
						<dsp:param name="id" param="postId"/>
						<dsp:param name="elementName" value="post" />
						<dsp:oparam name="output">
							<div class="form_row">
								<label class="labels"><strong>Title</strong></label>
								<dsp:input type="text" bean="PostHandler.postTitle" name="title"
									size="25" paramvalue="post.title" />
							</div>
							<div class="form_row">
								<label class="labels"><strong>Content</strong></label>
								<dsp:getvalueof var="content" param="post.content" />
								<dsp:textarea bean="PostHandler.postContent" default="${content}"/>
							</div>
							<div class="form_row">
								<dsp:input type="hidden" bean="PostHandler.successURL"
									value="blogView.jsp" />
								<dsp:input type="hidden" bean="PostHandler.errorURL"
									value="<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>" />
								<dsp:input type="submit" bean="PostHandler.update"
									value="Update" />
								<dsp:input type="hidden" bean="PostHandler.postId"
									paramvalue="post.id" />
							</div>
						</dsp:oparam>
						<dsp:oparam name="empty">
							No parameter specified!!!
						</dsp:oparam>
					</dsp:droplet>
					</dsp:form>
			</div>

		</div>
	</div>
	<dsp:include src="/common/footer.jsp" />
</dsp:page>
