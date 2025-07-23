package com.aurionpro.model;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("Demo.txt",true);
		writer.append("Hello this is the 3st line .\n");
		writer.close();
		System.out.println("Write opertaion done succesfully");
	}
}
