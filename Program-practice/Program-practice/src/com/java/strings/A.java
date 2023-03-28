package com.java.strings;



public class A{
	
	protected static void run() {
		System.out.println("run 3 miles");
	}
	 private final void bike() {
		System.out.println("");
	}
	
}
class B extends A {
	double d1=10000;
	double d2=10000;
	boolean isValid= (d1==d2);
	
	
	public static void run() {
		System.out.println("B-class staic method");
	}
	
	public void bike() {
		System.out.println(isValid);
		
		System.out.println("Bike for 7 miles");
	}
	
}

