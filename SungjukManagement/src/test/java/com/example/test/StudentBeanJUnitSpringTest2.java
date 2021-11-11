package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.service.StudentService;
import com.example.vo.StudentVO;

import lombok.extern.java.Log;

/* CRUD 코드 Test */

@Log
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })
@Component
class StudentBeanJUnitSpringTest2 {

	@Autowired
	private StudentService studentService;
	private List<StudentVO> list;

	@Disabled
	@BeforeEach
	public void init() { // 학생 12명 만들기
		try {
			list = new ArrayList<StudentVO>();
			Input input = new Input(list);
			input.input();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Disabled
	@Test
	@DisplayName("Student Insert")
	void test() {
		Calc calc = new Calc(this.list);
		this.list.forEach(student -> this.studentService.create(student));
	}	
	
	@Test
	@DisplayName("SelectListStudent Test")
	void test1() {
		this.studentService.readAll().forEach(student -> System.out.println(student));;
	}
	
	
	
}
