package com.aurionpro.models;

public class BonusValidator {
	private String name;
	private double salary;
	private double bonus;

	public BonusValidator() {
		// default constructor
	}

	// Getters
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	public double getFinalSalary() {
		return salary + bonus;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBonus(double bonus) {
		if (bonus <= 0.2 * salary) {
			this.bonus = bonus;
		} else {
			System.out.println("Bonus exceeds 20% of salary. No bonus is added.");
			this.bonus = 0;
		}
	}

	// Display Method
	public void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + getFinalSalary());
	}
}
