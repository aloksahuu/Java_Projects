package com.aurionpro.test;

import java.util.List;
import java.util.function.Consumer;

import com.aurionpro.model.Invoice;

public class ConsumerDemo {
	public static void main(String[] args) {

		// Consumer that converts string to uppercase
		Consumer<String> consumer = msg -> System.out.println(msg.toUpperCase());
		consumer.accept("abcdefg");

		// Consumer that prints each element in a List<String>
		Consumer<List<String>> printList = list -> {
			for (String s : list) {
				System.out.println(s);
			}
		};

		// Test list
		List<String> names = List.of("Alok", "Ravi", "Anshika");
		printList.accept(names);

	}
}
