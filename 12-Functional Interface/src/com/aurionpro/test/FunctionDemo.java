package com.aurionpro.test;

import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
//		//CONVERT INT TO STRING
//		Function<Integer, String> convert = number -> number.toString();
//		System.out.println(convert.apply(23));
//		
//		// Calculate length oF string
//		Function<String, Integer> length = s -> s.length();
//		System.out.println(length.apply("Anshikaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
//		
//		
//		//TEMPERATURE CONVERTOR
//		Function<Double, Double> convertor = C ->  (C*9/5) +32;
//		System.out.println("Celsis value is : 78");
//		System.out.println("Celsius to fahrenheit :"+convertor.apply(78.0));
		
		// Student grade Generator
		Function<Integer, String> StudentGrade = (i) ->{
			if(i>=75) 
				return "A";
			else if (i>=50)
				return "B";
			else {
				return "Fail";
			}
			
		};
		
		List<Integer> studentMarks = List.of(88, 73, 45, 90, 55);
		
		System.out.println("Student Grades");
		for(int i =0; i<studentMarks.size();i++) {
			int marks = studentMarks.get(i);
			String grade = StudentGrade.apply(marks);
			System.out.println("Student " + (i + 1) + " - Marks: " + marks + " → Grade: " + grade);
		}
	}
}
