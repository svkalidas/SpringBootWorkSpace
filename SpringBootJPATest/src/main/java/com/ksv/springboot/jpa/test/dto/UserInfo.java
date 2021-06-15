package com.ksv.springboot.jpa.test.dto;

import org.springframework.hateoas.RepresentationModel;

public class UserInfo extends RepresentationModel<UserInfo>{

	private long userId;
	private String userName;
	private String password;
	
	public UserInfo() {
		
	}
	
	
	public UserInfo(long userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}


	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
