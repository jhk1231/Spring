package com.example.service;

import java.util.List;

import com.example.vo.UserVO;

public interface UserService {
	UserVO selectOne(String userid);
	List<UserVO> selectList();
	int insert(UserVO userVo);
	int update(UserVO userVo);
	int delete(String userid);
}
