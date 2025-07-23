package com.aurionpro.model;

public class SavingsAccount implements AccountOperations {
	private double balance = 10000;
	private static final double WITHDRAW_LIMIT = 5000;

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
		if (amount > WITHDRAW_LIMIT) {
			System.out.println("❌ Cannot withdraw more than ₹" + WITHDRAW_LIMIT + " in savings.");
		} else if (amount > balance) {
			System.out.println("❌ Insufficient balance.");
		} else {
			balance -= amount;
			System.out.println("✅ Withdrawn: ₹" + amount);
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("💰 Savings Account Balance: ₹" + balance);
	}
}
