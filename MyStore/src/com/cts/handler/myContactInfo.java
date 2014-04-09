package com.cts.handler;

import atg.core.util.Address;
import atg.repository.MutableRepositoryItem;

public class myContactInfo extends Address {

	String fristName;

	String lastName;

	public myContactInfo(MutableRepositoryItem mri) {
		// TODO Auto-generated constructor stub
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
