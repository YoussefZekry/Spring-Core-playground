package com.mypackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.mypackage")
public class Config {
	
	@Bean
	public Product product(){
		return new Product();
	}

	@Bean
	public ClassBUser classBUser(){
		return new ClassBUser();
	}

}
