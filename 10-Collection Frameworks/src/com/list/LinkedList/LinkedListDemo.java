package com.list.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<String>();

		// add elements
		cities.add("Mumbai");
		cities.add("Banglore");
		cities.add("Delhi");
		cities.add("Hydrabad");
		System.out.println(cities);

		// add at beginning
		cities.addFirst("Kolkata");

		// add at last
		cities.addLast("Chennai");

		cities.add(2, "Pune");

		System.out.println(cities);

		// get elements
		System.out.println(cities.get(2));

		System.out.println(cities.getFirst());
		System.out.println(cities.getLast());

		// indexof
		System.out.println(cities.indexOf("Mumbai"));

		// size
		System.out.println(cities.size());

		// reversing emenets using iterator
		Iterator<String> itr = cities.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
