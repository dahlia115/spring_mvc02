package com.care.di_ex02;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("mm") //빈의 이름을 mm으로   만들겠다.		
public class MemberController {
	//@Autowired  //해당 빈을 자동으로 저장해준다
	@Inject //@Autowired와 같음
	@Qualifier("ser") //같은 빈이 여러개라면 직접적으로 이름을 넣어서 사용한다
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
