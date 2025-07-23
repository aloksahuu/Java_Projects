package com.aurionpro.methodoverloading.model;

public class Converter {
	double celsius;
	double value;
	String scale;
	
	public double convert(double celsius) {
		return (celsius*9/5)+32;
	}
	public double convert(double value, String scale) {
		if(scale.equalsIgnoreCase("C")) {
			
			return (value*9/5)+32;
		}else {
			return (value-32)*5/9;
		}
	}
}
