package com.example.demo.environment;

public class ProdProfile implements IProfiles{

	@Override
	public String getProfile() {
		return "prodProfile";
	}

}
