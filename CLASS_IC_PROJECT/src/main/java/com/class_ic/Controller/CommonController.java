package com.class_ic.Controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



/**
 * EmpController 
 * 
 */
@Controller
public class CommonController {

	@Autowired
	private SqlSession sqlsession;
	
		//teacher
	@RequestMapping("teacher/main.htm")
	public String teacer(){
		System.out.println("teacher 컨트롤 탐");
		return "teacher.main";
	}
	
	//student
	@RequestMapping("student/main.htm")
	public String student(){
		System.out.println("student 컨트롤 탐");
		return "student.main";
	}

}
