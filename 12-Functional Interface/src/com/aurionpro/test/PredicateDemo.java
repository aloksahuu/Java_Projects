package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
//		Predicate<Integer> isEven = (num) -> num%2==0;
//		System.out.println(isEven.test(12));
//		
//		Predicate<String> isNull = (str) -> str.isEmpty();
//		System.out.println(isNull.test("Alok"));
//		
//		// odd number
//		Predicate<Integer> isodd = (num) -> num%2!=0;
//		for(int i=1;i<=10;i++) {
//			System.out.println("Number "+i+ "is odd :"+isodd.test(i));
//		}

		Predicate<String> isValid = str -> str != null && !str.trim().isEmpty();

		List<String> words = Arrays.asList("", "Java", null, " ", "alok");

		List<String> validWords = new ArrayList<>();
		for (String word : words) {
			if (isValid.test(word)) {
				validWords.add(word);
			}
		}

		// Step 4: Print the valid words
		System.out.println("Valid Strings:");
		for (String word : validWords) {
			System.out.println("- " + word);
		}
	}
}
