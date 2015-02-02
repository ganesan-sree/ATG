package com.bean.formhandler;

import java.io.IOException;
import javax.servlet.ServletException;
import atg.beans.DynamicBeans;
import atg.beans.PropertyNotFoundException;
import atg.droplet.GenericFormHandler;
import atg.repository.MutableRepository;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;

public class UserHandler extends GenericFormHandler {

	private String successMessage;
	private String successURL;
	private String errorURL;
	private String gender;
	private String email;
	private String password;
	private String userName;
	private String city;

	MutableRepository testRepo;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public MutableRepository getTestRepo() {
		return testRepo;
	}

	public void setTestRepo(MutableRepository testRepo) {
		this.testRepo = testRepo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean handleCreate(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {

		System.out.println(getFormName());
		System.out.println(getName());
		System.out.println(getGender());

		if (!getFormError()) {
			System.out.println("Come Indide");
		}

		System.out.println("helllllllllllllooooooooooooooo");

		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);

	}

	public boolean handleGlobal(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {
		System.out.println("helllllllllllllooooooooooooooo---");
		System.out.println(getCity());
		System.out.println(getGender());
		System.out.println(getUserName());

		try {
			String state = (String) DynamicBeans
					.getPropertyValue(this, "state");
			System.out.println("state==" + state);

		} catch (PropertyNotFoundException e) {
			System.out.println("Exception property not found");
		}

		return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
				pResponse);

	}

}
