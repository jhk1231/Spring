package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.StudentInfo;
import com.example.config.StudentConfig;

public class StudentBeanTest1 {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(StudentConfig.class);
		
		// method의 이름을 가지고 Bean을 가져온다.
		StudentInfo info = ctx.getBean("info", StudentInfo.class);
		System.out.println(info.getStudent());
	}
}
