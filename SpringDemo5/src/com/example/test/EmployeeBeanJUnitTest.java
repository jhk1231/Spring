package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.EmployeeInfo;

import lombok.extern.java.Log;

@Log
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) // 이걸 해주면 BeforeEach 해줄 필요가없다
class EmployeeBeanJUnitTest {

	@Autowired
	private ApplicationContext ctx;
	
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
