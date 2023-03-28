package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
		
		String[] beanNames=ctx.getBeanDefinitionNames();
		
		for(String beanName : beanNames) {
            System.out.println("bean: "+beanName);
        }
		//System.out.println(ctx.getApplicationName());
	}

}
