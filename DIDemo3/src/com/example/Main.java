package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:beans.xml");
		Hello hello = (Hello) context.getBean("hello");
		System.out.println(hello.sayHello());
		hello.print();
		
		Printer printer = (Printer) context.getBean("stringPrinter");
		System.out.println(printer.toString());
		

	}
}
