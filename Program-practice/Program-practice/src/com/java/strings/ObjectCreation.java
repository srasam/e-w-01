package com.java.strings;

import java.lang.reflect.Constructor;

public class ObjectCreation {
	public void message() {
		System.out.println("hey!");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// using new keyword
//		ObjectCreation obj=new ObjectCreation();
//		obj.message();
		//Class.newInstance() method- The method newInstance() from the type Class<ObjectCreation> is deprecated since version 9
		//ObjectCreation obj=ObjectCreation.class.newInstance();
		try {
			Constructor<ObjectCreation> obj=ObjectCreation.class.getConstructor();
			//ObjectCreation obj1=obj.newInstance(args);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
