package com.aurionpro.methodoverloading.Test;

import com.aurionpro.methodoverloading.model.Printer;

public class PrintTset {
	public static void main(String[] args) {
		String mssg = "Hello world";
		int num = 25;

		Printer prints = new Printer();
		prints.print();
		System.out.println(prints.print(mssg));
		System.out.println(prints.print(num));
	}
}