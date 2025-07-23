package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.Book;

public class BookTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter details of 4 Books");
		Book[] books = new Book[4];
		for(int i =0;i<4;i++) {
			System.out.println("Enter book ID:");
			int BookId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter book Title :");
			String title = scanner.nextLine();
			
			books[i] = new Book(BookId,title);
			
			
		}
		
		for(Book result:books) {
			result.display();
		}
		scanner.close();
	}
}
