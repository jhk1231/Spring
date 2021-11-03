package com.example;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.java.Log;

@ToString
@NoArgsConstructor
@Component(value="jimin")
@Log
public class Student /* implements InitializingBean, DisposableBean*/ {
	@Value("조유리")
	private String name;
	@Value("22")
	private int age;
	@Value("음악, 댄스, 춤, 기타")
	private List<String> hobbys;
	@Value("160")
	private double height;
	@Value("50")
	private double weight;
	
	@PostConstruct
	public void myStart() {	
		log.info("방금 Student Bean이 생성되었습니다.");	
	}
	
	@PreDestroy
	public void myEnd() {
		log.info("Student Bean이 제거되었습니다.");
	}
	
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		log.info("방금 Student Bean이 생성되었습니다.");
//	}
//	
//	@Override
//	public void destroy() throws Exception {
//		log.info("Student Bean이 제거되었습니다.");
//	}
}
