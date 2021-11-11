package com.example.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:beans.xml");
		
		DataSource ds = ctx.getBean("dataSource", BasicDataSource.class);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Users");
			while(rs.next()) {
				log.info("User name : " + rs.getString("name"));
			}
		}catch(SQLException ex) {
			log.info(ex.toString());
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException ex) {
				log.info(ex.toString());
			}
		}
	}
}
