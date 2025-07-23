package com.list.HashMap;

import java.util.Collections;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(1, "Alok");
		table.put(2, "Anshika");
		table.put(6, "Payal");
		table.put(4, "Vedant");
		table.put(5, "Deep");
		table.put(3, "xyz");
		System.out.println(table);
		
		System.out.println(table.get(1));
		System.out.println(table.remove(3));
		System.out.println(table);
		table.put(3, "xyz");
		System.out.println(table.remove(3, "xyz"));
		
		System.out.println(table.containsKey(1));
		System.out.println(table.containsValue("Anshika"));
		
		System.out.println(table.size());
		System.out.println(table.isEmpty());
		
//		table.clear();
//		System.out.println(table);
		
		System.out.println(table.keySet());
		System.out.println(table.values());
		
		System.out.println(table.entrySet());
		
		System.out.println("clone "+table.clone());
		System.out.println(table.equals(table));// check with another table if they are equals
		
		
		System.out.println(table.hashCode());
		
		
	}
}
