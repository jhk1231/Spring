package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ApplicationConfig2.class);
		
		Student jimin = ctx.getBean("jimin", Student.class);
		System.out.println(jimin);
	}
}
