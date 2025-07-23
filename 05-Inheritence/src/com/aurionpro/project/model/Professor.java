package com.aurionpro.project.model;

public class Professor extends Person {
	int id;
	String subject;
	
	public Professor(String name, Department department, int id) {
		super(name, department);
		this.id=id;
	}
	
	public void assignSubject(String subject) {
		this.subject=subject;
	}
	
	@Override
	public String getDetails() {
		return  "Professor Name: " + name + ", ID: " + id + ", Dept: " + department + ", Subject: " + subject;
	}
}
