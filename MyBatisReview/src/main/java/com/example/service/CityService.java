package com.example.service;

import java.util.List;

import com.example.vo.CityVO;

public interface CityService {
	List<CityVO> SelectCitiesByCountryCode(String countryCode);
	CityVO selectCity(String name);
}
