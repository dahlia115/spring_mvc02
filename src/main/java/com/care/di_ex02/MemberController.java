package com.care.di_ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("mm") //빈의 이름을 mm으로 만들겠다.		
public class MemberController {
	@Autowired //해당 빈을 자동으로 저장해준다
	MemberService ms;
	
	@RequestMapping("insert")
	public String insert(Model model) {
		System.out.println(ms);
		try {
			ms.insert(model);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "di/index";
	}
}
