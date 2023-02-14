package com.mypackage;

public class UserImpl2 implements UserInterface{

	private ProductInterface product;

	public UserImpl2(ProductInterface theProductInterface)
	{
		product = theProductInterface;
	}
	
	@Override
	public String details(String name, String address) {
		return name+" 2  "+address;
	}

	@Override
	public String getProduct() {
		return "hello from the UserImpl2:  " + product.getProduct();
	}
	
}
