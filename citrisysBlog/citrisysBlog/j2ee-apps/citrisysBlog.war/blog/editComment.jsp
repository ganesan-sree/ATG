<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/com/citrisys/blog/handlers/CommentHandler" />
	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/Redirect" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:importbean bean="/com/citrisys/blog/droplet/CommentItemLookupDroplet" />
	
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
			<div class="CommentForm">
				<dsp:form name="commentform" formid="commentform" action="<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>">
					<dsp:droplet name="CommentItemLookupDroplet">
						<dsp:param name="id" param="commentId"/>
						<dsp:param name="elementName" value="comment" />
						<dsp:oparam name="output">
							<div class="form_row">
								<label class="labels"><strong>Title</strong></label>
								<dsp:getvalueof var="comment" param="comment.description" />
								<dsp:textarea bean="CommentHandler.comment" default="${comment}"/>
							</div>
						
							<div class="form_row">
								<dsp:input type="hidden" bean="CommentHandler.successURL"
									value="home.jsp" />
								<dsp:input type="hidden" bean="CommentHandler.errorURL"
									value="<%=atg.servlet.ServletUtil.escapeURLString(request.getRequestURI())%>" />
								<dsp:input type="submit" bean="CommentHandler.update"
									value="Update" />
								<dsp:input type="hidden" bean="CommentHandler.commentId"
									paramvalue="comment.id" />
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
