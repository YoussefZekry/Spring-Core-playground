package com.mypackage;

public class ClassAUser implements UserInterface{

	private ProductInterface product;

	public ClassAUser(ProductInterface theProductInterface)
	{
		product = theProductInterface;
	}

	@Override
	public String details() {
		return "ClassAUser details";
	}

	@Override
	public String getProduct() {
		return product.getProduct();
	}
	
}
