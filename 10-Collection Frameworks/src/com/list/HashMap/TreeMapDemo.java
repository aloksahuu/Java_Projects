package com.list.HashMap;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "Alok");
		map.put(3, "Anshika");
		map.put(5, "KUKU");
		map.put(2, "Pagal");
		map.put(4, "Kumkum");
		map.put(6, "Kiyo");
		
		System.out.println(map);
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.higherKey(4));
		System.out.println(map.lowerKey(4));
		
		System.out.println(map.ceilingKey(5));
		System.out.println(map.floorKey(6));
		
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		System.out.println(map.descendingKeySet());
		
		
		
	}
}
