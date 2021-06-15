package com.ksv.springboot.jpa.test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksv.springboot.jpa.test.dto.UserInfo;
import com.ksv.springboot.jpa.test.entity.User;
import com.ksv.springboot.jpa.test.repository.UserDaoUtil;

@Service
public class BoUserService {

	@Autowired
	UserDaoUtil repository;

	public List<UserInfo> getAllUserinfo() {
		List<User> findAll = repository.findAll();
		return findAll.stream().map(u -> new UserInfo(u.getId(), u.getUserName(), u.getPassword()))
				.collect(Collectors.toList());
	}
	
	public UserInfo saveUser(UserInfo userInfo) {
		User user = new User();
		user.setUserName(userInfo.getUserName());
		user.setPassword(userInfo.getPassword());
		user = repository.save(user);
		userInfo.setUserId(user.getId());
		return userInfo;
	}
	
	public UserInfo patchUser(UserInfo userInfo, Long userId) {
		User user = repository.getById(userId);
		user.setUserName(userInfo.getUserName() != null ? userInfo.getUserName() : user.getUserName());
		user.setPassword(userInfo.getPassword() != null ? userInfo.getPassword():user.getPassword());
		user = repository.save(user);
		
		userInfo.setUserId(user.getId());
		userInfo.setUserName(user.getUserName());
		userInfo.setPassword(user.getPassword());
		return userInfo;
	}
}
