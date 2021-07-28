package com.ms.springboot.web;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(Model m) {
		m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
		System.out.println("热部署测试");
		
//		统一处理错误
//		if (true) {
//			throw new Exception("some exception");
//		}
		
		return "hello";
	}
}
