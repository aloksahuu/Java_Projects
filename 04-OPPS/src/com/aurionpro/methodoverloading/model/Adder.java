package com.aurionpro.methodoverloading.model;

public class Adder {
	int a,b,c;
	double d1,d2;
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	
	public void add1(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add1(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
}
