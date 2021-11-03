package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.EmployeeInfo;
import com.example.config.ApplicationConfig;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest {
	public static void main(String[] args) {
		// Create Spring Container

//		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		Employee smith = ctx.getBean("smith", Employee.class);
//				System.out.println(smith.toString());
//		 sysout을 쓰지 않고 Log로 출력 찍어본다.
//		log.info(smith.toString());
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeInfo info = ctx.getBean("info", EmployeeInfo.class);
		log.info(info.getEmployee().toString());
		
	}
}
