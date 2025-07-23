package com.aurionpro.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class DefaultCityProvider {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Supplier<String> defaultCity = () -> "Pune";
//		System.out.println(defaultCity.get());
		System.out.println("Enter city name");
		String name = scanner.nextLine();
		if(name.isEmpty() || !name.matches("[a-zA-Z]+")) {
			System.out.println("Default City :" + defaultCity.get());
		}else {
			System.out.println(name);
		}
			
		
	}
}
