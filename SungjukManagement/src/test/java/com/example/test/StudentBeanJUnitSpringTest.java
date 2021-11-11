package com.example.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.vo.StudentVO;

import lombok.extern.java.Log;

/* Student DB작업 전 Connection 및 Data Test*/

@Log
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })
@Component
class StudentBeanJUnitSpringTest {
	
	@Autowired
	private DataSource dataSource;

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Disabled
	@Test
	@DisplayName("HikariCP Init Test")
	void test() {
		assertNotNull(this.dataSource);
	}

	@Disabled
	@Test
	@DisplayName("HikariCP DB Connection Test")
	void test1() {
		try (Connection conn = this.dataSource.getConnection()) {
			log.info(conn.toString());
		} catch (Exception ex) {
			fail(ex.toString());
		}
	}

	@Disabled
	@Test
	@DisplayName("SqlSession Init Test")
	void test2() {
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		log.info(sqlSession.toString());
	}

	@Test
	@DisplayName("학생 총점 계산 Test")
	void test3() {
		List<StudentVO> list = new ArrayList<StudentVO>();
		Input input;
		try {
			input = new Input(list);
			input.input();
//			log.info(list.size() + "명");
			Calc calc = new Calc(list);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertEquals(326, list.get(0).getTot());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
