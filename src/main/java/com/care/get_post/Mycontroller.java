package com.care.get_post;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	
	@RequestMapping(value = "my/index", method = RequestMethod.GET)
	public String index() {
		return "get_post/index";
	}
	@RequestMapping(value = "my/result", method = RequestMethod.POST)
	public String result(Model model,HttpServletRequest req) {
		model.addAttribute("mothod",req.getMethod());
		model.addAttribute("name",req.getParameter("name")+"님");
		model.addAttribute("age",req.getParameter("age")+"살");
		return "get_post/result";
	}
	@GetMapping("my/result")
	public String result(Model model,HttpServletRequest req,
							@RequestParam String name,
							@RequestParam ("age") String a){
		model.addAttribute("mothod",req.getMethod());
		model.addAttribute("name",name+"님");
		model.addAttribute("age",a+"살");	
		return "get_post/result";
	}
}
