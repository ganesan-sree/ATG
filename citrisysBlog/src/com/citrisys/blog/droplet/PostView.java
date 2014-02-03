package com.citrisys.blog.droplet;

import java.io.IOException;
import java.util.Set;
import java.util.logging.Logger;

import javax.servlet.ServletException;

import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

public class PostView extends DynamoServlet {

	MutableRepository blogRepo;
	String postId = null;

	public MutableRepository getBlogRepo() {
		return blogRepo;
	}

	public void setBlogRepo(MutableRepository blogRepo) {
		this.blogRepo = blogRepo;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public void service(DynamoHttpServletRequest request,
			DynamoHttpServletResponse response) throws ServletException,
			IOException {

		Logger log = Logger.getLogger("log_file");
		setPostId(request.getParameter("postId"));
		log.info("Post Id is: " + getPostId());

		try {
			if (getPostId() != null) {
				MutableRepositoryItem postItem = (MutableRepositoryItem) getBlogRepo()
						.getItem(getPostId(), "post");
				Set comments = (Set) postItem.getPropertyValue("comments");
				request.setParameter("post", postItem);
				request.setParameter("commentlist", comments);
			} else {

				log.info("Post Id is null");
			}

		} catch (RepositoryException e) {
			e.printStackTrace();
		}
		request.serviceParameter("output", request, response);
	}
}
