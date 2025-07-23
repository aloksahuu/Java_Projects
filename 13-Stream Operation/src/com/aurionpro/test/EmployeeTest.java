package com.aurionpro.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		List<Employee> employees = new ArrayList<Employee>();
//		System.out.println("Enter Employee Details");
//		while (true) {
//			try {
//				System.out.print("Enter name: ");
//				String name = scanner.nextLine().trim();
//				if (!name.matches("[a-zA-Z ]+"))
//					throw new IllegalArgumentException("Name must contain only letters.");
//
//				System.out.print("Enter salary: ");
//				double salary = Double.parseDouble(scanner.nextLine());
//				if (salary <= 0)
//					throw new IllegalArgumentException("Salary must be greater than 0.");
//
//				System.out.print("Enter joining date (yyyy-mm-dd): ");
//				LocalDate date = LocalDate.parse(scanner.nextLine());
//
//				System.out.print("Enter gender (Male/Female): ");
//				String gender = scanner.nextLine().trim();
//				if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female"))
//					throw new IllegalArgumentException("Gender must be 'Male' or 'Female'.");
//
//				employees.add(new Employee(name, salary, date, gender));
//
//				System.out.print("Add another employee? (yes/no): ");
//				if (!scanner.nextLine().trim().equalsIgnoreCase("yes"))
//					break;
//
//			} catch (Exception e) {
//				System.out.println("❌ Error: " + e.getMessage());
//			}
//		}
//
//		if (employees.isEmpty()) {
//			System.out.println("No employees to process.");
//			return;
//		}

		List<Employee> employees = List.of(new Employee("Alok", 70000, LocalDate.of(2020, 1, 15), "Male"),
				new Employee("Anshika", 85000, LocalDate.of(2019, 3, 10), "Female"),
				new Employee("Ravi", 60000, LocalDate.of(2021, 5, 20), "Male"),
				new Employee("Neha", 90000, LocalDate.of(2018, 6, 5), "Female"),
				new Employee("Om", 65000, LocalDate.of(2022, 7, 1), "Male"),
				new Employee("Rucha", 92000, LocalDate.of(2017, 8, 15), "Female"),
				new Employee("Sahil", 88000, LocalDate.of(2020, 4, 30), "Male"),
				new Employee("Isha", 90000, LocalDate.of(2019, 2, 18), "Female"),
				new Employee("Arjun", 70000, LocalDate.of(2023, 1, 10), "Male"),
				new Employee("Pooja", 87000, LocalDate.of(2016, 9, 25), "Female"));

		// Maximum salary
		System.out.println("Maximum salary ");
		System.out.println(employees.stream().max(Comparator.comparing(s -> s.salary)));

		// 2nd highest salary
		System.out.println("Second highest Salary");

		System.out.println(employees.stream().sorted(Comparator.comparing(e -> e.salary, Comparator.reverseOrder()))
				.skip(1).findFirst());
		
		//  Find the employee who is most senior based on joining date.
		System.out.println("Most senior employee");
		employees.stream().min(Comparator.comparing(e -> e.joiningDate)).ifPresent(System.out::println);
		
		//count the employee based on gender
//		System.out.println("Employee count");
		System.out.println("\nEmployee Count by Gender:");

		employees.stream()
		    .collect(Collectors.groupingBy(e -> e.gender, Collectors.counting()))
		    .forEach((gender, count) -> System.out.println(gender + ": " + count));

	}
}
