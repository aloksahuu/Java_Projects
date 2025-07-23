package com.list.HashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(1, "Alok");
		map.put(5, "Alok");
		map.put(3, "Alok");
		map.put(4, "Alok");
		map.put(2, "Alok");
		map.put(6, "Alok");
		System.out.println(map);
		
		System.out.println(map.entrySet());
		System.out.println(map.getOrDefault(5, "Alok"));
		System.out.println(map);
	}
}
