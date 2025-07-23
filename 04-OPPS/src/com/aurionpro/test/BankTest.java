package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.models.Bank;

public class BankTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank myAccount = new Bank();

		System.out.print("Enter account number: ");
		String accNo = scanner.nextLine();
		myAccount.setAccountNumber(accNo);

		System.out.print("Enter account holder name: ");
		String name = scanner.nextLine();
		myAccount.setHolderName(name);

		System.out.print("Enter amount to deposit: ");
		double depositAmount = scanner.nextDouble();
		myAccount.deposit(depositAmount);

		System.out.print("Enter amount to withdraw: ");
		double withdrawAmount = scanner.nextDouble();
		myAccount.withdraw(withdrawAmount);

		System.out.println("\n--- Account Summary ---");
		myAccount.displayAccountDetails();

		scanner.close();
	}
}
