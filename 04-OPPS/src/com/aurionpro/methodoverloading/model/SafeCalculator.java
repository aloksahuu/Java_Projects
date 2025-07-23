package com.aurionpro.methodoverloading.model;

public class SafeCalculator {
	int a,b;
	double d1,d2;
	
	public int divide(int a, int b) {
		if(b==0) {
			System.out.println("Invalid");
			return -1;
		}else {
			return a/b;
		}
	}
	
	public double divide(double a, double b) {
		if(b==0) {
			System.out.println("Invalid");
			return -1;
		}else {
			return a/b;
		}
	}
}
