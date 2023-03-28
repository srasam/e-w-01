package com.java.oops;

public class Test {
	private int threadNum;
	public Test(int threadNum) {
		this.threadNum= threadNum;
	}
	
	
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
			Test test= new Test(i);
			test.run();
			
		}
	}
}
