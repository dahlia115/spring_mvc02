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
	public String result(HttpServletRequest request) {
		String id = request.getParameter("id");
		System.out.println(id);
		logger.info("------"+id+"------");
		if(id.equals("abc")) {
			return "redirect:rsOK";
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












