package com.java.oops;

public class MultiThreadRunnable implements Runnable {
	private int threadNum;

	public MultiThreadRunnable(int threadNum) {
		this.threadNum = threadNum;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " From Thread: " + threadNum);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

	public static void main(String[] args) {
		//for (int i = 0; i <= 3; i++) {
			MultiThreadRunnable thread = new MultiThreadRunnable(1);
			Thread myThread=new Thread(thread);
			myThread.start();
			myThread.start();
		//}

	}
}
