package com.aurionpro.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());
		
		Supplier<LocalDate> currentdate = () -> LocalDate.now();
		System.out.println(currentdate.get());
		
		Supplier<LocalTime> currentTime = ()-> LocalTime.now();
		System.out.println(currentTime.get());
		
		Supplier<LocalDateTime> dateTime = ()->LocalDateTime.now();
		System.out.println(dateTime.get());
	}
	
}
