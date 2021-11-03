package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.EmployeeInfo;
import com.example.config.ApplicationConfig;

import lombok.extern.java.Log;

@Log
class EmployeeBeanJUnitSpringTest {

	private AnnotationConfigApplicationContext ctx;
	
	@BeforeEach
	public void init() {
		this.ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	}
	
	@Test
	void test() {
		assertNotNull(this.ctx);
	}
	
	@Test
	@DisplayName("Info Test 1")
	public void test1() {
		EmployeeInfo info = this.ctx.getBean("employeeInfo", EmployeeInfo.class);
		log.info(info.getEmployee().toString());
	}
	
	@Test
	public void test2() {
		EmployeeInfo info = this.ctx.getBean("employeeInfo", EmployeeInfo.class);
		assertEquals("Smith Pitt", info.getEmployee().getEname());
	}
}
