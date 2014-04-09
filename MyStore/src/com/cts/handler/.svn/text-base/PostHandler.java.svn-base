package com.citrisys.blog.handlers;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import javax.servlet.ServletException;

import com.citrisys.blog.constants.CitrisysBlogConstants;

import atg.droplet.DropletException;
import atg.droplet.GenericFormHandler;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.ServletUtil;
import atg.userprofiling.Profile;

public class PostHandler extends GenericFormHandler {
	String successURL, errorURL;
	String postTitle, postContent;
	String blogId = null;
	String postId = null;
	Profile profile;
	MutableRepository blogRepo;

	public Profile getProfile() {
		return (Profile) ServletUtil.getCurrentUserProfile();
	}

	public String getSuccessURL() {
		return successURL;
	}

	public void setSuccessURL(String successURL) {
		this.successURL = successURL;
	}

	public String getErrorURL() {
		return errorURL;
	}

	public void setErrorURL(String errorURL) {
		this.errorURL = errorURL;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
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

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public boolean handleCreate(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {
		try {
			MutableRepositoryItem item = getBlogRepo().createItem(
					CitrisysBlogConstants.ITEM_DESCRIPTOR_POST);
			item.setPropertyValue(CitrisysBlogConstants.PROPERTY_POST_TITLE,
					getPostTitle());
			item.setPropertyValue(CitrisysBlogConstants.PROPERTY_POST_CONTENT,
					getPostContent());
			item.setPropertyValue(CitrisysBlogConstants.PROPERTY_POST_AUTHOR,
					getProfile().getDataSource());
			item = (MutableRepositoryItem) getBlogRepo().addItem(item);

			MutableRepositoryItem blog = (MutableRepositoryItem) getBlogRepo()
					.getItem(getBlogId(),
							CitrisysBlogConstants.ITEM_DESCRIPTOR_BLOG);

			Set postItemSet = new HashSet();
			postItemSet = (Set) blog
					.getPropertyValue(CitrisysBlogConstants.PROPERTY_SET_POSTS);
			postItemSet.add(item);
			blog.setPropertyValue(CitrisysBlogConstants.PROPERTY_SET_POSTS,
					postItemSet);

		} catch (RepositoryException e) {
			addFormException(new DropletException("Error in creating post Item"));
			if (isLoggingError()) {
				logError("Exception catched while creating post item");
			}
		}
		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);

	}

	public boolean handleUpdate(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {
		try {

			MutableRepositoryItem item = (MutableRepositoryItem) getBlogRepo()
					.getItem(getPostId(),
							CitrisysBlogConstants.ITEM_DESCRIPTOR_POST);
			item.setPropertyValue(CitrisysBlogConstants.PROPERTY_POST_TITLE,
					getPostTitle());
			item.setPropertyValue(CitrisysBlogConstants.PROPERTY_POST_CONTENT,
					getPostContent());
			getBlogRepo().updateItem(item);

		} catch (RepositoryException e) {
			addFormException(new DropletException("Error in updating post Item"));
			if (isLoggingError()) {
				logError("Exception catched while updating post item");
			}
		}
		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean handleDelete(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {

		try {

			MutableRepositoryItem postItem = (MutableRepositoryItem) getBlogRepo()
					.getItem(getPostId(),
							CitrisysBlogConstants.ITEM_DESCRIPTOR_POST);

			MutableRepositoryItem blogItem = (MutableRepositoryItem) getBlogRepo()
					.getItem(getBlogId(),
							CitrisysBlogConstants.ITEM_DESCRIPTOR_BLOG);
			Set blogpost = (Set) blogItem
					.getPropertyValue(CitrisysBlogConstants.PROPERTY_SET_POSTS);
			blogpost.remove(postItem);
			blogItem.setPropertyValue(CitrisysBlogConstants.PROPERTY_SET_POSTS,
					blogpost);

			Set<MutableRepositoryItem> postComments = (Set) postItem
					.getPropertyValue(CitrisysBlogConstants.PROPERTY_SET_COMMENTS);
			getBlogRepo().removeItem(getPostId(),
					CitrisysBlogConstants.ITEM_DESCRIPTOR_POST);

			for (MutableRepositoryItem comment : postComments) {

				MutableRepositoryItem commentItem = (MutableRepositoryItem) getBlogRepo()
						.getItem(comment.getRepositoryId(),
								CitrisysBlogConstants.ITEM_DESCRIPTOR_COMMENT);
				deleteUserRelation(commentItem,
						CitrisysBlogConstants.PROPERTY_SET_COMMENTS);
				getBlogRepo().removeItem(comment.getRepositoryId(),
						CitrisysBlogConstants.ITEM_DESCRIPTOR_COMMENT);

			}

		} catch (Exception e) {
			addFormException(new DropletException("Error in deleting post Item"));
			if (isLoggingError()) {
				logError("Exception catched while deleting post item");
			}
		}
		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);
	}

	@SuppressWarnings("rawtypes")
	public void deleteUserRelation(MutableRepositoryItem item, String property)
			throws RepositoryException {

		Set userRelation = (Set) getProfile().getPropertyValue(property);
		userRelation.remove(item);
		getProfile().setPropertyValue(property, userRelation);

	}
}
