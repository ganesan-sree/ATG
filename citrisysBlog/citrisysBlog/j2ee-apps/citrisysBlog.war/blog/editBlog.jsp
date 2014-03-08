<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/com/citrisys/blog/handlers/BlogHandler" />
	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/Redirect" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:importbean bean="/com/citrisys/blog/droplet/BlogItemLookupDroplet" />
	
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
			<div class="BlogForm">
				<dsp:form name="blogform" formid="blogform" action="<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>">
					<dsp:droplet name="BlogItemLookupDroplet">
						<dsp:param name="id" param="blogId"/>
						<dsp:param name="elementName" value="blogRepo" />
						<dsp:oparam name="output">
							<div class="form_row">
								<dsp:getvalueof var="title" param="blogRepo.id" />
								<label class="labels"><strong>Title</strong></label>
								<dsp:input type="text" bean="BlogHandler.blogTitle" name="title"
									size="25" paramvalue="blogRepo.title" />
							</div>
							<div class="form_row">
								<dsp:input type="hidden" bean="BlogHandler.successURL"
									value="../blog/home.jsp" />
								<dsp:input type="hidden" bean="BlogHandler.errorURL"
									value="<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>" />
								<dsp:input type="submit" bean="BlogHandler.update"
									value="Update" />
								<dsp:input type="hidden" bean="BlogHandler.blogId"
									paramvalue="blogRepo.id" />
							</div>
						</dsp:oparam>
					</dsp:droplet>
					</dsp:form>
			</div>

		</div>
	</div>
	<dsp:include src="/common/footer.jsp" />
</dsp:page>
