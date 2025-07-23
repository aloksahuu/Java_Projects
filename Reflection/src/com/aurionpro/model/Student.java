package com.aurionpro.model;

public class Student {
	String name;
	int rollNumber;
	double cgpa = 8.0;
	public final int  num = 7;
	
	
	public Student(){
		//default
	}
	
	public Student(String name, int rollNumber, double cgpa) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.cgpa=cgpa;
	}
	
	public void greet() {
		System.out.println("Hello ");
	}
	
	public double result(double cgpa) {
		return cgpa;
	}
}
