package com.ksb.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
		
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	public String saveUser() {
		return "user saved";
	}
}
