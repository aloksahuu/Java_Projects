package com.list.HashMap;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(1, "Alok");
		map.put(2, "Anshika");
		map.put(null, "Payal");
		map.put(3,"Shruti");
		map.put(4, "Vedant");
		
		map.putIfAbsent(5, "Deep");
		map.putIfAbsent(5, "Sneha");
		
		System.out.println(map.get(1));
		System.out.println(map);
		
		System.out.println(map.remove(3));
		System.out.println(map);
		
		System.out.println(map.remove(5, "Alok"));
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("Alok"));
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.replace(1, "alok"));
		
		System.out.println(map.replace(1, "alok", "Alok"));
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
	}
}
