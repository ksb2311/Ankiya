package com.ksb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
	@RequestMapping("/")
	public String index() {
		return "index";
		
	}
	
	@RequestMapping("/merchandise")
	public String merchandise() {
		return "merchandise";
		
	}
}
