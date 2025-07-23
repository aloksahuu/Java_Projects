package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> StudentList = new ArrayList<Student>();
		System.out.println("Enter student details");
		while (true) {
			System.out.print("Enter name: ");
			String name = scanner.nextLine();

			System.out.print("Enter roll number: ");
			int roll = Integer.parseInt(scanner.nextLine());

			System.out.print("Enter marks: ");
			int marks = Integer.parseInt(scanner.nextLine());

			StudentList.add(new Student(name, roll, marks));

			System.out.print("Do you want to add another student? (yes/no): ");
			String choice = scanner.nextLine().toLowerCase();
			if (!choice.equals("yes")) {
				break;
			}
			
		}
		scanner.close();
		System.out.println("\n Sorted Students by Marks (Ascending):");
		StudentList.stream().sorted(Comparator.comparing(Student::getMarks)).forEach(System.out::println);
		// we can do it without getter setter also
		//students.stream().sorted(Comparator.comparing(s ->s.cgpa)).forEach(System.out::println);
	}
}
