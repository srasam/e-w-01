package com.java.oops;

public class ThreadImpl extends Thread {
	@Override
	public void run() {
		ThreadMethods tm = new ThreadMethods();
		tm.walk();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		tm.swim();
		System.out.println(Thread.currentThread().getName());
		tm.exercise();
		System.out.println(Thread.currentThread().getName());

	}
	
	public static void main(String []args) {
		ThreadImpl ti=new ThreadImpl();
		ti.start();
	}

}
