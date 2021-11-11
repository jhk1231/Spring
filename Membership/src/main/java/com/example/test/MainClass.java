package com.example.test;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.ApplicationConfig;

import lombok.extern.java.Log;

@Log
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	
		DataSource ds = (DataSource)ctx.getBean("dataSource");
		try(Connection conn = ds.getConnection()) {
			log.info(ds.toString());
		} catch (Exception e) {
			log.info(e.toString());
		}
	}

}
