package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.Student;

public class StudentBeanJUnitTest {
	// 1. Container 생성
	private ApplicationContext ctx;
	
	@Before
	public void init() {
		this.ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	
	@Test
	public void test() {
		// ctx가 null인지 아닌지 테스트.
		assertNotNull(this.ctx);
	}
	
	@Test
	public void test1() {
		Student younghee = this.ctx.getBean("younghee", Student.class);
		// assertEquals( 기대값, 실제값 )
		assertEquals("이영희", younghee.getName());
	}

}
