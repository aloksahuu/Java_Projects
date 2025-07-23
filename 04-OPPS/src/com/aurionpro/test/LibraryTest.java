package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.models.Library;

public class LibraryTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of books: ");
		int n = scanner.nextInt();
		scanner.nextLine(); // clear buffer

		Library[] books = new Library[n];

		for (int i = 0; i < n; i++) {
			books[i] = new Library();

			System.out.println("\nEnter title of book " + (i + 1) + ":");
			String title = scanner.nextLine();
			books[i].setTitle(title);

			System.out.println("Enter author of book " + (i + 1) + ":");
			String author = scanner.nextLine();
			books[i].setAuthor(author);

			System.out.println("Is the book issued? (yes/no):");
			String issuedInput = scanner.nextLine();
			boolean isIssued = issuedInput.equalsIgnoreCase("yes");
			books[i].setIssued(isIssued);
			
			
		}

		System.out.println("\n------ Library Book Details ------");
		for (Library book : books) {
			book.display();
			System.out.println("--------------------");
		}

		scanner.close();
	}
}
