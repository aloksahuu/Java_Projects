package com.aurionpro.Assignment.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

import com.aurionpro.Candiate.model.Candiadate;
import com.aurionpro.Candiate.model.SortByAge;
import com.aurionpro.Candiate.model.SortByName;

public class CandidateTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Candiadate> list = new ArrayList<>();

		System.out.println("--- Candidate Info ---");

		while (true) {
			try {
				System.out.println("Enter Candidate name:");
				String name = scanner.nextLine();
				if (name.trim().isEmpty() || !name.matches("[a-zA-Z ]+")) {
					throw new IllegalArgumentException("Enter a valid name (alphabets only).");
				}

				System.out.println("Enter Candidate age:");
				int age = Integer.parseInt(scanner.nextLine());

				if (age <= 0 || age > 100) {
					throw new IllegalArgumentException("Enter a valid age between 1 and 100.");
				}

				list.add(new Candiadate(name, age));

//				System.out.println("Add another candidate? (yes/no): ");
				String again;

				while (true) {
					System.out.println("Add another candidate? (yes/no): ");
					again = scanner.nextLine().trim().toLowerCase();

					if (again.equals("yes") || again.equals("no")) {
						break; // valid input
					} else {
						System.out.println("❌ Invalid input. Please enter 'yes' or 'no'.");
					}
				}

				if (again.equals("no"))
					break;
			} catch (NumberFormatException e) {
				System.out.println(" Invalid input. Please enter a number for age.");
			} catch (IllegalArgumentException e) {
				System.out.println("Plaese " + e.getMessage());
			} catch (Exception e) {
				System.out.println(" Unexpected error: " + e.getMessage());
			}
		}

		if (list.isEmpty()) {
			System.out.println("No candidates to sort.");
			return;
		}

		while (true) {
			try {
				System.out.println("Sort by (name/age): ");
				String type = scanner.nextLine().toLowerCase();

				if (type.equals("name")) {
					Collections.sort(list, new SortByName());

					// Check for common names
					HashSet<String> seen = new HashSet<>();
					boolean hasDuplicate = false;

					for (int i = 0; i < list.size(); i++) {
						String name = list.get(i).getName().toLowerCase();
						if (seen.contains(name)) {
							hasDuplicate = true;
							break;
						}
						seen.add(name);
					}

					if (hasDuplicate) {
						System.out.println("  Duplicate names found. Sorting those by age...");
						Collections.sort(list, new SortByName().thenComparing(new SortByAge()));
					}

					break;

				} else if (type.equals("age")) {
					Collections.sort(list, new SortByAge());
					break;
				} else {
					System.out.println(" Invalid choice. Please enter 'name' or 'age'.");
				}
			} catch (Exception e) {
				System.out.println(" Error while sorting: " + e.getMessage());
			}
		}

		System.out.println("\n Sorted Candidates:");
		for (Candiadate c : list) {
			System.out.println(c);
		}

		scanner.close();
	}
}
