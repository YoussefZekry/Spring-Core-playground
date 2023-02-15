package com.mypackage;

public class ClassAUser implements UserInterface{

	private ProductInterface product;

	public ClassAUser(){
		System.out.println("ClassAUser: inside no-arg constructor");
	}

	public ClassAUser(ProductInterface theProductInterface)
	{
		product = theProductInterface;
	}
	
	public ClassAUser(int x){
		System.out.println("ClassAUser: inside int-arg constructor");
	}

	public ClassAUser(String y){
		System.out.println("ClassAUser: inside String-arg constructor");
	}

	@Override
	public String details() {
		return "ClassAUser details";
	}

	@Override
	public String getProduct1() {
		return "ClassAUser:  " + product.getProduct();
	}
	
}
