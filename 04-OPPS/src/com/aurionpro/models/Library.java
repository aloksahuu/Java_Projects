package com.aurionpro.models;

public class Library {
	private String title;
	private String author;
	private boolean issued;

	public Library() {
		// default constructor
	}

	// Setters
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIssued(boolean issued) {
		this.issued = issued;
	}

	// Getters
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getStatus() {
		if (issued) {
			return "The book is Issued. It is not Available!";
		} else {
			return "The book is Available.";
		}
	}

	public void display() {
		System.out.println("Book Title: " + title);
		System.out.println("Book Author: " + author);
		System.out.println("Book Status: " + getStatus());
	}
}
