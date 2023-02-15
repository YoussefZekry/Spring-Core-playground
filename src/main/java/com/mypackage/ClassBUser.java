package com.mypackage;

import java.util.List;

public class ClassBUser implements UserInterface{

	private List<ProductInterface> product;
	

	public ClassBUser(List<ProductInterface> product)
	{
		this.product = product;
		System.out.println("ClassBUser: inside injection constructor");
	}

	public ClassBUser(){
		System.out.println("ClassBUser: inside no-arg constructor");
	}
	// @Override
	public void setProduct(List<ProductInterface> product) {
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
			System.out.println("ClassBUser:  " + product.get(j).getProduct()); 
		}
		return "does";
	}
	
}
