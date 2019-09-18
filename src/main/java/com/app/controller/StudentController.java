package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Student;
import com.app.service.IStudentService;

@Controller
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping("/showHomepage")
	public String showHomepage(){
		return "home";
	}
	
	@RequestMapping(value="/saveStudent",method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student, ModelMap map){
		Long studentId = studentService.saveStudent(student);
		String message = "Student Saved with : "+studentId;
		map.addAttribute("msg",message);
		return "home";
	}
	
	

}
