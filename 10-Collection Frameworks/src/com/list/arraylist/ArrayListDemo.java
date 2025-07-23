package com.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Alok");
		list.add("Anshika");
		list.add("Payal");
		list.add("Shruti");
		System.out.println("After adding: " + list);
		// Using Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// set method to change item
		list.set(1, "anshika");
		System.out.println(list);

		// add and remove
		list.add("XYZ");
		System.out.println(list);
		list.remove(4);
		System.out.println(list);

		// size method to calculate arrayList size
		System.out.println(list.size());

		// for each loop in arraylist
		for (String result : list) {
			System.out.println(result);
		}

		// Use wrapper class to declare arrylist of various types
		ArrayList<Integer> myint = new ArrayList<Integer>();
		myint.add(10);
		myint.add(13);
		myint.add(12);
		myint.add(15);
		myint.add(14);

		for (int i : myint) {
			System.out.println(i);
		}

		// sorting on basis of size of string
		Collections.sort(list);
		for (String i : list) {
			System.out.println(i);
		}
		// integer sorting
		Collections.sort(myint);
		for (int i : myint) {
			System.out.println(i);
		}

		// get index
		System.out.println("2nd index is :" + list.get(2));
		// use set method to set index,value.

		// contains - object returns boolean
		System.out.println(list.contains("Alok"));

		// clear is used to clear aaraylist
		myint.clear();
		System.out.println(myint);
		System.out.println(myint.isEmpty());
		System.out.println("---------------------");

		// add all
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		al.addAll(al2);// adding second list in first list
		Iterator<String> itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}

	}
}
