package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vo.CityVO;

import lombok.extern.java.Log;

@Log
@Repository("cityDao")
public class CityDaoImpl implements CityDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<CityVO> readAll(String countryCode) {
		return this.sqlSession.selectList("City.selectListCity", countryCode);
	
	}

	public CityVO read(String name) {
		return this.sqlSession.selectOne("City.selectOneCity",name);
		
	}

}
