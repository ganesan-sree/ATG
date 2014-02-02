package com.ff.pricing;

import atg.nucleus.GenericService;

public class FedExHolder extends GenericService{

	private boolean error;
	
	private String errorMessage;
	
	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
}
