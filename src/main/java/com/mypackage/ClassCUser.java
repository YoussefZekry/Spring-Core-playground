package com.mypackage;

public class ClassCUser implements UserInterface{

	private ProductInterface product;

	public ClassCUser(){
		System.out.println("ClassCUser: inside no-arg constructor");
	}


	public void setProduct(ProductInterface product) {
		System.out.println("ClassCUser: inside setter method - setProduct");
		this.product = product;
	}

	@Override
	public String details() {
		return "ClassCUser details";
	}

	@Override
	public String getProduct() {
		return "ClassCUser:  " + product.getProduct();
	}




	
}
