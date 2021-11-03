package com.example;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig2 {
	
	@Bean
	public Student younghee() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("바둑"); hobbies.add("독서");
		Student younghee = new Student("이영희", 34, hobbies);
		younghee.setHeight(158.2);
		younghee.setWeight(46.2);
		return younghee;
	}
	
	@Bean
	public Product pencil() {
		Product pencil = new Product("연필", 200);
		pencil.setMaker("모나미"); pencil.setColor("black");
		return pencil;
		
	}
}
