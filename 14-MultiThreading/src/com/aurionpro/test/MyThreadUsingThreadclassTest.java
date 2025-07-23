package com.aurionpro.test;

import com.aurionpro.model.MyThreadUsingThreadclass;

public class MyThreadUsingThreadclassTest {
	public static void main(String[] args) {
		MyThreadUsingThreadclass thread1 = new  MyThreadUsingThreadclass();
		thread1.start();
		
		MyThreadUsingThreadclass thread2 = new  MyThreadUsingThreadclass();
		thread2.start();
		
		MyThreadUsingThreadclass thread3 = new  MyThreadUsingThreadclass();
		thread3.start();
	}
}
