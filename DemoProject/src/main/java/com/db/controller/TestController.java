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
	public String hello(@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss") Date date,String str) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		return "hello"+sf.format(date)+"==="+str;
	}
}