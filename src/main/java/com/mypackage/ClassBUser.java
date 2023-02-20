package com.mypackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.*;

import jakarta.annotation.*;
@Repository
public class ClassBUser implements UserInterface{
// @Autowired
// @Resource
// @Qualifier("myqualifier")
	private ProductInterface product;
	// @Value("${email}")
	private String email;	
	// @Value("${name}")
	private  String name;


	public  String getEmail() {
		return email;
	}
	@Autowired
	public  void setEmail(@Value("${email}")String email) {
		System.out.println("ClassBUser: inside setter method - setEmail");
		this.email = email;
	}

	
	public  String getName() {
		return name;
	}
	@Autowired
	public  void setName(@Value("${name} ") String name) {
		System.out.println("ClassBUser: inside setter method - setName");
		this.name = name;
	}


	// @Autowired
	public ClassBUser(ProductInterface product)
	{
		this.product = product;
		System.out.println("ClassBUser: inside injection constructor");
	}

	public ClassBUser(){
		System.out.println("ClassBUser: inside no-arg constructor");
	}


	// @Autowired
	@Resource(name = "product")
	private void setProduct(ProductInterface product) {
		System.out.println("ClassBUser: inside setter method - setProduct");
		this.product = product;
	}

	
	@Override
	public String details() {
		return "ClassBUser details";
	}

	@Override
	public String getProduct1() {		
			System.out.println("ClassBUser:  " + product.getProduct()); 
		return "";
	}
	
}