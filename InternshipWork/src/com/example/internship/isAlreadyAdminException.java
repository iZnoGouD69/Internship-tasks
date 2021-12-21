package com.example.internship;

@SuppressWarnings("serial")
public class isAlreadyAdminException extends Exception {
	
	@Override
	public String toString() {
		return "Defined user is already admin!";
	}
	
	@Override
	public String getMessage() {
		return "Defined user is already admin!";
	}

}
