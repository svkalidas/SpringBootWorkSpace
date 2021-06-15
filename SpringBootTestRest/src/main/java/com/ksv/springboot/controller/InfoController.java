package com.ksv.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

	@GetMapping
	public String getHello() {
		return "Hello World!!!";
	}
	
	@GetMapping("/hello")
	public String getUserHello() {
		return "Hello World User!!";
	}
	
	@GetMapping("/hello/admin")
	public String getAdminHello() {
		return "Hello Admin!!!";
	}
}
