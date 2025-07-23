package com.aurionpro.testt;

import java.util.Scanner;

public class MethodExample2 {
	public static void greet(String name) {
		System.out.println("Hello "+name+" Good morning.");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		greet(name);
		scanner.close();
	}
}
