package com.aurionpro.methodoverloading.Test;

import com.aurionpro.methodoverloading.model.Converter;

public class ConverterTest {
	public static void main(String[] args) {
		double celsius = 50;
		double value = 57.9;
		String scale1 = "C";
		String scale2 = "F";
		
		Converter convert = new Converter();
		System.out.println("The value in Fahrenheit is :"+convert.convert(celsius));
		System.out.println("C to F :"+convert.convert(value, scale1));
		System.out.println("F to C:"+convert.convert(value, scale2));
	}
}
//Create a class Converter:
// convert(double celsius) – converts to Fahrenheit
// convert(double value, String scale) – if scale is "C", convert to F; if "F", 
//convert to C