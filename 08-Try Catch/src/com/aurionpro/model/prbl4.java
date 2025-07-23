package com.aurionpro.model;

import java.util.Scanner;

public class prbl4 {
	
	public static void validateMarks(int marks) {
		if(marks<0 || marks >100) {
			throw new IllegalArgumentException("Marks should be in between (0-100)");
		}
		else {
			System.out.println("Valid marks");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks :");
		int marks = scanner.nextInt();
		try {
			validateMarks(marks);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid marks :"+e.getMessage());
		} catch(Exception e) {
			System.out.println("Unexpected error :"+e.getMessage());
		}
	
		scanner.close();
	}
}
