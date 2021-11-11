package com.example.dao;

import java.util.List;

import com.example.vo.UserVO;

public interface UserDao {
	UserVO selectUser(String userid);
	List<UserVO> selectUserList();
	int insertUser(UserVO userVo);
	int updateUser(UserVO userVo);
	int deleteUser(String userid);
}
