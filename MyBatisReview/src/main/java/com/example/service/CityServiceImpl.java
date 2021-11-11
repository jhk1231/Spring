package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CityDao;
import com.example.vo.CityVO;

@Service("citySerivce")
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityDao userDao;
	
	@Override
	public List<CityVO> SelectCitiesByCountryCode(String countryCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CityVO selectCity(String name) {
		return this.userDao.read(name); 
	}

}
