package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.vo.UserVO;

@Service("userService") //
public class UserServiceImpleiBatis implements UserService {

	@Autowired //userDao�� ���ε��ϴ� ��
	private UserDao userDao1;
	
	@Override
	public UserVO selectOne(String userid) {
		return this.userDao1.selectUser(userid);
	}

	@Override
	public List<UserVO> selectList() {
		return this.userDao1.selectUserList();
	}

	@Override
	public void insert(UserVO userVo) {
		userDao1.insertUser(userVo);
	}

	@Override
	public void update(UserVO userVo) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(String userid) {
		// TODO Auto-generated method stub
	}

}
