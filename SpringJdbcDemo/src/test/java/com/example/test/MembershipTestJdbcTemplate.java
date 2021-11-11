package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.config.ApplicationConfig;
import com.example.service.UserService;
import com.example.vo.UserVO;

import lombok.extern.java.Log;

@Component
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:beansJdbcTemplate.xml"})
//@ContextConfiguration(classes = {ApplicationConfig.class})
@Log
class MembershipTestJdbcTemplate {
	@Autowired
	private UserService userServiceJdbcTemplate;
	
	@Test
	void test() {
		assertNotNull(this.userServiceJdbcTemplate);
	}
	
	@Test
	public void test1() {
		List<UserVO> list = this.userServiceJdbcTemplate.selectList();
		//log.info(String.valueOf(list.size()));
		//assertEquals(2, list.size());
		list.forEach(userVo -> log.info(userVo.toString()));
	}
	
	@Disabled @Test
	public void test2() {
		UserVO userVo = this.userServiceJdbcTemplate.selectOne("chulsu");
		log.info(userVo.toString());
		assertEquals("김철수", userVo.getName());
	}
	
	@Disabled @Test
	public void test3() {
		UserVO userVo = new UserVO("hojune", "손호준", "남", "광주");
		int count = this.userServiceJdbcTemplate.insert(userVo);
		assertEquals(1, count);   //전체명수가 아니라 입력한 레코드 개수
		this.test1();
	}
	
	@Disabled @Test
	public void test4() {
		UserVO userVo = new UserVO("chulsu", "김철순", "여", "인천");
		this.userServiceJdbcTemplate.update(userVo);
		
		UserVO userVo1 = this.userServiceJdbcTemplate.selectOne("chulsu");
		log.info(userVo1.toString());
	}
	
	@Disabled @Test
	public void test5() {
		int count = this.userServiceJdbcTemplate.delete("chulsu");
		assertEquals(1, count);
		
		List<UserVO> list = this.userServiceJdbcTemplate.selectList();
		list.forEach(userVo -> log.info(userVo.toString()));
	}

}
