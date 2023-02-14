package com.mypackage;

public class ProductImpl implements ProductInterface{

	private UserInterface user;

	public ProductImpl(UserInterface user) {
		this.user = user;
	}

	@Override
	public String getProduct() {
		return "your product";
	}
	
}
