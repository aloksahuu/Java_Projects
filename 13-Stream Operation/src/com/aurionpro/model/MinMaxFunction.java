package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxFunction {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 5, 12, 23, 46);
		System.out.println(numbers.stream().min(Comparator.comparing(Integer::intValue)));

		List<String> names = List.of("Alok", "Anshika", "Om", "Ravi", "Anurag");
		System.out.println(names.stream().max(Comparator.comparing(String::length)));

		List<Integer> marks = Arrays.asList(67, 69, 72, 75, 84, 89, 92, 95, 97, 99);
		System.out.println(marks.stream().max(Comparator.comparing(Integer::intValue)));

		System.out.println(marks.stream().filter(n -> n % 2 == 0).max(Integer::compare));
		
		
	}
}
