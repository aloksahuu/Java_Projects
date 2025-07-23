package com.aurionpro.methodoverloading.Test;

import com.aurionpro.methodoverloading.model.Greet;

public class GreetTest {
	public static void main(String[] args) {
		String name ="Anshika";
		
		Greet greets = new Greet();
		greets.greet();
		greets.greet(name);
	}
}
