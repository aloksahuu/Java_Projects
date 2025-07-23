package com.aurionpro.methodoverloading.model;

public class Greet {
	String name;
	
	public void greet() {
		System.out.println("Hello");
	}
	public void greet(String name) {
		System.out.println("Hello "+name+"!");
	}
}
