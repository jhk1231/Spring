package com.example.biz;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.vo.UserVO;

import lombok.extern.java.Log;

/**
 * Handles requests for the application home page.
 */
@Controller
@Log
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("serverTime", new Date());
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("userid") String userid, @RequestParam("passwd") String passwd, Model model) {
		log.info("POST 방식으로 응답하기");
		model.addAttribute("userid", userid);
		model.addAttribute("passwd", passwd);
		return "login"; // /WEB-INF/views/login.jsp
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET) // /biz/login
	public ModelAndView login(@RequestParam("userid") String userid, @RequestParam("passwd") String passwd) {
		log.info("GET 방식으로 응답하기");
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("userid", userid);
		mav.addObject("passwd", passwd);
		return mav; // /WEB-INF/views/login.jsp
	}

//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public void register(UserVO user) {
//		log.info(user.toString()); // 제대로 들어왔는지 확인.
//	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void register(@ModelAttribute("u") UserVO user) {
	}

	// Redirect Code
	@RequestMapping("/verify")  // Get방식 ,  /biz/verify?userid=admin or user
	public String verify(@RequestParam("userid") String userid, Model model) {
		if (userid.equals("admin")) {
			return "redirect:admin"; //   /biz/admin
		}
		return "redirect:user"; //     /biz/user
		// return "redirect:http://www.naver.com"; //절대 경로도 가능
	}
	
	@RequestMapping("/admin")
	public void admin() {
		log.info("관리자이군요");
	}
	
	@RequestMapping("/user")
	public void user() {
		log.info("일반유저이군요");
	}
	

}
