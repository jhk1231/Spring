package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDao;
import com.example.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int create(MemberVO memberVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO read(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(MemberVO memberVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String userid) {
		// TODO Auto-generated method stub
		return 0;
	}
}
