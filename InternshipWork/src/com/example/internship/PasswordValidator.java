package com.example.internship;

public class PasswordValidator {

	public boolean isValidPass(String password) {
		
		if(password.length() >= 5 && password.length() <=10) {
			return true;
		} else {
			return false;
		}
	}
}
