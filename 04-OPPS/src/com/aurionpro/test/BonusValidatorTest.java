package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.BonusValidator;

public class BonusValidatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BonusValidator bonus = new BonusValidator();
		
		System.out.println("Enter employee name :");
		String name = scanner.nextLine();
		
		System.out.println("Enter Salary: ");
		double salary = scanner.nextDouble();
		
		System.out.println("Enter Bonus :");
		double bonusnew = scanner.nextDouble();
		
		bonus.setName(name);
		bonus.setSalary(salary);
		bonus.setBonus(bonusnew);
		
		System.out.println("\n----EMPLOYEE DETAILS ----");
		bonus.displayDetails();
		scanner.close();
	}
}
