package com.aurionpro.Employee.model;

public class Payroll {
    Employee[] employees = new Employee[5];
    int count = 0;

    // Add employee
    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count] = emp;
            count++;
        } else {
            System.out.println("No more space to add employees.");
        }
    }

    // Display all employee details
    public void displayAllEmployees() {
        System.out.println("All Employees:");
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    // Search employees by JobRole
    public void searchByRole(JobRole role) {
        System.out.println("Employees with Role: " + role);
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (employees[i].getJobRole() == role) {
                employees[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employee found with this role.");
        }
    }
}

