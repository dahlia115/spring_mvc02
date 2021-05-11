package com.care.root;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@GetMapping("re/index")
	public String index() {
		return "re/index";
	}
	@RequestMapping("re/result")
	public String result(HttpServletRequest request, Model model,
											RedirectAttributes ra) {
		String id = request.getParameter("id");
		System.out.println(id);
		logger.info("------"+id+"------");
		if(id.equals("abc")) {
			//model.addAttribute("success","로그인 성공!!!");
			ra.addFlashAttribute("success","RedirectAttributes를 통한 전달");
			TestDTO dto = new TestDTO();
			dto.setId("dto를 통한 아이디 저장");
			ra.addFlashAttribute("dto",dto);
			//return "re/rsOK";
			return "redirect:rsOK"; //한번 더 경로를 타면 모델 값이 사라짐
		}
		return "redirect:rsNO"; //redirect 컨트롤러로 연결한다.
	}
	@RequestMapping("re/rsOK")
	public String rsOK() {
		return "re/rsOK";
	}
	@RequestMapping("re/rsNO")
	public String rsNO() {
		return "re/rsNO";
	}
}












