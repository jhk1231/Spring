package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.MemberService;
import com.example.vo.MemberVO;

import lombok.extern.java.Log;

@Controller
@Log
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST )
	public void create(MemberVO memberVo, Model model) { // Jsp에게 값을 보내려면 Model이 필요
		log.info(memberVo.toString());
	}
	
	
	
	
}
