package com.example;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.extern.java.Log;

// Profile Xml 버전
@Log
public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Select dev or run : ");
		String config = scan.nextLine().trim();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("dev.xml", "run.xml");
		ctx.refresh();
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		log.info("IP: " + info.getIpNum());
		log.info("Port: " + info.getPortNum());
		ctx.close();
	}
}
