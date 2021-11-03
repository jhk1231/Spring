package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"classpath:applicationContext.xml", 	"classpath:applicationContext2.xml");
		Student student1 = (Student) ctx.getBean("student1");
		Student student3 = ctx.getBean("student3", Student.class);
		Product computer = ctx.getBean("product", Product.class);
		System.out.println(student1);
		System.out.println(student3);
		System.out.println(computer);
	}
}
