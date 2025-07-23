package com.aurionpro.testt;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your name :");
		String name = scanner.nextLine();
		
		System.out.println("Hello "+name+", You are "+age+ "year old");
		scanner.close();
	}
}
