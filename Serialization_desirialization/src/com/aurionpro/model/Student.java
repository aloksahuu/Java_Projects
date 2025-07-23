package com.aurionpro.model;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	int rollNumber;
	public Student(String name, int rollNumber) {
		
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public void display() {
		System.out.println("Name :"+ name +"Roll number : "+rollNumber);
	}
	
}
