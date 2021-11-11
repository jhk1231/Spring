package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.vo.UserVO;

@Service("userServiceJdbcTemplate")
public class UserServiceImplJdbcTemplate implements UserService {
	@Autowired
	private UserDao userDaoJdbcTemplate;

	@Override
	public UserVO selectOne(String userid) {
		return this.userDaoJdbcTemplate.selectUser(userid);
	}

	@Override
	public List<UserVO> selectList() {
		return this.userDaoJdbcTemplate.selectUserList();
	}

	@Override
	public int insert(UserVO userVo) {
		return this.userDaoJdbcTemplate.insertUser(userVo);
	}

	@Override
	public int update(UserVO userVo) {
		return this.userDaoJdbcTemplate.updateUser(userVo);
	}

	@Override
	public int delete(String userid) {
		return this.userDaoJdbcTemplate.deleteUser(userid);
	}

}
