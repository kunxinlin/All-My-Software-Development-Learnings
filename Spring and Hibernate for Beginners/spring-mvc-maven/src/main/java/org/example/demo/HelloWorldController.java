package org.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//html sends it to the requestmapping name
	@RequestMapping("/processForm")
	public String processFormsMethod() {
		return "helloworld";
	}
	
/*	@RequestMapping("/processFormV2")
	public String letsShout(HttpServletRequest request, Model model) {
		
		//read the request param from html form
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		
		//add our data to the model
		//the first param is the attribute name in html, thats the name we access it with, and the 2nd param is our actual data we want to pass in
		model.addAttribute("message", name);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormV3")
	public String processFormVer3(@RequestParam("studentName") String name, Model model) {
		
		
		name = name.toUpperCase();
		String result = "From Version 3: " + name;
		
		//add our data to the model
		//the first param is the attribute name in html, thats the name we access it with, and the 2nd param is our actual data we want to pass in
		model.addAttribute("message", result);
		
		return "helloworld";
	}*/
	
}
