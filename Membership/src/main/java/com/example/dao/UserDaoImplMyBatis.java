package com.example.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.example.vo.UserVO;
import com.ibatis.common.resources.Resources;

@Repository("userDao1")
public class UserDaoImplMyBatis implements UserDao {

	@Override
	public UserVO selectUser(String userid) {
		Reader rd = null;
		SqlSession session = null;
		UserVO userVO = null;
		try {
		rd = Resources.getResourceAsReader("mybatis-config.xml");
		session = new SqlSessionFactoryBuilder().build(rd).openSession();
		userVO = (UserVO)session.selectOne("select", userid);
		} catch (IOException e) {
		e.printStackTrace();
		}
		return userVO;
	}

	@Override
	public List<UserVO> selectUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(UserVO userVo) {
		// TODO Auto-generated method stub

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
