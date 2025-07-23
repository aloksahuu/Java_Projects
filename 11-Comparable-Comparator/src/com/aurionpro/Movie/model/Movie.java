package com.aurionpro.Movie.model;

public class Movie {
	String title;
	int year;
	
	public Movie(String title, int year) {
		this.title=title;
		this.year=year;
	}
	
	 public String getTitle() {
	        return title;
	    }

	    public int getYear() {
	        return year;
	    }

	    @Override
	    public String toString() {
	        return "Title: " + title + ", Year: " + year;
	    }
}
