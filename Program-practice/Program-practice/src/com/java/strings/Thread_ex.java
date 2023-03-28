package com.java.strings;

public class Thread_ex extends Thread {

	public void run() {
		System.out.println("Current thread name: " + Thread.currentThread().getName());
		System.out.println("run() method called");
	}
	public static void main(String[] args) {
		Thread_ex t = new Thread_ex();
		t.start();
	}
}

