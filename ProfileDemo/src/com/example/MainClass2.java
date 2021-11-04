package com.example;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.java.Log;

// Profile Annotation으로 구현하기
@Log
public class MainClass2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Select dev or run : ");
		String config = scan.nextLine().trim();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);
		ctx.refresh();
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		log.info("IP: " + info.getIpNum());
		log.info("Port: " + info.getPortNum());
		ctx.close();
	}
}
