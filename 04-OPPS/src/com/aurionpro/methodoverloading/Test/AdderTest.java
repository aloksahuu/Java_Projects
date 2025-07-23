package com.aurionpro.methodoverloading.Test;

import com.aurionpro.methodoverloading.model.Adder;

public class AdderTest {
	public static void main(String[] args) {
		int a = 10;
		int b= 2;
		int c =5;
		double d1 = 12.1;
		double d2 = 11.9;
		
		Adder add = new Adder();
		System.out.println("add a and b :"+add.add(a, b));
		System.out.println("add doubles values :"+add.add(d1, d2));
		System.out.println("Add 3 numbers :"+add.add(a, b, c));
	}
}
