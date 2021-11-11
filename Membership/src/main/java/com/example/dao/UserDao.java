package com.example.dao;

import java.util.List;

import com.example.vo.UserVO;

public interface UserDao {
	UserVO selectUser(String userid);
	List<UserVO> selectUserList();
	void insertUser(UserVO userVo);
	void updateUser(UserVO userVo);
	void deleteUser(String userid);
	
}