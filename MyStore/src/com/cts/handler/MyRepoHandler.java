package com.cts.handler;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;

import atg.droplet.DropletException;
import atg.droplet.GenericFormHandler;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.userprofiling.Profile;

public class MyRepoHandler extends GenericFormHandler {

	MutableRepository myRepo;

	private String successMessage;
	private String successURL;
	private String errorURL;

	private Profile profile;

	private String name;

	private String address;

	private String phone;

	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
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

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public MutableRepository getMyRepo() {
		return myRepo;
	}

	public void setMyRepo(MutableRepository myRepo) {
		this.myRepo = myRepo;
	}

	public boolean handleCreate(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {
		System.out.println("Start !!!!!!!!!!!!!!");
		if (!getFormError()) {
		}
		try {
			MutableRepositoryItem item = getMyRepo().createItem("my_user");
			item.setPropertyValue("address", getAddress());
			item.setPropertyValue("name", getName());

			Set phoneItemSet = (Set) item.getPropertyValue("phone");
			phoneItemSet.add(getPhone());

			item.setPropertyValue("phone", phoneItemSet);
			item = (MutableRepositoryItem) getMyRepo().addItem(item);
			clear();
			setSuccessMessage("Added SuucessFully");
			
		} catch (RepositoryException e) {
			addFormException(new DropletException("Error in creating New  Item"));
			if (isLoggingError()) {
				logError("Exception catched while creating New item");
			}
		}

		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);
	}

	public boolean handleUpdate(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {
		System.out.println("Update UStart !!!!!!!!!!!!!!" + getUserId());
		if (!getFormError()) {
		}
		try {
			MutableRepositoryItem item = getMyRepo().getItemForUpdate(
					getUserId(), "my_user");
			item.setPropertyValue("address", getAddress());
			item.setPropertyValue("name", getName());
			Set phoneItemSet = (Set) item.getPropertyValue("phone");
			phoneItemSet.add(getPhone());

			item.setPropertyValue("phone", phoneItemSet);
			getMyRepo().updateItem(item);
			clear();
			setSuccessMessage("Updated SuucessFully");

		} catch (RepositoryException e) {
			addFormException(new DropletException("Error in creating New Item"));
			if (isLoggingError()) {
				logError("Exception catched while creating update item");
			}
		}

		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);
	}

	public boolean handleDelete(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {
		System.out.println("Delete !!!!!!!!!!!!!!" + getUserId());
		if (!getFormError()) {
		}
		try {
			getMyRepo().removeItem(getUserId(), "my_user");
			setSuccessMessage("Deleted SuucessFully");

		} catch (RepositoryException e) {
			addFormException(new DropletException("Error in creating New Item"));
			if (isLoggingError()) {
				logError("Exception catched while creating Delete item");
			}
		}

		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);
	}

	private void clear() {
		setAddress(null);
		setName(null);
		setPhone(null);
		setUserId(null);
	}
}
