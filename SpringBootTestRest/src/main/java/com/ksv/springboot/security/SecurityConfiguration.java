package com.ksv.springboot.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		//Authentication configuration 
		auth.inMemoryAuthentication()
		.withUser("Alex")
		.password("123")
		.roles("USER")
		.and()
		.withUser("Benny")
		.password("111")
		.roles("ADMIN");
		
		//auth.authenticationProvider(authProvier)
	}
	
	@Bean
	public PasswordEncoder getPassworkEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
	//Authorization configuration 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//For adding customeFilter
		//http.addFilter(null);
		http.authorizeRequests()
		.antMatchers("/info/hello/admin").hasRole("ADMIN")
		.antMatchers("/info/hello").hasAnyRole("ADMIN","USER")
		.antMatchers("/info").permitAll()
		.and()
		.formLogin();
	}
}
