package com.aurionpro.models;

public class Employee {
	public String name;
	int id;
	double basicSalary;
	
	public Employee(String name, int id, double basicSalary) {
		this.name=name;
		this.id=id;
		this.basicSalary=basicSalary;
	}
	
	public double generateSalarySlip() {
		double HRA = 0.2*basicSalary;
		double DA = 0.1 * basicSalary;
		double TotalSalary = basicSalary+HRA+DA;
		return TotalSalary;
	}
}
