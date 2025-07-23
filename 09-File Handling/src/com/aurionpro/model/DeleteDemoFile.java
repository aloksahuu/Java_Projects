package com.aurionpro.model;

import java.io.File;

public class DeleteDemoFile {
	public static void main(String[] args) {
		File file = new File("Demo.pptx");
		if(file.delete()) {
			System.out.println("File deleted sucessfully");
		}else {
			System.out.println("File dosent exists");
		}
	}
}
