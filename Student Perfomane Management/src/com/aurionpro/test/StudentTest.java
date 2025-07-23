package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ArtsStudent;
import com.aurionpro.model.CommerceStudent;
import com.aurionpro.model.ScienceStudent;
import com.aurionpro.model.Students;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;

		
		do {
			System.out.print("Enter number of students: ");
			if (scanner.hasNextInt()) {
				count = scanner.nextInt();
				scanner.nextLine(); // clear buffer
				if (count > 0) break;
				else System.out.println(" Number must be greater than 0.");
			} else {
				System.out.println(" Please enter a valid number.");
				scanner.next();
			}
		} while (true);

		Students[] student = new Students[count];

		// Input for each student
		for (int i = 0; i < count; i++) {
			System.out.println("\nEnter details for Student " + (i + 1) + ":");

			// Name
			String name;
			do {
				System.out.print("Name: ");
				name = scanner.nextLine();
				if (!isNumeric(name)) break;
				else System.out.println(" Name cannot be a number. Try again.");
			} while (true);

			// Roll Number
			int rollNumber;
			do {
				System.out.print("Roll Number: ");
				if (scanner.hasNextInt()) {
					rollNumber = scanner.nextInt();
					scanner.nextLine();
					if (!isDuplicateRoll(student, rollNumber, i)) break;
					else System.out.println(" Duplicate roll number. Try a different one.");
				} else {
					System.out.println(" Please enter a valid number.");
					scanner.next();
				}
			} while (true);

			// Stream
			String stream;
			do {
				System.out.print("Stream (Science / Commerce / Arts): ");
				stream = scanner.nextLine();
				if (stream.equalsIgnoreCase("Science") || stream.equalsIgnoreCase("Commerce") || stream.equalsIgnoreCase("Arts")) break;
				else System.out.println(" Invalid stream. Please enter Science, Commerce, or Arts.");
			} while (true);

			// Subject marks - directly input & validate inside loop
			if (stream.equalsIgnoreCase("Science")) {
				int physics, chemistry, math;

				do {
					System.out.print("Physics Marks (0-100): ");
					if (scanner.hasNextInt()) {
						physics = scanner.nextInt();
						if (physics >= 0 && physics <= 100) break;
					}
					System.out.println(" Invalid marks. Try again.");
					scanner.nextLine(); // clear invalid
				} while (true);

				do {
					System.out.print("Chemistry Marks (0-100): ");
					if (scanner.hasNextInt()) {
						chemistry = scanner.nextInt();
						if (chemistry >= 0 && chemistry <= 100) break;
					}
					System.out.println(" Invalid marks. Try again.");
					scanner.nextLine();
				} while (true);

				do {
					System.out.print("Math Marks (0-100): ");
					if (scanner.hasNextInt()) {
						math = scanner.nextInt();
						if (math >= 0 && math <= 100) break;
					}
					System.out.println(" Invalid marks. Try again.");
					scanner.nextLine();
				} while (true);

				scanner.nextLine(); // clear buffer
				student[i] = new ScienceStudent(name, rollNumber, stream, physics, chemistry, math);
			}

			else if (stream.equalsIgnoreCase("Commerce")) {
				int accounts, business, economics;

				do {
					System.out.print("Accounts Marks (0-100): ");
					if (scanner.hasNextInt()) {
						accounts = scanner.nextInt();
						if (accounts >= 0 && accounts <= 100) break;
					}
					System.out.println(" Invalid marks. Try again.");
					scanner.nextLine();
				} while (true);

				do {
					System.out.print("Business Studies Marks (0-100): ");
					if (scanner.hasNextInt()) {
						business = scanner.nextInt();
						if (business >= 0 && business <= 100) break;
					}
					System.out.println(" Invalid marks. Try again.");
					scanner.nextLine();
				} while (true);

				do {
					System.out.print("Economics Marks (0-100): ");
					if (scanner.hasNextInt()) {
						economics = scanner.nextInt();
						if (economics >= 0 && economics <= 100) break;
					}
					System.out.println(" Invalid marks. Try again.");
					scanner.nextLine();
				} while (true);

				scanner.nextLine();
				student[i] = new CommerceStudent(name, rollNumber, stream, accounts, business, economics);
			}

			else {
				int history, polSci, sociology;

				do {
					System.out.print("History Marks (0-100): ");
					if (scanner.hasNextInt()) {
						history = scanner.nextInt();
						if (history >= 0 && history <= 100) break;
					}
					System.out.println(" Invalid marks. Try again.");
					scanner.nextLine();
				} while (true);

				do {
					System.out.print("Political Science Marks (0-100): ");
					if (scanner.hasNextInt()) {
						polSci = scanner.nextInt();
						if (polSci >= 0 && polSci <= 100) break;
					}
					System.out.println(" Invalid marks. Try again.");
					scanner.nextLine();
				} while (true);

				do {
					System.out.print("Sociology Marks (0-100): ");
					if (scanner.hasNextInt()) {
						sociology = scanner.nextInt();
						if (sociology >= 0 && sociology <= 100) break;
					}
					System.out.println(" Invalid marks. Try again.");
					scanner.nextLine();
				} while (true);

				scanner.nextLine();
				student[i] = new ArtsStudent(name, rollNumber, stream, history, polSci, sociology);
			}
		}

		// Show summary
		System.out.println("\n=== Student Performance Summary ===");
		for (Students std : student) {
			System.out.println();
			std.displayInfo();
			std.displayPerformance(true);
		}

		scanner.close();
	}

	// Check if input is a number
	public static boolean isNumeric(String str) {
		return str.matches("[0-9]+");
	}

	// Check for duplicate roll numbers
	public static boolean isDuplicateRoll(Students[] student, int rollNumber, int size) {
		for (int i = 0; i < size; i++) {
			if (student[i] != null && student[i].rollNumber == rollNumber) {
				return true;
			}
		}
		return false;
	}
}
