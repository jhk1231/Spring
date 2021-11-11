package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public UserVO selectOne(String userid) {
		return this.userDao.selectUser(userid);
	}

	@Override
	public List<UserVO> selectList() {
		return this.userDao.selectUserList();
	}

	@Override
	public int insert(UserVO userVo) {
		return this.userDao.insertUser(userVo);
	}

	@Override
	public int update(UserVO userVo) {
		return this.userDao.updateUser(userVo);
	}

	@Override
	public int delete(String userid) {
		return this.userDao.deleteUser(userid);
	}

}
