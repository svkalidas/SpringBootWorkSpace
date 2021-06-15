package com.example.demo.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
public class EnvironmentConfig {

	@Autowired
	Environment env;
	
	public String getUrl() {
		return env.getProperty("base.url");
	}
	
	@Profile("dev")
	@Bean
	public DevProfile devProfile() {
		return new DevProfile();
	}
	
	@Profile("prod")
	@Bean
	public ProdProfile prodProfiles() {
		return new ProdProfile();
	}
}
