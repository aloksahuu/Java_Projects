package com.aurionpro.project.model;

public class Person {
	String name;
	Department department;
	
	public Person(String name, Department department) {
		this.name=name;
		this.department=department;
	}
	
	public String getDetails() {
		return "Name :"+name+" Department :"+department;
	}
}
