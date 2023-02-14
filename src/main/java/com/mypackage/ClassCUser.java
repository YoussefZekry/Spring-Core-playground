package com.mypackage;

public class ClassCUser implements UserInterface{

	static private ProductInterface product;
	static private ClassCUser classCUser;

	private ClassCUser(){
		System.out.println("ClassCUser: inside no-arg constructor");
	}


	public void setProduct(ProductInterface sProduct) {
		System.out.println("ClassCUser: inside setter method - setProduct");
		product = sProduct;
	}


	static ClassCUser factory(ProductInterface sProduct)
	{
		product = sProduct;
		if (classCUser == null) {
			classCUser = new ClassCUser();
		}
		return classCUser;
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
