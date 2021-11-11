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
//@ContextConfiguration(locations = {"classpath:beans.xml"})
@ContextConfiguration(classes = {ApplicationConfig.class})
@Log
class MembershipTest {
	@Autowired
	private UserService userService;
	
	@Test
	void test() {
		assertNotNull(this.userService);
	}
	
	@Disabled @Test
	public void test1() {
		List<UserVO> list = this.userService.selectList();
		//log.info(String.valueOf(list.size()));
		//assertEquals(2, list.size());
		list.forEach(userVo -> log.info(userVo.toString()));
	}
	
	@Disabled @Test
	public void test2() {
		UserVO userVo = this.userService.selectOne("jimin");
		log.info(userVo.toString());
		assertEquals("한지민", userVo.getName());
	}
	
	@Disabled @Test
	public void test3() {
		UserVO userVo = new UserVO("chulsu", "김철수", "남", "부산");
		int count = this.userService.insert(userVo);
		assertEquals(1, count);   //전체명수가 아니라 입력한 레코드 개수
		this.test1();
	}
	
	@Disabled @Test
	public void test4() {
		UserVO userVo = new UserVO("chulsu", "김철순", "여", "인천");
		this.userService.update(userVo);
		
		UserVO userVo1 = this.userService.selectOne("chulsu");
		log.info(userVo1.toString());
	}
	
	@Test
	public void test5() {
		int count = this.userService.delete("chulsu");
		assertEquals(1, count);
		
		List<UserVO> list = this.userService.selectList();
		list.forEach(userVo -> log.info(userVo.toString()));
	}

}
