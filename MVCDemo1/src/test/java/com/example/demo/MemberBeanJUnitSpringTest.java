package com.example.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.java.Log;


@Log
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Component
class MemberBeanJUnitSpringTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Disabled
	@Test
	@DisplayName("JDBC Interface Test")
	void test() {
		assertNotNull(this.dataSource);
		try(Connection conn = this.dataSource.getConnection()){
			log.info(conn.toString()); // Connection이 Null인지 아닌지 Test
		}catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	@DisplayName("O/R Mapper Test")
	void test1() {
		assertNotNull(this.jdbcTemplate);
	}

}
