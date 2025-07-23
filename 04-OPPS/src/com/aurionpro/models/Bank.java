package com.aurionpro.models;

public class Bank {
	private String accountNumber;
	private String holderName;
	private double balance;

	public Bank() {
		// default constructor
//		System.out.println("Default");
	}
	

	// Setters
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	// Getter
	public double getBalance() {
		return balance;
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// Withdraw method
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	// Display method
	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Holder Name: " + holderName);
		System.out.println("Balance: " + balance);
	}
}
