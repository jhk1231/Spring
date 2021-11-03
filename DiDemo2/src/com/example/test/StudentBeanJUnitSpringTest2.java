package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.StudentInfo;
import com.example.config.StudentConfig1;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {StudentConfig1.class})
public class StudentBeanJUnitSpringTest2 {
	// 자동 바인딩된 Container를 사용하기 때문에 before를 할 필요가 없다.
	@Autowired
	private ApplicationContext ctx;
	
	@Test
	public void test() {
		StudentInfo info = this.ctx.getBean("info", StudentInfo.class);
		assertEquals(15, info.getStudent().getAge());
	}

}
