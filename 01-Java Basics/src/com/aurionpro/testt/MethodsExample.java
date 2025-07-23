package com.aurionpro.testt;

import java.util.Scanner;

public class MethodsExample {
	public static void add(int a, int b) {
		int sum = a+b;
		System.out.println("sum is :"+ sum);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		add(a,b);
		scanner.close();
	}
}
