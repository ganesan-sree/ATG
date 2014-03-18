package com.citrisys.blog.handlers;

import java.io.IOException;
import java.util.Set;

import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.ServletUtil;
import atg.userprofiling.Profile;

import javax.servlet.ServletException;

import atg.core.util.StringUtils;
import atg.droplet.DropletException;
import atg.droplet.GenericFormHandler;

import com.citrisys.blog.constants.CitrisysBlogConstants;

public class BlogHandler extends GenericFormHandler {

	private String successMessage;
	private String successURL;
	private String errorURL;
	private String blogTitle;
	private String blogUrl;
	private String blogId;
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

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogUrl() {
		return blogUrl;
	}

	public void setBlogUrl(String blogUrl) {
		this.blogUrl = blogUrl;
	}

	public String getBlogId() {
		return blogId;
	}

	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	public MutableRepository getBlogRepo() {
		return blogRepo;
	}

	public void setBlogRepo(MutableRepository blogRepo) {
		this.blogRepo = blogRepo;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void preCreate(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) {

		if (getBlogTitle().equals("")) {
			addFormException(new DropletException("Blog Title cant be empty"));
		}
		if (getFormError() && isLoggingInfo()) {
			logInfo("Missing Required entries");
		}
	}
	
	public void postCreate(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) {

		if(isLoggingDebug()) {
			logDebug("Blog Item created");
		}
		setSuccessMessage("Blog Item Created");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean handleCreate(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {
		preCreate(pRequest, pResponse);
		if (!getFormError()) {
			try {
				MutableRepositoryItem item = getBlogRepo().createItem(CitrisysBlogConstants.ITEM_DESCRIPTOR_BLOG);
				item.setPropertyValue(CitrisysBlogConstants.PROPERTY_BLOG_TITLE, getBlogTitle());
				item.setPropertyValue(CitrisysBlogConstants.PROPERTY_BLOG_URL, getBlogTitle());
				item = (MutableRepositoryItem) getBlogRepo().addItem(item);

				Set blogItemSet = (Set) getProfile().getPropertyValue(CitrisysBlogConstants.PROPERTY_SET_BLOGS);
				blogItemSet.add(item);
				getProfile().setPropertyValue(CitrisysBlogConstants.PROPERTY_SET_BLOGS, blogItemSet);
			} catch (RepositoryException e) {
				addFormException(new DropletException("Error in creating blog Item"));
				if(isLoggingError()) {
					logError("Exception catched while creating blog item");
				}
			}
			postCreate(pRequest, pResponse);
			
		}
		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);

	}

	public boolean handleUpdate(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {
		if (StringUtils.isEmpty(getBlogTitle())) {
			addFormException(new DropletException("Blog Title can't be empty"));
			return checkFormRedirect(null, getErrorURL(), pRequest, pResponse);
		}
		try {

			MutableRepositoryItem item = (MutableRepositoryItem) getBlogRepo()
					.getItem(getBlogId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_BLOG);
			item.setPropertyValue(CitrisysBlogConstants.PROPERTY_BLOG_TITLE, getBlogTitle());
			getBlogRepo().updateItem(item);

		} catch (RepositoryException e) {

			return checkFormRedirect(null, getErrorURL(), pRequest, pResponse);
		}
		return checkFormRedirect(getSuccessURL(), null, pRequest, pResponse);

	}

	public boolean handleDelete(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {

		try {
			MutableRepositoryItem item = (MutableRepositoryItem) getBlogRepo()
					.getItem(getBlogId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_BLOG);

			deleteUserRelation(item, CitrisysBlogConstants.PROPERTY_SET_BLOGS);
			deleteBlogPosts();

		} catch (Exception e) {
			if(isLoggingError()) {
				logError("Exception catched while deleting blog item");
			}
		}

		return checkFormRedirect(getSuccessURL(), null, pRequest, pResponse);
	}

	@SuppressWarnings("rawtypes")
	public void deleteUserRelation(MutableRepositoryItem item, String property)
			throws RepositoryException {

		Set userRelation = (Set) getProfile().getPropertyValue(property);
		userRelation.remove(item);
		getProfile().setPropertyValue(property, userRelation);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void deleteBlogPosts() throws RepositoryException {

		MutableRepositoryItem item = (MutableRepositoryItem) getBlogRepo()
				.getItem(getBlogId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_BLOG);
		Set<MutableRepositoryItem> blogPosts = (Set) item
				.getPropertyValue(CitrisysBlogConstants.PROPERTY_SET_POSTS);
		getBlogRepo().removeItem(getBlogId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_BLOG);

		for (MutableRepositoryItem post : blogPosts) {

			deletePostComments(post.getRepositoryId());

		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void deletePostComments(String postId) throws RepositoryException {

		MutableRepositoryItem postItem = (MutableRepositoryItem) getBlogRepo()
				.getItem(postId, CitrisysBlogConstants.ITEM_DESCRIPTOR_POST);
		Set<MutableRepositoryItem> postComments = (Set) postItem
				.getPropertyValue(CitrisysBlogConstants.PROPERTY_SET_COMMENTS);
		getBlogRepo().removeItem(postId, CitrisysBlogConstants.ITEM_DESCRIPTOR_POST);

		for (MutableRepositoryItem comment : postComments) {

			MutableRepositoryItem commentItem = (MutableRepositoryItem) getBlogRepo()
					.getItem(comment.getRepositoryId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_COMMENT);
			deleteUserRelation(commentItem, CitrisysBlogConstants.PROPERTY_SET_COMMENTS);
			getBlogRepo().removeItem(comment.getRepositoryId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_COMMENT);

		}
	}
}
