package com.mypackage;

public class UserImpl1 implements UserInterface{

	private ProductInterface product;

	public UserImpl1(ProductInterface theProductInterface)
	{
		product = theProductInterface;
	}

	@Override
	public String details(String name, String address) {
		return name+" "+address;
	}

	@Override
	public String getProduct() {
		return product.getProduct();
	}
	
}
