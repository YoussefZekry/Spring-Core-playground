package com.mypackage;

public class MaxMinService implements MaxMinInterface{

	@Override
	public double max(double num1, double num2) {
		double result = (num1 >= num2) ? num1 : num2;
		System.out.println("max = " + result);
		return result;
	}

	@Override
	public double min(double num1, double num2) {
		double result = (num1 >= num2) ? num2 : num1;
		System.out.println("min = " + result);
		return result;
	}
	
}
