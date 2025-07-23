package com.aurionpro.model;

public class CurrentAccount implements AccountOperations {
	private double balance = 15000;

	@Override
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("❌ Deposit amount must be positive.");
			return;
		}
		balance += amount;
		System.out.println("✅ Deposited: ₹" + amount);
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("❌ Withdrawal amount must be positive.");
			return;
		}
		if (amount > balance) {
			System.out.println("❌ Insufficient balance.");
		} else {
			balance -= amount;
			System.out.println("✅ Withdrawn: ₹" + amount);
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("💰 Current Account Balance: ₹" + balance);
	}
}
