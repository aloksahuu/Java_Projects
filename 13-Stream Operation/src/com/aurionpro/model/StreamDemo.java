package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 28, 33, 39, 47, 52);
		System.out.println(list);
		System.out.println("---------------------------------------------------");
		// Method 1 - odd numbers (by storing in a list named item.)
		List<Integer> item = list.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
		System.out.println(item);
		System.out.println("---------------------------------------------------");
		// Method 2 using for each no need to store in list
		list.stream().filter(num -> num > 15).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		// Given a list of names, print only those that start with the letter 'A'.
		List<String> names = Arrays.asList("Alok", "anshikayedi", "Rashi", "Rucha", "Amit", "Om");
		System.out.println(names);
		names.stream().filter(name -> name.toUpperCase().startsWith("A")).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		// You have a list of Student objects. Filter and print students who scored 60
		// or above.
		List<Integer> marks = Arrays.asList(45, 50, 55, 60, 70, 75, 80, 85, 90);
		marks.stream().filter(mark -> mark >= 60).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		// Given a list of strings, filter out all empty or blank strings
		List<String> filters = Arrays.asList(" ", "   ", "Alok", " Anshika", "");
		filters.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);

		// Map operations
		System.out.println("---------------------------------------------------");
		List<String> name = Arrays.asList("Alok", "anshika", "Rashi", "Rucha", "Amit", "Om");
		// name.stream().filter(str -> str.length()<=4).map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
		name.stream().filter(str -> str.length() <= 4).map(str -> str.toUpperCase()).collect(Collectors.toList())
				.forEach(System.out::println);
		
		
		System.out.println("---------------------------------------------------");
		// Given a list of integers, square each number and collect the result into a
		// new list.
		List<Integer> item1 = list.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(item1);
		
		
		System.out.println("---------------------------------------------------");
		// Given a list of names, prefix each name with "Mr." or "Ms." and print the
		// result.
		List<String> name1 = Arrays.asList("Alok", "anshika", "Rashi", "Rucha", "Amit", "Om");
		name1.stream().map(str -> "Mr. " + str).forEach(System.out::println);
		
		
		System.out.println("---------------------------------------------------");
		//Given a list of product prices, apply 10% discount to each and collect the new prices.
		List<Integer> price = Arrays.asList(60,70,100,120,150,500,700);
		price.stream().map(i -> 0.1*i).collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("---------------------------------------------------");
		//Multiply by 10 for each element from the list.
		price.stream().map(i -> i*10).collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("---------------------------------------------------");
		//count used with filter it returns long value
		//get the total number of passed student from the list.
		List<Integer> marks1 = Arrays.asList(45, 50, 55, 60, 70, 75, 80, 85, 90);
		long passed = marks1.stream().filter(i -> i>50).count();
		System.out.println(passed);
		System.out.println("---------------------------------------------------");
		//Given a list of integers, count how many are even / odd.
		long even = marks1.stream().filter(i -> i%2==0).count();
		System.out.println(even);
		
		// arrays to stream .....
		System.out.println("---------------------------------------------------");
		Integer [] arr = {10,12,13,14,15};
		long count1 = Arrays.stream(arr).filter(i -> i>12).count();
		System.out.println(count1);
	}
}
