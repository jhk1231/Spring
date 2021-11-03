package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.extern.java.Log;

@Log
class StudentBeanJUnitTest {
	
	private GenericXmlApplicationContext ctx;
	
	
	@BeforeEach
	public void init() {
		this.ctx = new GenericXmlApplicationContext();
		log.info("방금 IoC Container가 생성되었습니다.");
		this.ctx.load("classpath:applicationContext.xml");
		this.ctx.refresh();
	}
	
	@Test
	void test() {
		Student jimin = this.ctx.getBean("jimin", Student.class);
		log.info(jimin.toString());
		this.ctx.close();
	}

}
