package com.aurionpro.models;

public class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;

	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	public String getName() {
		return name;
	}

	public void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary);
	}
}
