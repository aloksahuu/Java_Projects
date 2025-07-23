package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int numberOfStudents = scanner.nextInt();
		Student[] students = new Student[numberOfStudents];
		System.out.println("Enter Student details:");
		for(int i =0;i< numberOfStudents;i++) {
			System.out.println("Enter roll number:");
			int rollNumber = scanner.nextInt();
			
			scanner.nextLine();
			System.out.println("Enter name of student:");
			String name = scanner.nextLine();
			
			System.out.println("Enter cgpa:");
			double cgpa = scanner.nextDouble();
			
			students[i] = new Student(name,rollNumber,cgpa);
		}
		for(Student result:students) {
			result.display();
		}
		scanner.close();
	}
}
