package com.aurionpro.model;

public class DaemonThread extends Thread {
	// Changing the name of Threads
	public DaemonThread(String name) {
		super(name);
	}

	// Overriding the run method
	public void run() {
		// Checking whether the thread is Daemon or not
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon thread");
		} else {
			System.out.println(getName() + " is User thread");
		}
	}
}
