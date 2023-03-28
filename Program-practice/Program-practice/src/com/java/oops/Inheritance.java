package com.java.oops;

	//base interface1
	interface Moveable
	{
	  public void run();
	}
	//base interface2
	interface Speakable
	{
	  public void speak();
	}
	//child interface inheriting two base interfaces
	interface Ability extends Moveable, Speakable
	{
	  public void show();
	}
	 class Student{
		public void message() {
			System.out.println("hello");
		}
	}
	
	class Person extends Student implements Ability 
	{
	  @Override
	  public void run()
	  {
	    System.out.println("I can run !!");
	  }
	  @Override
	  public void speak()
	  {
	    System.out.println("I can speak !!");
	  }
	  @Override
	  public void show() 
	  {
	    System.out.println("I am a person, I can speak and run !!");
	  }
	}
	public class Inheritance//MULTIPLE INHERTITANCE
	{
	  public static void main(String[] args)
	  {
	    Person obj = new Person();
	    obj.message();
	    obj.run();
	    obj.speak();
	    obj.show();
	  }
	}


