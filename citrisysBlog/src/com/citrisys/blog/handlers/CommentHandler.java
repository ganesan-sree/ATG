package com.citrisys.blog.handlers;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;

import com.citrisys.blog.constants.CitrisysBlogConstants;

import atg.droplet.DropletException;
import atg.droplet.GenericFormHandler;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.ServletUtil;
import atg.userprofiling.Profile;

public class CommentHandler extends GenericFormHandler {

	String comment;
	String postId, commentId;
	String successURL, errorURL;
	MutableRepository blogRepo;
	Profile profile;

	public Profile getProfile() {
		return (Profile) ServletUtil.getCurrentUserProfile();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
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

	public MutableRepository getBlogRepo() {
		return blogRepo;
	}

	public void setBlogRepo(MutableRepository blogRepo) {
		this.blogRepo = blogRepo;
	}

	public boolean handleCreate(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {
		try {
			MutableRepositoryItem item = getBlogRepo().createItem(CitrisysBlogConstants.ITEM_DESCRIPTOR_COMMENT);
			item.setPropertyValue(CitrisysBlogConstants.PROPERTY_COMMENT_DESCRIPTION, getComment());
			item.setPropertyValue(CitrisysBlogConstants.PROPERTY_COMMENT_USER, getProfile().getDataSource());
			item = (MutableRepositoryItem) getBlogRepo().addItem(item);

			MutableRepositoryItem post = (MutableRepositoryItem) getBlogRepo()
					.getItem(getPostId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_POST);

			Set commentItemSet = new HashSet();
			commentItemSet = (Set) post.getPropertyValue(CitrisysBlogConstants.PROPERTY_SET_COMMENTS);
			commentItemSet.add(item);
			post.setPropertyValue(CitrisysBlogConstants.PROPERTY_SET_COMMENTS, commentItemSet);

			commentItemSet = (Set) getProfile().getPropertyValue(CitrisysBlogConstants.PROPERTY_SET_COMMENTS);
			commentItemSet.add(item);
			getProfile().setPropertyValue(CitrisysBlogConstants.PROPERTY_SET_COMMENTS, commentItemSet);

		} catch (RepositoryException e) {
			addFormException(new DropletException("Error in creating comment Item"));
			if(isLoggingError()) {
				logError("Exception catched while creating comment item");
			}
		}
		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);

	}

	public boolean handleDelete(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {

		try {
			MutableRepositoryItem item = (MutableRepositoryItem) getBlogRepo()
					.getItem(getCommentId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_COMMENT);

			MutableRepositoryItem post = (MutableRepositoryItem) getBlogRepo()
					.getItem(getPostId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_POST);

			Set commentItemSet = new HashSet();
			commentItemSet = (Set) post.getPropertyValue(CitrisysBlogConstants.PROPERTY_SET_COMMENTS);
			commentItemSet.remove(item);
			post.setPropertyValue(CitrisysBlogConstants.PROPERTY_SET_COMMENTS, commentItemSet);

			commentItemSet = (Set) getProfile().getPropertyValue(CitrisysBlogConstants.PROPERTY_SET_COMMENTS);
			commentItemSet.remove(item);
			getProfile().setPropertyValue(CitrisysBlogConstants.PROPERTY_SET_COMMENTS, commentItemSet);

			getBlogRepo().removeItem(getCommentId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_COMMENT);

		} catch (RepositoryException e) {
			addFormException(new DropletException("Error in deleting comment Item"));
			if(isLoggingError()) {
				logError("Exception catched while deleting comment item");
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
					.getItem(getCommentId(), CitrisysBlogConstants.ITEM_DESCRIPTOR_COMMENT);
			item.setPropertyValue(CitrisysBlogConstants.PROPERTY_COMMENT_DESCRIPTION, getComment());
			getBlogRepo().updateItem(item);

		} catch (RepositoryException e) {
			addFormException(new DropletException("Error in updating comment Item"));
			if(isLoggingError()) {
				logError("Exception catched while updating comment item");
			}
		}
		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);

	}
}
