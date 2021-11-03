package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Student;
import com.example.config.StudentConfig;

public class StudentBeanJUnitTest1 {
	// 1. Container 생성
	private ApplicationContext ctx;
	
	@Before
	public void init() {
		this.ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
	}
	
	
	@Test
	public void test() {
		// ctx가 null인지 아닌지 테스트.
		assertNotNull(this.ctx);
	}
	
	@Test
	public void test1() {
		Student jimin = this.ctx.getBean("jimin", Student.class);
		// assertEquals( 기대값, 실제값 )
		assertEquals("한지민", jimin.getName());
	}

}
