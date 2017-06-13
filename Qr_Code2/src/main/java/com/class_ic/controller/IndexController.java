package com.class_ic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index.htm")
	public String index(){
		System.out.println("들어와들어와");
		//Tiles 이전
		return "Index";
	}
	@RequestMapping("/index2.htm")
	public String index2() {
		System.out.println("들어와들어와");
		//수정했습니다 2017.06.13 (현정)
		System.out.println("수정해봤다 -hyun");

		// Tiles 이전
		return "Index2";

	}
}
