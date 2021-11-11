package com.example.biz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * @RequestMapping은 중복되면 안된다.!
 */

@Controller
public class UserController {
	
	// 유저가 /view를 쓴다는것. 전송방식은 default가 get
	@RequestMapping("/view") // www.example.com:8080/biz/view 를 호출했을 때 
	public String view(Model model) {
		model.addAttribute("currentDate", new java.util.Date());
		return "view";     //  /WEB-INF/views/ + view + .jsp 를 호출 (Servlet-context에 정의되어 있다.)
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET) // www.example.com:8080/biz/user 를 호출 했을 때
	public ModelAndView user() {
//	public ModelAndView user(Model model) {
//		model.addAttribute("username", "한지민");
//		model.addAttribute("userage", 24);
//		model.addAttribute("job", "Developer");
//		return "user"; //  /WEB-INF/views/ + user + .jsp 를 호출 (Servlet-context에 정의되어 있다.)
		
		// ** 생성자 주입법
//		ModelAndView mav = new ModelAndView("user.jsp");
//		mav.addObject("username", "한지민");
//		mav.addObject("currentDate", new java.util.Date());
		
		// *** view를 set방식으로 주입하는 법
		ModelAndView mav = new ModelAndView();
		mav.addObject("userid", "javaexpert@nate.com");
		mav.addObject("passwd", "1234567");
		// 맨 처음 jsp 페이지를 알려준다. jsp는 뒤에 자동으로 붙도록 설정했기 때문에 생략
		//호출되었을 때 이동할 jsp 페이지
		mav.setViewName("/demo"); 
		
		
		return mav;
	}

	@RequestMapping("/fruits") // www.example.com:8080/biz/fruits 를 호출했을 때
	public String fruits(Model model) {
		String[] array = { "Apple", "Mango", "Lemon", "Grape" };
		model.addAttribute("fruits", array);
		return "fruits"; //  /WEB-INF/views/ + fruits + .jsp 를 호출 (Servlet-context에 정의되어 있다.)
	}
}