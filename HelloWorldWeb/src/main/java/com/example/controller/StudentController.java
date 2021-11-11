package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/bbs"})
public class StudentController {
	
//	@GetMapping("/get")  // GET이라고 확정되었다면 이렇게 사용할 수도 있다. 
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String demo(HttpServletRequest req, Model model) {
		model.addAttribute("username","한지민");
		model.addAttribute("userage", 22);
		model.addAttribute("usercity", "구리시");
		model.addAttribute("userip", req.getRemoteAddr()); // User가 접근했을때의 Ip
		return "/bbs/get"; //   /WEB-INF/views + /bbs/get + .jsp
	}
	
}
