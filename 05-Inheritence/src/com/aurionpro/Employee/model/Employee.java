package com.aurionpro.Employee.model;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private JobRole role;
	
	public Employee(int employeeId, String name, double salary, JobRole role) {
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
		this.role=role;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public String getname() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public JobRole getJobRole() {
		return role;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public void setName(String name) {
		this.name=name;;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setJobRole(JobRole role) {
		this.role=role;
	}
	
	public double calculateBonus() {
		switch(role) {
		case MANAGER:
			return salary *0.20;
		case DESIGNER:
		case DEVELOPER:
			return salary*0.15;
		default:
			return salary*0.10;
		}
	}
	
	public void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name +
                ", Salary: " + salary + ", Role: " + role +
                ", Bonus: " + calculateBonus());
    }
	
	
}
