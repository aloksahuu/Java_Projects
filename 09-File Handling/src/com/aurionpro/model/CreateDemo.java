package com.aurionpro.model;

import java.io.File;
import java.io.IOException;

public class CreateDemo {
	public static void main(String[] args) throws IOException {
//		File file = new File("Demo.txt");
		File file = new File("Demo.pptx");
		
		if(file.createNewFile()) {
			System.out.println("File created sucessfully");
		}else {
			System.out.println("File already exists");
		}
	}
}
