package com.aurionpro.models;

public class StdProfile {
	String name;
	int rollNo;
	String course;
	
	public StdProfile(String name, int rollNo, String course) {
		this.name=name;
		this.rollNo=rollNo;
		this.course=course;
	}
	public void display() {
		System.out.println("Student Name :"+name);
		System.out.println("Roll No. :"+rollNo);
		System.out.println("Course name :"+course);
	}
}
