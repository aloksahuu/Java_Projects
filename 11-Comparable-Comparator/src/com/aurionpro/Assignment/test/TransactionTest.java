package com.aurionpro.Assignment.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.aurionpro.Transactions.model.SortByAmountAndId;
import com.aurionpro.Transactions.model.Transaction;

public class TransactionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Transaction> transactions = new ArrayList<>();

		System.out.println("=== Transaction Entry System ===");

		while (true) {
			int id = 0;
			double amount = 0.0;

			// Input ID
			while (true) {
				System.out.print("Enter Transaction ID: ");
				String input = scanner.nextLine().trim();
				try {
					id = Integer.parseInt(input);
					if (id > 0)
						break;
					else
						System.out.println("ID must be positive.");
				} catch (NumberFormatException e) {
					System.out.println("Invalid ID. Please enter a valid number.");
				}
			}

			// Input Amount
			while (true) {
				System.out.print("Enter Transaction Amount: ");
				String input = scanner.nextLine().trim();
				try {
					amount = Double.parseDouble(input);
					if (amount >= 0)
						break;
					else
						System.out.println("Amount cannot be negative.");
				} catch (NumberFormatException e) {
					System.out.println("Invalid amount. Please enter a valid number.");
				}
			}

			// Add transaction to list
			transactions.add(new Transaction(id, amount));

			// Ask to continue
			while (true) {
				System.out.print("Do you want to add another transaction? (yes/no): ");
				String choice = scanner.nextLine().trim().toLowerCase();
				if (choice.equals("yes")) {
					break; // Continue outer loop
				} else if (choice.equals("no")) {
					System.out.println("\nTransaction entry complete.\n");
					scanner.close();
					displaySorted(transactions);
					return; // Exit main
				} else {
					System.out.println("Please enter 'yes' or 'no'.");
				}
			}
		}
	}

	public static void displaySorted(ArrayList<Transaction> transactions) {
		if (transactions.isEmpty()) {
			System.out.println("No transactions to sort.");
			return;
		}

		Collections.sort(transactions, new SortByAmountAndId());

		System.out.println("=== Sorted Transactions (by Amount Desc, ID Asc) ===");
		for (Transaction t : transactions) {
			System.out.println(t);
		}
	}
}
