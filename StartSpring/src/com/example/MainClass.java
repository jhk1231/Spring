package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
		
	}
}
