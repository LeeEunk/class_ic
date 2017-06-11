package com.class_ic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MainController {
	
	@RequestMapping("/createCode.htm")
    public ModelAndView createCode(@RequestParam String content){
		//ModelAndView 바로 리턴 
		System.out.println("찍히고 있니??");
		System.out.println("찍힘");
		return new ModelAndView("qrcodeview", "content", content);
	}
}

