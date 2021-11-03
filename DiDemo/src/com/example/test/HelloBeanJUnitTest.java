package com.example.test;

import org.junit.Before;

public class HelloBeanJUnitTest {
	private AppilcationContext context;
	
	@Before
	public void init() {
		// 1.Ioc Contatiner 생성
		context = new GencericXmlApplicationContext("classpath:beans.xml");
	}
	
	
}
