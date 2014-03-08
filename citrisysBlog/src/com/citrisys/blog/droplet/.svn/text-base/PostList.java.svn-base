package com.citrisys.blog.droplet;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;

import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryView;
import atg.repository.rql.RqlStatement;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;
import atg.servlet.ServletUtil;
import atg.userprofiling.Profile;

public class PostList extends DynamoServlet {

	MutableRepository blogRepo;
	String blogId = null;

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
		setBlogId(request.getParameter("blogId"));
		try {
			if (getBlogId() != null) {
				MutableRepositoryItem blogItem = (MutableRepositoryItem) getBlogRepo()
						.getItem(blogId, "blog");
				Set posts = (Set) blogItem.getPropertyValue("posts");
				request.setParameter("postlist", posts);
			} else {
				RepositoryView postListView = getBlogRepo().getView("post");
				RqlStatement query = RqlStatement.parseRqlStatement("ALL");
				RepositoryItem[] items = query.executeQuery(postListView, null);
				request.setParameter("postlist", items);
			}

		} catch (RepositoryException e) {
			e.printStackTrace();
		}
		request.serviceParameter("output", request, response);
	}
}
