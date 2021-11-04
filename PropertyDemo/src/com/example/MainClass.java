package com.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:beans.xml");
		Hello hello = (Hello) ctx.getBean("hello");
		log.info(hello.sayHello());
		hello.print();
		Printer printer = ctx.getBean("stringPrinter", StringPrinter.class);
		log.info(printer.toString());

		List<String> fruites = hello.getFruits();
//		for (String fruit : fruites) {
//			log.info(fruit);
//		}

		// String Api의 lambda Expretion을 이용한 출력
		fruites.forEach(fruit -> log.info(fruit));
	}
}
