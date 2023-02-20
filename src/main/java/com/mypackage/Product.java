package com.mypackage;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Repository
public class Product implements ProductInterface{

	private UserInterface user;

	public Product(UserInterface user) {
		this.user = user;
	}
	public Product() {
		System.out.println("product: inside no-arg constructor");	
	}

	// @PostConstruct
	public void init() {
		System.out.println("product: inside init method");
	}

	// @PreDestroy
	public void shutdown() {
		System.out.println("product: inside destroy method");
	}

	@Override
	public String getProduct() {
		return "your product";
	}
	
}
