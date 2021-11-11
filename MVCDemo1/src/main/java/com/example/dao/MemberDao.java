package com.example.dao;

import java.util.List;

import com.example.vo.MemberVO;

public interface MemberDao {
	int insertMember(MemberVO memberVo);
	MemberVO selectMember(String userid);
	List<MemberVO> selectListMember();
	int updateMember(MemberVO memberVo);
	int deleteMember(String userid);
}
