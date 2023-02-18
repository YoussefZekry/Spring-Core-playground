package com.mypackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassBUser implements UserInterface{
// @Autowired
	private List<ProductInterface> product;
	
	@Autowired
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
	private void notaSetterMethod(List<ProductInterface> product) {
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
		return "does";
	}
	
}