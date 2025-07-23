package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No. of Employee :");
		int num = scanner.nextInt();
		scanner.nextLine();
		
		Employee[] employee = new Employee[num];
		
		for(int i =0;i<num;i++) {
			System.out.println("Enter name of Employee "+num+" :");
			String name = scanner.nextLine();
			System.out.println("Enter Employee id :");
			int id = scanner.nextInt();
			System.out.println("Enter basic salary of employee:");
			double basicSalary = scanner.nextDouble();
			
			employee[i]= new Employee(name, id, basicSalary);
			scanner.nextLine();
		}
		
		for(Employee result:employee) {
			System.out.println("The total salary of the employee "+result.name.toUpperCase()+" is:"+result.generateSalarySlip());
		}
	}
}
