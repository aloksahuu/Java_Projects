package com.aurionpro.model;

public class MyThreadUsingThreadclass extends Thread {
	@Override
	public void run() {
		System.out.println("Current thread running is :"+Thread.currentThread().getName());
	}
}
