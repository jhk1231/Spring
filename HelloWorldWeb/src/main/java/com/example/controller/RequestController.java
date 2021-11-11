package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.vo.UserVO;

import lombok.extern.java.Log;

@Log
@Controller
public class RequestController {

	@RequestMapping(value = "/confirm", method = RequestMethod.GET)
	public String confirm(HttpServletRequest request, Model model) {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		model.addAttribute("userid", userid);
		model.addAttribute("passwd", passwd);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("gender", gender);

		return "confirm"; // /WEB-INF/views/ + confirm + .jsp
	}

	@RequestMapping(value = "/confirm1", method = RequestMethod.GET)
	public String confirm(@RequestParam("userid") String userid,
			@RequestParam("passwd") String passwd,
			@RequestParam("name") String name,
			@RequestParam("age") int age,
			@RequestParam("gender") String gender,
			Model model) {
		model.addAttribute("userid", userid);
		model.addAttribute("passwd", passwd);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("gender", gender);
		return "confirm1";
	}
	
	@RequestMapping(value = "/confirm2", method = RequestMethod.GET)
	public String confirm2(@RequestParam("userid") String userid,
			@RequestParam("passwd") String passwd,
			@RequestParam("name") String name,
			@RequestParam("age") int age,
			@RequestParam("gender") String gender,
			Model model) {
		UserVO userVo = new UserVO(userid, passwd, name, age, gender);
		model.addAttribute("userinfo", userVo);
		return "confirm2"; // /WEB-INF/views/ + confirm2 + .jsp
	}
	
	// void return해도 주소를 자동으로 만들어 준다. 파일의 이름(메서드 이름)을 가지고 만든다.
	@RequestMapping(value = "/confirm3", method = RequestMethod.GET)
	public void confirm3(UserVO user) {  // VO에 Null값이 없어야 한다.
		log.info(user.toString());
//		return "confirm3"; // /WEB-INF/views/ + confirm3 + .js
	}
	
	// @PathVariable 사용 (주로 Redirect에서 사용한다.)
	// mapping value이름이랑 confirm4 변수이름이랑 동일해야 한다.
	// 무조건 /, / 식으로 넣어야 한다.
	// 한글이 깨진다.
	// 비현실적( but, ajax같은곳에서는 유용할 수도 있다.
	@RequestMapping(value = "/confirm4/{userid}/{passwd}/{name}/{age}/{gender}", method = RequestMethod.GET)
	public String confirm4(@PathVariable String userid,
			@PathVariable String passwd,
			@PathVariable String name,
			@PathVariable int age,
			@PathVariable String gender,
			Model model) {
		UserVO userVo = new UserVO(userid, passwd, name, age, gender);
		model.addAttribute("userinfo", userVo);
		return "confirm4"; // /WEB-INF/views/ + confirm4 + .jsp
	}
	
}
