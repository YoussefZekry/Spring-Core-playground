package com.mypackage;

public class ClassBUser implements UserInterface{

	private ProductInterface product;

	public ClassBUser(ProductInterface theProductInterface)
	{
		product = theProductInterface;
	}

	public ClassBUser(){
		System.out.println("ClassBUser: inside no-arg constructor");
	}
	
	public ClassBUser(int x){
		System.out.println("ClassBUser: inside int-arg constructor");
	}

	public ClassBUser(String y){
		System.out.println("ClassBUser: inside String-arg constructor");
	}

	public void setProduct(ProductInterface product) {
		System.out.println("ClassBUser: inside setter method - setProduct");
		this.product = product;
	}
	@Override
	public String details() {
		return "ClassBUser details";
	}

	@Override
	public String getProduct() {
		return "ClassBUser:  " + product.getProduct();
	}
	
}
