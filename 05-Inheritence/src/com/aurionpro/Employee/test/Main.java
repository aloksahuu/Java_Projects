package com.aurionpro.Employee.test;

import java.util.Scanner;

import com.aurionpro.Employee.model.Employee;
import com.aurionpro.Employee.model.JobRole;
import com.aurionpro.Employee.model.Payroll;

public class Main {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        // Adding 5 employees
        payroll.addEmployee(new Employee(1, "Alice", 80000, JobRole.MANAGER));
        payroll.addEmployee(new Employee(2, "Bob", 60000, JobRole.DEVELOPER));
        payroll.addEmployee(new Employee(3, "Carol", 55000, JobRole.DESIGNER));
        payroll.addEmployee(new Employee(4, "David", 50000, JobRole.TESTER));
        payroll.addEmployee(new Employee(5, "Eve", 45000, JobRole.HR));

        // Display all employees
        payroll.displayAllEmployees();

        // Search by role
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter role to search (MANAGER, DEVELOPER, DESIGNER, TESTER, HR): ");
        String input = scanner.next().toUpperCase();

        try {
            JobRole role = JobRole.valueOf(input);
            payroll.searchByRole(role);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid role entered.");
        }

        scanner.close();
    }
}

