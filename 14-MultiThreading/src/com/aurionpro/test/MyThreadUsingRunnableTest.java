package com.aurionpro.test;

import com.aurionpro.model.MyThreadUsingRunnable;

public class MyThreadUsingRunnableTest {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThreadUsingRunnable());
		thread1.start();
		
		Thread thread2 = new Thread(new MyThreadUsingRunnable());
		thread2.start();
		
		Thread thread3 = new Thread(new MyThreadUsingRunnable());
		thread3.start();
		Thread thread4 = new Thread(new MyThreadUsingRunnable());
		thread4.start();
		Thread thread5 = new Thread(new MyThreadUsingRunnable());
		thread5.start();
	}
}
