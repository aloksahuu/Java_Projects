package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemoFile {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("Demo.txt"));
		String line;
		while((line = reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
	}
}
//hw use scanner and do it
