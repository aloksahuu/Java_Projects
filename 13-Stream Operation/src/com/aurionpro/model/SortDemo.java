package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(2,3,8,7,5,1,6,4,10,9);
//		list.stream().sorted().forEach(System.out::println);
//		System.out.println("---------------------");
//		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		
//		System.out.println("------------------------");
//		List<String> names =Arrays.asList("Alok","Anshika","Rucha","Amit","Om","Aradhya");
//		names.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
//		
//		System.out.println("--------------------------");
//		list.stream().filter(i -> i%2==0).sorted().forEach(System.out::println);
		
		// skip, limit, sort
		List<Integer> list= Arrays.asList(2,5,70,33,76,76,76,69,89,22,46);
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		System.out.println("----------------");
		list.stream().sorted(Comparator.reverseOrder()).skip(3).forEach(System.out::println);
		System.out.println("------------");
		list.stream().distinct().forEach(System.out::println);
		System.out.println("-------");
		System.out.print("Print second highest number : ");
		list.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
		
		System.out.println("--------------------------------------");
		List<String> names =Arrays.asList("Alok","Anshika","Rucha","Amit","Om","Aradhya");
		names.stream().skip(3).forEach(System.out::println);
		
		System.out.println("------------------------------");
		List<Integer>marks = Arrays.asList(56,57,79,65,89,78,43);
		marks.stream().sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::println);
		
		System.out.println("-----------------------------");
		names.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		List<Integer>price = Arrays.asList(100,200,300,400,500,600,750,800,1000);
		price.stream().filter(i -> i>=500).limit(2).forEach(System.out::println);
	}
}
