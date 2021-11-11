package com.example.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.service.UserService;
import com.example.vo.UserVO;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
@Log
class UserBeanJUnitSpringTest {

	@Autowired
	private UserService userService;
	
	
	@Test
	@DisplayName("Init Test")
	void test() {
		UserVO userVo = this.userService.selectOne("jimin");
		log.info(userVo.toString());
	}
	@Disabled
	@Test
	@DisplayName("Insert User")
	public void test1() {
		UserVO userVo = new UserVO("chulsu", "박철수", "남", "제주");
		this.userService.insert(userVo);
	}

	@Disabled
	@Test
	@DisplayName("Select All")
	public void test2() {
		this.userService.selectList().forEach(user -> log.info(user.toString()));
	}
	
}
