package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.StudentInfo;

public class StudentBeanTest {
	public static void main(String[] args) {
		// 1. IoC Container 생성
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		// 2. Bean 생성
//		StudentInfo info = ctx.getBean("studentInfo", StudentInfo.class);
//		info.printStudent();
		// 생성자 재정의로 선언
		StudentInfo info = (StudentInfo)ctx.getBean("info");
		info.printStudent();
		
		
	}
}
