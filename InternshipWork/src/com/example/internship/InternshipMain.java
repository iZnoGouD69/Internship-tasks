package com.example.internship;


import java.util.ArrayList;
import java.util.List;


public class InternshipMain {

	
	public static void main(String[] args) {
		InternshipUser user1 = new InternshipUser("Parth","Gujarat",0);
		InternshipUser user2 = new InternshipUser("Alok","Delhi",0);
		InternshipUser user3 = new InternshipUser("Mitul","Bangalore",0);
		InternshipUser user4 = new InternshipUser("Darshan","Pune",0);
		InternshipUser user5 = new InternshipUser("Aravindh","Chennai",0);
		
		
		// Default Constructor
		InternshipUser user6 = new InternshipUser();
		user6.name="Mayank";
		
		
		InternshipCourse basic = new InternshipCourse("Oops Concepts",50);
		InternshipCourse frontend = new InternshipCourse("ReactJS",300);
		InternshipCourse backend = new InternshipCourse("Node",100);
		InternshipCourse cloud = new InternshipCourse("AWS",200);
		
		// Default Constructor
		InternshipCourse test = new InternshipCourse();
		test.setCourseName("Test Course");

		
		// ArrayList vs LinkedList
		List<InternshipUser> listOfUsers = new ArrayList<>();
		listOfUsers.add(user1);
		listOfUsers.add(user2);
		listOfUsers.add(user3);
		listOfUsers.add(user4);
		listOfUsers.add(user5);
		
	
		user1.hasCompletedCourse(basic);
		user2.hasCompletedCourse(frontend);
		user3.hasCompletedCourse(backend);
		user4.hasCompletedCourse(cloud);
		
		
		user5.giveAdminAccess();   
		
		try {
			user5.giveAdminAccess(user1);	
			user2.giveAdminAccess(user3);
			user1.giveAdminAccess(user5);
			
		} catch (isAlreadyAdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			   
		
		
		InternshipUser leaderBoard = new InternshipUser();
		listOfUsers = leaderBoard.sortUserList(listOfUsers,4);
		
		
		// To print Leaderboard which is sorted by duration
		//InternshipPrintUserData view = new InternshipPrintUserData(listOfUsers);
		//listOfUsers = view.fetchUsersToDisplay(3);
		// To print Directory which is list of all users as entered
		//listOfUsers = view.fetchUsersToDisplay();

		
		InternshipUser writeDataToFile = new InternshipUser();

		System.out.println("\n=================================");
		
		for(InternshipUser currentUser : listOfUsers) {
			System.out.println("Employee Name: " + currentUser.name + "\n" +
							   "Employee Location: " + currentUser.location + "\n" +
							   "Duration Watched: " + currentUser.durationWatched);
			
			
		//	System.out.println(currentUser.hasAdminAccess  == true ? true:false);
			
			if(currentUser.hasAdminAccess == true) {
				System.out.println("Employee access: Admin");
			} else {
				System.out.println("Employee access: User");
			}
			
		System.out.println("=================================");
		
		writeDataToFile.getNameOfUser(currentUser.name);

		}
//		InternshipUser writeDataToFile = new InternshipUser();
//		writeDataToFile.NameOfUser(listOfUsers);	
	}
	
	
}