package com.aurionpro.test;

import com.aurionpro.model.Istudent;

public class StudentTest {
	public static void main(String[] args) {
		
		// using lambda function
		
//		Istudent student = ()->System.out.println("Hello");
//		student.greet();
		
		Istudent student = (a,b)->a+b;
		System.out.println(student.add(10, 12));
		
		
		// using anonymous function
		
		Istudent student1 = new Istudent() {
			
			@Override
			public int add(int a, int b) {
				return a+b;
				
			}
		};
		System.out.println(student1.add(2, 3));
		
		
		
	}
}
