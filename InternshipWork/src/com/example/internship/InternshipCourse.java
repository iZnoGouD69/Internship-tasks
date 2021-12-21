package com.example.internship;

public class InternshipCourse {
	
	private String courseName;
	private int courseDuration;
	
	public InternshipCourse() {
		// default constructor
	}
	
	public InternshipCourse(String courseName, int courseDuration) {
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}

	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
		
	}

	public int getDuration() {
		return courseDuration;
	}

}
