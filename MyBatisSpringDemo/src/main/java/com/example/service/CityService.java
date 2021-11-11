package com.example.service;

import java.util.List;

import com.example.vo.CityVO;

public interface CityService {
	List<CityVO> SelectCitiesByCountryCode(String countryCode); // 국가 코드
	CityVO selectCity(String name); // 도시명
}
