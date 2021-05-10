package com.care.di_ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class MemberController {
	MemberService ms;
	public MemberController() {
		System.out.println("MemberController 실행");
	}
	@RequestMapping("insert")
	public String insert(Model model) {
		model.addAttribute("test","연습중");
		ms = new MemberService();
		ms.insert(model);
		return "di/index";
	}
}
