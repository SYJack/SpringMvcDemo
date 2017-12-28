package org.jack.sy.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@RequestMapping(value = "/showStudent",method = {RequestMethod.GET})
	public String showStudent(HttpServletRequest request,ModelMap map){
		return "admin/showStudent";
	}

	@RequestMapping(value = "/showCurriculum",method = {RequestMethod.GET})
	public String showCurriculum(HttpServletRequest request,ModelMap map){
		return "admin/showCurriculum";
	}
	
	@RequestMapping(value = "/showTeacher",method = {RequestMethod.GET})
	public String showTeacher(HttpServletRequest request,ModelMap map){
		return "admin/showTeacher";
	}
	
}
