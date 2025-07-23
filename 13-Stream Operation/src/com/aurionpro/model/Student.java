package com.aurionpro.model;

public class Student {
	String name;
	int rollNumber;
	int marks;
	
	public Student(String name, int rollNumber, int marks) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
		
	}
	
	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks+ "]";
	}
	
	
}
