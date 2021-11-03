package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Student;
import com.example.StudentInfo;

// Annotation에서 Setter로 Injection 하는법
// Java로 환경설정 하는법.
@Configuration
public class StudentConfig {
	
	// 만드려는 Bean의 클래스로 리턴 메소드 이름이 ID
	// setter를 이용하는 방법
	@Bean
	public Student jimin() {
		Student jimin = new Student();
		jimin.setName("한지민");
		jimin.setAge(19);
		jimin.setGrade(3);
		jimin.setClassNum(5);
		return jimin;
	}
	
	
	@Bean
	public StudentInfo info() {
		StudentInfo info = new StudentInfo();
		info.setStudent(jimin());
		return info;
	}
}
