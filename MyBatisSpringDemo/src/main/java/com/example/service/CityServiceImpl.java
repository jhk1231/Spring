package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CityDao;
import com.example.vo.CityVO;

import lombok.extern.java.Log;

@Log
@Service("cityService")
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityDao cityDao;
	
	public List<CityVO> SelectCitiesByCountryCode(String countryCode) {
		return this.cityDao.readAll(countryCode);
	}

	public CityVO selectCity(String name) {
		return this.cityDao.read(name);
	}

}
