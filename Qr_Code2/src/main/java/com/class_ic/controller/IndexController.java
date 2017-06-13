package com.class_ic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	//주석추가 10:35
	@RequestMapping("/index.htm")
	public String index(){
		System.out.println("들어와들어와");
		//Tiles 이전
		return "Index";
	}
	@RequestMapping("/index2.htm")
	public String index2() {
		System.out.println("들어와들어와");
		// Tiles 이전
		return "Index2";

	}
}
