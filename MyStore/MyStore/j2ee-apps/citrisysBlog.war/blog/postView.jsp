<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>
	<script>
  function submit(form) {
    form.submit();
  }
</script>
	<dsp:importbean bean="/com/citrisys/blog/droplet/PostView" />
	<dsp:importbean bean="/com/citrisys/blog/handlers/CommentHandler" />
	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/Redirect" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
	<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty" />
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
			<dsp:droplet name="IsEmpty">
				<dsp:param name="value" param="postId" />
				<dsp:oparam name="true">
					<dsp:getvalueof var="postid" bean="CommentHandler.postId" />
				</dsp:oparam>
				<dsp:oparam name="false">
					<dsp:getvalueof var="postid" param="postId"></dsp:getvalueof>
				</dsp:oparam>
			</dsp:droplet>

			<dsp:droplet name="PostView">
				<dsp:param name="postId" value="${postid}" />
				<dsp:oparam name="output">
					<div class="post">
						<dsp:valueof param="post.title" />
						<br />
						<dsp:valueof param="post.content" />
						<br /> <br />
					</div>
					<div class="comments">
						<dsp:droplet name="ForEach">
							<dsp:param name="array" param="commentlist" />
							<dsp:param name="elementName" value="comment" />
							<dsp:oparam name="empty">
    						There are no comments<br />
							</dsp:oparam>
							<dsp:oparam name="outputStart">
								<div class="list">
									comments: <br />
									<div class="divTable">
							</dsp:oparam>
							<dsp:oparam name="output">
								<div class="divRow">
									<div class="divCell">
										<p>
											<dsp:valueof param="comment.description" />
										</p>
										<span class="author">CommentBy:</span>
										<span>
											<dsp:valueof param="comment.user.firstname" />
										</span>
									</div>
									<div class="divCell">
										<dsp:a href="editComment.jsp">
											<img src="../images/edit.png">
											<dsp:param name="commentId" param="comment.id"/>
										</dsp:a>
									</div>
									<div class="divCell">
										<dsp:form method="post" name="commentdeleteform">
										<dsp:a href="javascript:submit(document.commentdeleteform)">
											<img src="../images/delete.png">
											<dsp:input type="hidden" bean="CommentHandler.delete" value="Delete"/>
								 			<dsp:input type="hidden" bean="CommentHandler.successURL" value="postView.jsp" />
											<dsp:input type="hidden" bean="CommentHandler.errorURL" value="postView.jsp" />
											<dsp:input type="hidden" bean="CommentHandler.postId" value="${postid}" />
											<dsp:input type="hidden" bean="CommentHandler.commentId" paramvalue="comment.id" />
											
										</dsp:a>
										</dsp:form>
									</div>
								</div>
								<div class="clearer">&nbsp;</div>
							</dsp:oparam>
							<dsp:oparam name="outputEnd">
					</div>
		</div>
		</dsp:oparam>
		</dsp:droplet>
		</dsp:oparam>
		</dsp:droplet>

		<div class="addCommentForm">
			<dsp:form name="addcommentform" formid="addcommentform"
				action="postView.jsp" method="post">
				<div class="form_row">

					<dsp:textarea bean="CommentHandler.comment" />
				</div>
				<div class="form_row">
					<dsp:input type="submit" bean="CommentHandler.create"
						value="Add Comment" />
					<dsp:input type="hidden" bean="CommentHandler.successURL"
						value="postView.jsp" />
					<dsp:input type="hidden" bean="CommentHandler.errorURL"
						value="postView.jsp" />
					<dsp:input type="hidden" bean="CommentHandler.postId" value="${postid}" />
				</div>
			</dsp:form>
		</div>
	</div>
	<div class="clearer">&nbsp;</div>
	</div>
	</div>
	<dsp:include src="/common/footer.jsp" />
</dsp:page>