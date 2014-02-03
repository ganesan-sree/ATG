<%@ taglib uri="/dsp" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>
	<dsp:importbean bean="/com/citrisys/blog/droplet/PostList" />
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/dynamo/droplet/Compare" />
	<div class="list">
		<dsp:setvalue param="blog" value="blog" />
		<dsp:droplet name="Compare">
			<dsp:param name="obj1" param="view" />
			<dsp:param name="obj2" param="blog" />
			<dsp:oparam name="equal">
				<dsp:droplet name="PostList">
					<dsp:param name="blogId" param="blogId" />
					<dsp:oparam name="output">
						<dsp:droplet name="ForEach">
							<dsp:param name="array" param="postlist" />
							<dsp:param name="elementName" value="post" />
							<dsp:oparam name="empty">
    						There are no posts<br />
							</dsp:oparam>
							<dsp:oparam name="outputStart">
    						All posts: <br />
								<div class="divTable">
							</dsp:oparam>
							<dsp:oparam name="output">
								<div class="divRow">
									<div class="divCell">
										<dsp:a href="postView.jsp">
											<dsp:valueof param="post.title" />
											<dsp:param name="postId" param="post.id" />
										</dsp:a>
									</div>
									<div class="divCell">
										<dsp:a href="editPost.jsp">
											<img src="../images/edit.png">
											<dsp:param name="postId" param="post.id" />
										</dsp:a>
									</div>
									<div class="divCell">
										<dsp:a href="">
											<img src="../images/delete.png">
										</dsp:a>
									</div>
								</div>
								<div class="clearer">&nbsp;</div>
							</dsp:oparam>
							<dsp:oparam name="outputEnd">
	</div>
	</dsp:oparam>
	</dsp:droplet>
	</dsp:oparam>
	</dsp:droplet>
	</dsp:oparam>
	<dsp:oparam name="default">
		<dsp:droplet name="PostList">
			<dsp:oparam name="output">
				<dsp:droplet name="ForEach">
					<dsp:param name="array" param="postlist" />
					<dsp:param name="elementName" value="post" />
					<dsp:oparam name="empty">
    						There are no blogs<br />
					</dsp:oparam>
					<dsp:oparam name="outputStart">
    						All blogs: <br />
						<ul>
					</dsp:oparam>
					<dsp:oparam name="output">
						<li><dsp:a href="postView.jsp">
								<dsp:valueof param="post.title" />
								<dsp:param name="postId" param="post.id" />
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
</dsp:page>