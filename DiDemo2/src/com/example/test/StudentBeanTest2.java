package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.StudentInfo;
import com.example.config.StudentConfig;
import com.example.config.StudentConfig1;

public class StudentBeanTest2 {

	// StudenteConfig1의 실행 코드
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(StudentConfig1.class);
		
		// method의 이름을 가지고 Bean을 가져온다.
		StudentInfo info = ctx.getBean("info", StudentInfo.class);
		System.out.println(info.getStudent());
	}
}
