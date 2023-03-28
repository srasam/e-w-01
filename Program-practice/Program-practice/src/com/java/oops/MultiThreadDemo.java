package com.java.oops;

public class MultiThreadDemo extends Thread{
	
	private int threadNum;
	public MultiThreadDemo(int threadNum) {
		this.threadNum= threadNum;
	}
	
	@Override
	public void run() {
		String threadName=Thread.currentThread().getName();
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			System.out.println(i + " From Thread: "+ threadName+" "+ java.time.LocalTime.now());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
	
	public static void main(String args[]) {
		for (int i=0;i<=3;i++) {
			MultiThreadDemo thread= new MultiThreadDemo(i);
			thread.start();
			
		}
	}

	
}
