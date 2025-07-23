package com.aurionpro.model;

import java.util.Map;

public class TestPractice {
	public static void main(String[] args) {
		Map<String, String> nameGender = Map.of("Alok", "Male", "Anshika", "Female", "Amit", "Female", "Rucha",
				"Female");
		
		nameGender.entrySet().stream()
			.map( e ->{
				String prefix = e.getValue().equalsIgnoreCase("Male")? "Mr." : "Ms.";
				return prefix + e.getKey();
			}).forEach(System.out::println);
	}
}
