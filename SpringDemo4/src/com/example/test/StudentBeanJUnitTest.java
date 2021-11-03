package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
//import org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Assertions.assertNotNull;
//import org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.ApplicationConfig2;
import com.example.Student;

class StudentBeanJUnitTest {
	private ApplicationContext ctx;
	
	@BeforeEach
	public void init() {
		this.ctx = new
				AnnotationConfigApplicationContext(ApplicationConfig2.class);
	}
	
	// 1. ctx가 null값인지 확인
	@Test
	public void test() {
		assertNotNull(this.ctx);
	}
	
	// Disabled: 스킵해라.
	@Disabled @Test
	public  void test1() {
		Student jimin = this.ctx.getBean("jimin", Student.class);
		assertEquals("곽지민", jimin.getName());
	}
	
	@Test
	public void test2() {
		Student jimin = this.ctx.getBean("jimin", Student.class);
		Student jimin1 = (Student) this.ctx.getBean("jimin");
		assertSame(jimin, jimin1);
	}

}
