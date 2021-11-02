package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	//the student object will be automatically  populated by spring when the student-form is filled out
	//using data-binding thru the modelAttribute keyword 
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println("Student Name: " + student.getFirstName() + " " +  student.getLastName());
		
		
		return "student-confirmation";
	}
}
