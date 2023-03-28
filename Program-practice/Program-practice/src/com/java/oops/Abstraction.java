package com.java.oops;

abstract class BaseClass{
	
	  //abstract method
	  abstract public void show1();
	  //concrete method
	  public void show2()
	  {
	    System.out.println("Concrete method of parent class");
	  }
	}
	//child class
	 class ChildClass extends BaseClass
	{
	  // Must Override this method while extending the Parent class
	  public void show1()
	  {
		 
	    System.out.println("Overriding the abstract method of the parent class");
	  }
	  //Overriding concrete method is not compulsory
	  public void show2()
	  {
	    System.out.println("Overriding concrete method of the parent class");
	  }
	}
	public class Abstraction
	{
	  public static void main(String[] args)
	  {
	    /* we can't create object of the parent class hence we are creating object of the child class */
	    ChildClass obj = new ChildClass();
	    //ChildClass obj1=new BaseClass();//Cannot instantiate the type BaseClass
	    BaseClass obj1 = new ChildClass();
	    
	  obj.show1();
	  obj.show2();
	  obj1.show1();
	  obj1.show2();
	  }
	}



