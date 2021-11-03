package com.example;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Student jimin() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("게임");  hobbies.add("여행");  hobbies.add("프로그래밍");
		Student jimin = new Student("박지민", 16, hobbies);
		jimin.setHeight(172.5); jimin.setWeight(52.3);
		return jimin;
	}
	
	@Bean
	public StudentInfo info() {
		StudentInfo info = new StudentInfo();
		info.setStudent(this.jimin());
		return info;
	}
}
