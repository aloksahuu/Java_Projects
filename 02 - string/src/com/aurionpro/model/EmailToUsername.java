package com.aurionpro.model;

import java.util.Scanner;

public class EmailToUsername {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your email in form of name@gmail.com : ");
		String str1 = scanner.nextLine().trim().toLowerCase(); //as email is always in lower case.
		if(!str1.contains("@gmail.com")) {
			System.out.println("Please enter email correctly in form of name@gmail.com ");
		}else {
			int index = str1.indexOf("@");
			String username = str1.substring(0, index);
			System.out.println("Your username is :"+username);
		}
		
		scanner.close();
	}
}
