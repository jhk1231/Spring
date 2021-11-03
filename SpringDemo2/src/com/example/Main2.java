package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				ApplicationConfig.class, ApplicationConfig2.class);

		StudentInfo info = ctx.getBean("info", StudentInfo.class);
		System.out.println(info.getStudent());
		Student younghee = ctx.getBean("younghee",Student.class);
		
		Product pencil = ctx.getBean("pencil", Product.class);
		System.out.println(pencil);
	
	}
}
