package org.jack.sy.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/student")
public class StudentController {

	@RequestMapping(value = "/showStudent",method = {RequestMethod.GET})
	public String showStudent(HttpServletRequest request,ModelMap map){
		return "student/showStudent";
	}
}
