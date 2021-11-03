package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String xml = "classpath:applicationContext.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(xml);
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.toString());
		
	}
}
