package com.aurionpro.project.model;

public class Student extends Person {
	int rollNo;
	String course;
	public static int totalStudents =0;
	
	public Student(String name, Department department, int rollNo) {
		super(name, department);
		this.rollNo=rollNo;
		totalStudents++;
	}
	
	public void enrollCourse(String course) {
		this.course=course;
	}
	
	@Override
	public String getDetails() {
		return "Student Name: " + name + ", Roll No: " + rollNo + ", Dept: " + department + ", Enrolled Course: " + course;
	}
}
