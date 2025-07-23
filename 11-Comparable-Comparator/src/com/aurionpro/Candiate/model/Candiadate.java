package com.aurionpro.Candiate.model;

public class Candiadate {
	String name;
	int age;
	
	public Candiadate(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		 return "Candidate{name='" + name + "', age=" + age + "}";
	}	
}
