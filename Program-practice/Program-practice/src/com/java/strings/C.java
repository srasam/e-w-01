package com.java.strings;

class C extends B{
	public void swim() {
		System.out.println("swim 10 laps");
	}
	public static void main(String[] args) {
		A.run();
		B b=new C();
	
	}
}