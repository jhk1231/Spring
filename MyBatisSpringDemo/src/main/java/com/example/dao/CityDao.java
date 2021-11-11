package com.example.dao;

import java.util.List;

import com.example.vo.CityVO;

public interface CityDao {
	List<CityVO> readAll(String countryCode); // 국가 코드
	CityVO read(String name); // 도시 이름
}
