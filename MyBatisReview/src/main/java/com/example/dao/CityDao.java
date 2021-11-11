package com.example.dao;

import java.util.List;

import com.example.vo.CityVO;

public interface CityDao {
	List<CityVO> readAll(String countryCode); 
	CityVO read(String name);
}
