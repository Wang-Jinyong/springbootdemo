package com.example.springboottest.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 金勇
 * 2019年5月8日 下午8:05:32
 */
@RestController
public class HelloWorldController {
	
	@Value("${wjy.msg}")
	private String msg;
	
	@RequestMapping("/hello")
	public String index() {
//		return "王金勇Hello World!";
		return msg;
	}
	
}
