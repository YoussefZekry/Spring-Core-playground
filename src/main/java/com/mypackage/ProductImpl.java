package com.mypackage;

public class ProductImpl implements ProductInterface{

	private UserInterface user;

	public ProductImpl(UserInterface user) {
		this.user = user;
	}
	public ProductImpl() {
		System.out.println("product: inside no-arg constructor");	
	}
	public void init() {
		System.out.println("product: inside init method");
	}
	public void destroy() {
		System.out.println("product: inside destroy method");
	}

	@Override
	public String getProduct() {
		return "your product";
	}
	
}
