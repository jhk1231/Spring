package com.example.test;

import java.util.Scanner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.service.CityService;
import com.example.vo.CityVO;

import lombok.extern.java.Log;

@Log
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:beans.xml")
class MybatisDemoTest {
	
	@Autowired
	private CityService cityService;
	
	@Disabled
	@Test
	void test() {
//		assertNotNull(this.cityService);
		CityVO cityVo = this.cityService.selectCity("seoul");
		log.info(cityVo.toString());
	}
	
	@Test
	@DisplayName("국가 코드로 데이터 불러오기")
	public void test1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert a Country Code : ");
		String countryCode = scan.nextLine().trim().toUpperCase(); // 혹시 소문자이더라도 All 대문자로.
		this.cityService.SelectCitiesByCountryCode(countryCode).
			forEach(city -> log.info(city.toString()));
	}
}
