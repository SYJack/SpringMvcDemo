package org.jack.sy.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	 //主页
    @RequestMapping(value = "/index", method = {RequestMethod.GET})
	public String toIndex(HttpServletRequest request,ModelMap map){
		return "index";
	}
	
}
