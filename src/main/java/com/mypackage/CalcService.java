package com.mypackage;

import java.util.EmptyStackException;

public class CalcService{

	public double add(double num1, double num2) {
		double result = num1 + num2;
		throw new EmptyStackException();
	}

	public double sub(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}

	public double multi(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}

	public double div(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}
	
}
