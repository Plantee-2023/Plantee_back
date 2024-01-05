package com.plantee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.MysqlMapper";

	@ResponseBody
	@RequestMapping("/home")
	public String home() {
		return "hello world!";
	}
	
}

