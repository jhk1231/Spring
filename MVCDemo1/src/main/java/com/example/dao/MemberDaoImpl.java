package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.vo.MemberVO;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertMember(MemberVO memberVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO selectMember(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> selectListMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMember(MemberVO memberVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String userid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
