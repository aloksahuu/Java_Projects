package com.aurionpro.model;

public abstract class Student {
	int rollNumber;
	String name;
	
	public Student(int rollNumber, String name) {
		this.rollNumber=rollNumber;
		this.name=name;
	}
	
	public abstract void CalculateGrade();
}
