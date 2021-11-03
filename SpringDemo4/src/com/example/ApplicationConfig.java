package com.example;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() {
		// 생성자로 주는 값
		Student student1 = new Student("홍지민", 44, Arrays.asList("낚시", "등산", "바둑"));
		// setter로 입력
		student1.setHeight(165);
		student1.setWeight(45);
		return student1;
	}
}
