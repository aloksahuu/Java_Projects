package com.aurionpro.models;

public class Book {
	int BookID;
	String title;
	
	public Book(int BookID, String title) {
		this.BookID = BookID;
		this.title = title;
	}
	
	public void display() {
		System.out.println("---------------------------------------");
		System.out.println("BookID : "+BookID+" Book title : "+title);
		System.out.println("---------------------------------------");
	}
}
