package com.care.di_ex02;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	public MemberDAO() {
		System.out.println("dao 생성자 실행");
	}
	
	public int insert() {
		//디비에 관련된 내용을 처리한다
		return 1; 
	}
}
