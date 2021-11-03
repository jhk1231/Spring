package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Employee2;
import com.example.config.ApplicationConfig2;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest2 {
	public static void main(String[] args) {
		// Create Spring Container
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig2.class);

		Employee2 smith = ctx.getBean("smith1", Employee2.class);

		log.info(smith.toString());

	}
}
