package com.aurionpro.Movie.model;

import java.util.Comparator;

public class SortByYearAndTitle implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.getYear()!=m2.getYear()) {
			return m2.getYear()-m1.getYear();	
		}else {
			return m1.getTitle().compareTo(m2.getTitle());
		}
	}
	
	
}
