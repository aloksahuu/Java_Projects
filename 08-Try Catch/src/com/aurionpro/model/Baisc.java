package com.aurionpro.model;

import java.util.Scanner;

public class Baisc {
	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your age :");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter your name");
			String name = scanner.nextLine();
			System.out.println("Your age is :"+age);
			System.out.println("Your name is :"+name);
			System.out.println("------------------------");
		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter array values :");
			int[] arr = new int[5];
			for (int i =0;i<arr.length;i++) {
				arr[i]=scanner.nextInt();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Executed");
		}
	}
	
}
