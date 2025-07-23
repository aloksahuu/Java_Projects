package com.aurionpro.models;

public class Movie {
	String title;
	String genre;
	
	public Movie(String title, String genre) {
		this.title=title;
		this.genre=genre;
	}
	
	public void display() {
		if(genre.toLowerCase().contains("action")) {
			System.out.println("------------------------------------------");
			System.out.println("Movie Title :"+title);
			System.out.println("Movie Type :"+genre);
			System.out.println("------------------------------------------");
		}else {
			System.out.println("No action movies");
		}
		
	}
}
