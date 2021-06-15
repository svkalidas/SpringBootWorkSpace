package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.environment.DevProfile;
import com.example.demo.environment.EnvironmentConfig;
import com.example.demo.environment.IProfiles;
import com.example.demo.models.Contract;

@RequestMapping("contract")
@RestController
public class ContractCreation {

	@Autowired
	EnvironmentConfig envConfig;
	@Autowired
	IProfiles profile;
	
	@RequestMapping(value = "",method = RequestMethod.GET)
	public Contract createContract() {
		System.out.println(envConfig.getUrl());
		System.out.println(profile.getProfile());
		return new Contract("SG1001210","Kalidas","helth","100000","500");
	}
}
