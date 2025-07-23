package com.aurionpro.Assignment.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.aurionpro.Movie.model.Movie;
import com.aurionpro.Movie.model.SortByYearAndTitle;

public class MovieTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Movie> list = new ArrayList<Movie>();

		System.out.println("---- Movie List ----");

		while (true) {
			try {
				System.out.println("Enter movie title :");
				String title = scanner.nextLine().trim();
				if (title.isEmpty() || !title.matches("[a-zA-Z0-9\\s]+")) {
					throw new IllegalArgumentException("Invalid title . Only letter and alphabets allowed");
				}

				System.out.println("Enter movie release Year :");
				int year = Integer.parseInt(scanner.nextLine());
				if (year < 1800 || year > 2030) {
					throw new IllegalArgumentException("Enter valid year between 1800 and 2030");
				}

				list.add(new Movie(title, year));
				String again;
				while (true) {
					System.out.print("Do you want to add another movie? (yes/no): ");
					again = scanner.nextLine().toLowerCase().trim();
					if (again.equals("yes") || again.equals("no"))
						break;
					else
						System.out.println("Please enter 'yes' or 'no'.");
				}
				if (again.equals("no"))
					break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid Year format . Please enter numbers only.");
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}catch (Exception e) {
				System.out.println("Unexpected error :"+e.getMessage());
			}
		}
		
		if(list.isEmpty()) {
			System.out.println("No movies to sort.");
		}
		
		Collections.sort(list, new SortByYearAndTitle());
		
		System.out.println("Sorted movies based on year and title :");
		for(Movie movie : list) {
			System.out.println(movie);
		}
		scanner.close();
	}
}
