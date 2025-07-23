package com.aurionpro.test;

import com.aurionpro.model.Developer;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Intern;

public class EmployeeSalaryCalculator {
	public static void main(String[] args) {
		Employee[] employee = new Employee[4];
		employee[0] = new Developer("Alok", 34, 300000, 3000);
		employee[1] = new Developer("Anshika", 33, 330000, 2000);
		employee[2]= new Intern("Payal", 123, 10000);
		employee[3]= new Intern("Shruti", 124, 10000);
		
		for(Employee emp : employee) {
			emp.CalculateSalary();
		}
	}
}
