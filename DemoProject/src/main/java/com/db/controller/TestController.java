package com.db.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		
		return "Jenkins构建成功";
	}
}
