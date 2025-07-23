package com.aurionpro.model;

public class Intern extends Employee {
	double stipend;
	
	public Intern(String name, int id,double stipend ) {
		super(name, id);
		this.stipend=stipend;
	}
	@Override
	public void CalculateSalary() {
		double salary = stipend;
		System.out.println(name +" Salary is :"+salary);
	}
}
