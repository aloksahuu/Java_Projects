package com.aurionpro.model;

public class Developer extends Employee {
	double baseSalary;
	double bonus;
	
	public Developer(String name, int id, double baseSalary, double bonus) {
		super(name, id);
		this.baseSalary=baseSalary;
		this.bonus=bonus;
	}
	
	@Override
	public void CalculateSalary() {
		double salary;
		salary = baseSalary + bonus;
		System.out.println(name +" Salary is :"+salary);
	}
	
}
