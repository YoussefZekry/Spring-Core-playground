package com.mypackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("values.properties")
public class Config {
	
	@Bean(initMethod = "init")
	@Scope("prototype")
	public Product product(){
		return new Product();
	}

	@Bean
	public ClassBUser classBUser(){
		return new ClassBUser(product());
	}

}
