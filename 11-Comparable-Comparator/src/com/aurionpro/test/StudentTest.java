package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;

import com.aurionpro.comparator.model.*;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(12, "Alok"));
		list.add(new Student(23, "Rucha"));
		list.add(new Student(1, "Anshika"));
		list.add(new Student(21, "Rashi"));
		list.add(new Student(15, "Payal"));
		
		System.out.println(list);
		
		//Collections.sort(list); // for comperable
		
		//for comperator
		
		Collections.sort(list, new Sortbyid());
		System.out.println(list);
		
		Collections.sort(list, new SortByName());
		System.out.println(list);

	}
}
