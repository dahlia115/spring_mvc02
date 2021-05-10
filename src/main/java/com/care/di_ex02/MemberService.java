package com.care.di_ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service("ms1")
public class MemberService {
	@Autowired
	MemberDAO dao;
	public MemberService() {
		System.out.println("서비스 생성자 실행");
	}	
	public void insert(Model model) {	
		int result = dao.insert();
		String msg;
		if(result == 0) {
			msg = "저장 되었습니다";
		}else {
			msg = "저장하지 못했습니다";
		}
		model.addAttribute("test",msg);
	}
}
