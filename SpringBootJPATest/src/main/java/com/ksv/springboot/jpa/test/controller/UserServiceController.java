package com.ksv.springboot.jpa.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksv.springboot.jpa.test.dto.UserInfo;
import com.ksv.springboot.jpa.test.service.BoUserService;

@RestController
@RequestMapping("/userapi")
public class UserServiceController {
	
	@Autowired
	BoUserService userService;

	@GetMapping
	public String getUserservice() {
		return "Welcome to user service";
	}
	
	
	@GetMapping("/users")
	public List<UserInfo> getAllUsers(){
		return userService.getAllUserinfo();
	}
	
	@PostMapping("/user")
	public UserInfo postUser(@RequestBody UserInfo userinfo) {
		return userService.saveUser(userinfo);
	}
	
	@PatchMapping("/user/{userId}")
	public UserInfo patchUser(@RequestBody UserInfo userInfo, @PathVariable("userId") Long userId) {
		return userService.patchUser(userInfo, userId);
	}
	
	
}
