package com.example.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.vo.UserVO;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import lombok.extern.java.Log;

@Log
@Repository("userDao")
public class UserDaoImpliBatis implements UserDao {

	@Override
	public UserVO selectUser(String id) { // autowirde
		Reader rd = null;
		SqlMapClient smc = null; // smc xml
		UserVO userVo = null;
		try {
			rd = Resources.getResourceAsReader("SqlMapConfig.xml");// xml
			smc = SqlMapClientBuilder.buildSqlMapClient(rd);
			userVo = (UserVO) smc.queryForObject("Users.useResultMap", id); //
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
		return userVo;
	}

	@Override
	public List<UserVO> selectUserList() {
		Reader rd = null;
		SqlMapClient smc = null; // smc xml
		List<UserVO> list = null;
		try {
			rd = Resources.getResourceAsReader("SqlMapConfig.xml");// xml
			smc = SqlMapClientBuilder.buildSqlMapClient(rd);
			list = smc.queryForList("Users.getAll");
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void insertUser(UserVO userVo) {
		Reader rd = null;
		SqlMapClient smc = null; // smc xml
		try {
			rd = Resources.getResourceAsReader("SqlMapConfig.xml");
			smc = SqlMapClientBuilder.buildSqlMapClient(rd);
			smc.insert("Users.insert", userVo);
			log.info("Insert된 User = " + userVo.toString()); // log가 찍혔다면 성공
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(UserVO userVo) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteUser(String userid) {
		// TODO Auto-generated method stub
	}

}
