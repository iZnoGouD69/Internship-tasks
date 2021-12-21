package com.example.internship;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.List;


public class InternshipUser {
	
	String name;
	String location;
	int durationWatched;
	Boolean hasAdminAccess = false;	
	
	InternshipUser(String name,String location,int duration){
		
		this.name = name;
		this.location = location;
		this.durationWatched = duration;
		 
	}
	
	public InternshipUser() {
		// Default Constructor
	}


	public void hasCompletedCourse(InternshipCourse completedCourse) {
		this.durationWatched =+ completedCourse.getDuration();
	}

	
	public void giveAdminAccess() {
		this.hasAdminAccess = true;
	}

	
	// check for Admin access first
	public void giveAdminAccess(InternshipUser newAdmin) throws isAlreadyAdminException {
		// TODO Auto-generated method stub
		if(this.hasAdminAccess == true) {
			if(newAdmin.hasAdminAccess == true) {
				throw new isAlreadyAdminException();
			} else {
				newAdmin.hasAdminAccess = true;
				System.out.println(this.name + " gave superuser access to " + newAdmin.name);	
			}
		} else {
			System.out.println(this.name + " don't have superuser access to make others admin");
 		}
		
		
	}
	

	public List<InternshipUser> sortUserList(List<InternshipUser> listOfUsers, int topUserCount) {
		Collections.sort(listOfUsers,(InternshipUser user_1, InternshipUser user_2) -> 
		user_2.durationWatched - user_1.durationWatched);	
		listOfUsers = listOfUsers.subList(0, topUserCount);
		return listOfUsers;
	}
	
	public void getNameOfUser(String dataToStore) {
		try {
			
//			FileWriter writer = new FileWriter("F:\\eclipse workspace\\AdaptiveU"); 
			FileWriter writer = new FileWriter("Name of users.txt",true); 
			Writer output = new BufferedWriter(writer);
			
			output.write(dataToStore + "\n");
			output.close();

//			for(int i = 0; i < listOfUsers.size(); i++) {
//				output.write((listOfUsers.get(i).name).toString() + "\n");
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
		
	}
	
	static boolean isValidUserName(String name) {
		if(name.contains("/") ||
			name.contains("#") ||
			name.contains(" ") ||
			name.contains("@") ||
			name.contains("_")) {
			return false;
		}
		return true;
	}
	
}

	/*@Override
	public int compareTo(InternshipUser durationWatched) {
		// TODO Auto-generated method stub
		
		int compareDuration = ((InternshipUser)durationWatched).getDuration();
		
		return this.duration - compareDuration;
	}*/


//