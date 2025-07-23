package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.StdProfile;


public class StdProfileTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StdProfile[] students = new StdProfile[3];
		for(int i =0;i<3;i++) {
			System.out.println("Enter Name of student :");
			String name = scanner.nextLine();
			System.out.println("Enter Roll number :");
			int rollNo = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter course :");
			String course = scanner.nextLine();
			students[i]= new StdProfile(name,rollNo,course);
			
		}
		System.out.println("Course details ");
		for(StdProfile std : students) {
			std.display();
		}
		scanner.close();
	}
	
}
