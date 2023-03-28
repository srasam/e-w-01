package com.java.oops;

public class MultiThreadMain {
	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			MultiThreadDemo thread = new MultiThreadDemo(i);
			thread.start();
		}

	}

}
