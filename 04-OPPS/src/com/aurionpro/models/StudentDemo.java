package com.aurionpro.models;

public class StudentDemo {
	public static void ChangeName(Student s) {
		s.name = "Anjali";
		s = new Student();
		s.name ="Riya";
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Amit";
		
		ChangeName(s1);
		System.out.println("Name :"+s1.name);
	}
}
