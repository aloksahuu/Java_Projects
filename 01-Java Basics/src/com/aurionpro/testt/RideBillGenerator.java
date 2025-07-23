package com.aurionpro.testt;

import java.util.Scanner;

public class RideBillGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Height (in cm):");
		int height = scanner.nextInt();

		if (height <= 120) {
			System.out.println("You can't take this ride. Sorry.");
		} else {
			System.out.println("You can take this ride. Please enter your age:");
			int age = scanner.nextInt();

			int bill;

			if (age < 12) {
				bill = 5;
			} else if (age >= 12 && age < 18) {
				bill = 7;
			} else if (age >= 18 && age < 45) {
				bill = 12;
			} else {
				bill = 0; // Age 45+
			}

			scanner.nextLine(); // Consume newline
			System.out.println("Do you want photos? (yes or no):");
			String s = scanner.nextLine();

			if (s.equalsIgnoreCase("yes")) {
				bill += 3;
			}

			System.out.println("Your total bill is: $" + bill);
		}

		scanner.close();
	}
}
