package com.example.internship;

import static org.junit.jupiter.api.Assertions.*;
import static com.example.internship.InternshipUser.isValidUserName;
import org.junit.jupiter.api.Test;

class InternshipTDD {

	@Test
	public void userNameCheck() {
		String userName_1 = "ParthSolanki";
		String userName_2 = "Parth Solanki";
		String userName_3 = "Parth@Solanki";
		String userName_4 = "Parth_Solanki";
		String userName_5 = "Parth/Solanki";
		String userName_6 = "Parth#Solanki";
		
		assertTrue(isValidUserName(userName_1));
		assertFalse(isValidUserName(userName_2));
		assertFalse(isValidUserName(userName_3));
		assertFalse(isValidUserName(userName_4));
		assertFalse(isValidUserName(userName_5));
		assertFalse(isValidUserName(userName_6));
	}
	
	@Test
	public void passwordCheck() {
		PasswordValidator pv = new PasswordValidator();
		assertEquals(true,pv.isValidPass("pass123"));
	}
	

}
