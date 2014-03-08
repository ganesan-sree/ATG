package com.citrisys.blog.droplet;

import java.io.IOException;
import atg.repository.MutableRepository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryView;
import atg.repository.rql.RqlStatement;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.ServletUtil;

import javax.servlet.ServletException;

import atg.servlet.DynamoServlet;
import atg.userprofiling.Profile;

public class BlogList extends DynamoServlet {

	MutableRepository blogRepo;
	Profile profile;
	String blogId = null;

	public Profile getProfile() {
		return (Profile) ServletUtil.getCurrentUserProfile();
	}

	public MutableRepository getBlogRepo() {
		return blogRepo;
	}

	public void setBlogRepo(MutableRepository blogRepo) {
		this.blogRepo = blogRepo;
	}

	public String getBlogId() {
		return blogId;
	}

	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	public void service(DynamoHttpServletRequest request,
			DynamoHttpServletResponse response) throws ServletException,
			IOException {

		if (request.getParameter("blogId") != null) {
			setBlogId(request.getParameter("blogId"));
		}

		try {
			if (getBlogId() != null) {
				MutableRepository item = (MutableRepository) getBlogRepo()
						.getItem(getBlogId(), "blog");
				request.setParameter("blog", item);
			} else {
				RepositoryView blogListView = getBlogRepo().getView("blog");
				RqlStatement query = RqlStatement.parseRqlStatement("ALL");
				RepositoryItem[] items = query.executeQuery(blogListView, null);
				request.setParameter("bloglist", items);
			}

		} catch (RepositoryException e) {
			e.printStackTrace();
		}
		request.serviceParameter("output", request, response);
	}
}
