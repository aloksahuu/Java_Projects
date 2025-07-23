package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.Movie;

public class MovieTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter title of 5 best Action movies");
		Movie [] movies = new Movie[5];
		for(int i =0;i<5;i++) {
			System.out.println("Enter movie title : "+(i+1));
			String title = scanner.nextLine();
			System.out.println("Enter movie genre :");
			String genre = scanner.nextLine();
			movies[i]= new Movie(title, genre);
		}
		for(Movie result:movies) {
			result.display();
		}
		scanner.close();
		
	} 
}
