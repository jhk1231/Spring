package com.example.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.service.CityService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import lombok.extern.java.Log;

@Log
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:beans.xml")
class MybatisDemoTest {

	@Autowired
	private CityService cityService;
	
	@Test
	@DisplayName("Init Test")
	void test() {
		assertNotNull(this.cityService);
	}

}
