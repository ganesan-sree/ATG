<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>

	<dsp:importbean bean="/com/citrisys/blog/droplet/BlogList" />
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/dynamo/droplet/Compare" />
	<dsp:importbean bean="/com/citrisys/blog/handlers/BlogHandler" />
	<dsp:valueof bean="BlogHandler.successMessage"></dsp:valueof>
	<dsp:setvalue bean="BlogHandler.successMessage" value=""/>
	<div class="list">
		<dsp:setvalue param="user" value="user" />
		<dsp:droplet name="Compare">
			<dsp:param name="obj1" param="view" />
			<dsp:param name="obj2" param="user" />
			<dsp:oparam name="equal">
				<dsp:droplet name="ForEach">
					<dsp:param name="array" bean="Profile.blogs" />
					<dsp:param name="elementName" value="blog" />
					<dsp:oparam name="empty">
    				There are no blogs<br />
					</dsp:oparam>
					<dsp:oparam name="outputStart">
    				Your blogs: <br />
						<div class="divTable">
					</dsp:oparam>
					<dsp:oparam name="output">
						<div class="divRow">
							<div class="divCell">
								<dsp:a href="blogView.jsp">
									<dsp:valueof param="blog.title" />
									<dsp:param name="blogId" param="blog.id" />
								</dsp:a>
							</div>
							<div class="divCell">
								<dsp:a href="editBlog.jsp">
									<img src="../images/edit.png">
									<dsp:param name="blogId" param="blog.id" />
								</dsp:a>
							</div>
							<div class="divCell">
								<dsp:form method="post" action="home.jsp" name="blogdeleteform">
									<%-- <dsp:a href="javascript:submit(document.blogdeleteform)">
										<img src="../images/delete.png">
									</dsp:a> --%>
									<dsp:input type="submit" bean="BlogHandler.delete"
										value="Delete" />
									<dsp:input type="hidden" bean="BlogHandler.successURL"
										value="home.jsp" />
									<dsp:input type="hidden" bean="BlogHandler.errorURL"
										value="home.jsp" />
									<dsp:input type="hidden" bean="BlogHandler.blogId" paramvalue="blog.id" />
									
								</dsp:form>
							</div>
						</div>
						<div class="clearer">&nbsp;</div>
					</dsp:oparam>
					<dsp:oparam name="outputEnd">
	</div>
	</dsp:oparam>
	</dsp:droplet>
	</dsp:oparam>
	<dsp:oparam name="default">
		<dsp:droplet name="BlogList">
			<dsp:oparam name="output">
				<dsp:droplet name="ForEach">
					<dsp:param name="array" param="bloglist" />
					<dsp:param name="elementName" value="blog" />
					<dsp:oparam name="empty">
    						There are no blogs<br />
					</dsp:oparam>
					<dsp:oparam name="outputStart">
    						All blogs: <br />
						<ul>
					</dsp:oparam>
					<dsp:oparam name="output">
						<li><dsp:a href="blogView.jsp">
								<dsp:valueof param="blog.title" />
								<dsp:param name="blogId" param="blog.id" />
							</dsp:a></li>
					</dsp:oparam>
					<dsp:oparam name="outputEnd">
						</ul>
					</dsp:oparam>
				</dsp:droplet>
			</dsp:oparam>
		</dsp:droplet>
	</dsp:oparam>
	</dsp:droplet>
	</div>
		<script>
  function submit(form) {
    form.submit();
  }
</script>
</dsp:page>