package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.models.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee[] employees = new Employee[5];

		// Input
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Enter details for Employee " + (i + 1));
			System.out.print("ID: ");
			int id = scanner.nextInt();
			scanner.nextLine(); // clear buffer

			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Department: ");
			String dept = scanner.nextLine();

			System.out.print("Salary: ");
			double salary = scanner.nextDouble();

			employees[i] = new Employee(id, name, dept, salary);
		}

		//  employee with lowest salary
		Employee lowest = employees[0];
		for (int i = 1; i < employees.length; i++) {
			if (employees[i].getSalary() < lowest.getSalary()) {
				lowest = employees[i];
			}
		}
		System.out.println("\nEmployee with lowest salary: " + lowest.getName());

		//  List of employees in "IT" department
		System.out.println("\nEmployees in IT Department:");
		for (Employee emp : employees) {
			if (emp.getDepartment().equalsIgnoreCase("IT")) {
				emp.display();
			}
		}

		//  Total salary expense
		double total = 0;
		for (Employee emp : employees) {
			total += emp.getSalary();
		}
		System.out.println("\nTotal Salary Expense: " + total);

		scanner.close();
	}
}
