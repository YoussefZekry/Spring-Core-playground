package com.mypackage;

public class CalcService implements CalcInterface{

	@Override
	public double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}

	@Override
	public double sub(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}

	@Override
	public double multi(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}

	@Override
	public double div(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}
	
}
