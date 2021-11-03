package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class MainClass {
	public static void main(String[] args) {
		// 1. IoC Container 생성하기
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		// 2. Meta Configuration File 지정하기
		String path = "classpath:applicationContext.xml";
		ctx.load(path);
		ctx.refresh();
		
		// 3. Bean 생성하기
//		Student jimin = ctx.getBean("student1", Student.class);
		Product carnival = ctx.getBean("carnival", Product.class);
		Product sonata = (Product) ctx.getBean("carnival");
		if(carnival == sonata) log.info("Equals");
		else log.info("Different");
//		log.info(carnival.toString());
		
		// 4. IoC Container 소멸하기
		ctx.close();
	}
}
