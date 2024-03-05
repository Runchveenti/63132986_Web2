package jp.ivs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login() {
		return "user/login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(ModelMap model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		if(id.equals("fpt")&&pw.equals("polytechnic")) {
			model.addAttribute("message","Sai thông tin đăng nhập !");
		}
		else {
			model.addAttribute("message","Sai thông tin đăng nhập !");
		}
		return "user/login";
	}
}