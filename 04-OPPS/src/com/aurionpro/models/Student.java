package com.aurionpro.models;

public class Student {
	String name;
	private int rollNo;
	private int marks;
	
	public Student() {
		//default constructor
	}
	
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public int getMarks() {
		return marks;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public void setMarks(int marks) {
		
		if (marks > 100 || marks < 0) {
			System.out.println("Enter marks correctly.");
		} else {
			this.marks = marks;
		}

	}
	
	public void display() {
		System.out.println("Name of student :"+name+" Roll no : "+rollNo+" marks :"+marks);
	}
}
