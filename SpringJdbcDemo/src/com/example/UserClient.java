package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import lombok.extern.java.Log;

@Log
public class UserClient {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:beans.xml");
		DataSource ds = ctx.getBean("dataSource", SimpleDriverDataSource.class);
		try {
			Connection conn = ds.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT version(), now(), user()");

			rs.next();
			log.info("Version : " + rs.getString(1));
			log.info("Now : " + rs.getString(2));
			log.info("User : " + rs.getString(3));

			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
