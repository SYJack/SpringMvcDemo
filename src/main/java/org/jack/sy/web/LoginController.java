package org.jack.sy.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/user")
public class LoginController {
	
	 //登录跳转
    @RequestMapping(value = "/login", method = {RequestMethod.GET})
	public String login(){
    	System.out.println("BBB");
		return "login";
	}
    
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(HttpServletRequest request,ModelMap map,@RequestParam("username")String username,@RequestParam("password")String password){
    	System.out.println(username);
		return "index";
    }

}
