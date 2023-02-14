package com.mypackage;

public class ClassBUser implements UserInterface{

	private ProductInterface product;

	public ClassBUser(ProductInterface theProductInterface)
	{
		product = theProductInterface;
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
