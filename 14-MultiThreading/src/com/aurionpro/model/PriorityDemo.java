package com.aurionpro.model;

public class PriorityDemo extends Thread{
	
	public PriorityDemo(String name, int priority) {
		setName(name);
		setPriority(priority);
	}
	
//	public void run() {
//		System.out.println(getName() + " Thread started with priority "+ getPriority());
//	}
	
	public void run() {
		for(int i =0; i<=5;i++) {
			System.out.println(getName() + ": " + i);
			try {
				Thread.sleep(1000); // Interrupt the thread manually
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
