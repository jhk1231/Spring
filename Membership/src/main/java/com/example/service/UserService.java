package com.example.service;

import java.util.List;

import com.example.vo.UserVO;

public interface UserService {
	UserVO selectOne(String userid);
	List<UserVO> selectList();
	void insert(UserVO userVo);
	void update(UserVO userVo);
	void delete(String userid);
}
