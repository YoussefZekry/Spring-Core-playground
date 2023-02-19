package com.mypackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.*;

import jakarta.annotation.*;
// @Service
public class ClassBUser implements UserInterface{
// @Autowired
// @Resource
// @Qualifier("myqualifier")
	private List<ProductInterface> product;
	private static String email;
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String sEmail) {
		System.out.println("ClassBUser: inside setter method - setEmail");
		email = sEmail;
	}

	private static String name;
	
	public static String getName() {
		return name;
	}
	public static void setName(String sName) {
		System.out.println("ClassBUser: inside setter method - setName");
		name = sName;
	}
	// @Autowired
	public ClassBUser(List<ProductInterface> product)
	{
		this.product = product;
		System.out.println("ClassBUser: inside injection constructor");
	}
	public ClassBUser(){
		System.out.println("ClassBUser: inside no-arg constructor");
	}
	// @Override
	// @Autowired
	@Resource(name = "product")
	private void setProduct(List<ProductInterface> product) {
		System.out.println("ClassBUser: inside setter method - setProduct");
		this.product = product;
	}
	@Override
	public String details() {
		return "ClassBUser details";
	}

	@Override
	public String getProduct1() {
		// return "ClassBUser:  " + product.getProduct();
		for (int j = 0; j < product.size(); j++) {
			System.out.println("ClassBUser(loop):  " + product.get(j).getProduct()); 
		}
		return "";
	}
	
}