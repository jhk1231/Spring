package com.example;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import lombok.extern.java.Log;

@Log
public class MainClass {
	public static void main(String[] args) {

		// ConfigurableApplicationContext: Environment를 핸들링 할 수 있는 메소드를 가지고 있다.
		//1. Ioc Container 생성
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		
		// Environment를 가져온다.
		ConfigurableEnvironment env = ctx.getEnvironment();
		// Environment가 Property들을 가져온다.
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			// classpath가 지정된 property를 가져와라.
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
			log.info(env.getProperty("admin.id")); // property 추출
			log.info(env.getProperty("admin.pwd"));
		} catch(IOException ex) {
			log.info("Exception 발생");
		}

		// 강제 형변환
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
		gCtx.load("classpath:beans.xml");
		// Load 후 refresh()는 필수!
		gCtx.refresh();

		// Bean 생성
		
		AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
		log.info("admin ID : " + adminConnection.getAdminId());
		log.info("admin PWD : " + adminConnection.getAdminPwd());
		
		
	}
}
