package com.aurionpro.models;

public class Student {
	String name;
	int rollNumber;
	double cgpa;
	
	public Student(String name, int rollNumber,double cgpa) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.cgpa=cgpa;
	}
	
	public void display() {
		System.out.println(" name: "+name+" Roll number: "+rollNumber+" cgpa: "+cgpa);
		System.out.println("-----------------------");
	}
}
