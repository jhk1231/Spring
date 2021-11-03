package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Student;
import com.example.StudentInfo;

// Annotation에서 생성자로 Injection하는법
// Java로 환경설정 하는법.
@Configuration
public class StudentConfig1 {
	
	// 만드려는 Bean의 클래스로 리턴 메소드 이름이 ID
	// setter를 이용하는 방법
	@Bean
	public Student yuri() {
		Student yuri = new Student("조유리", 15, 2, 3);
		return yuri;
	}
	
	
	@Bean
	public StudentInfo info() {
		StudentInfo info = new StudentInfo(yuri());
		return info;
	}
}
