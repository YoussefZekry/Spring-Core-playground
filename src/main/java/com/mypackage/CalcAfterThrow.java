package com.mypackage;

import org.springframework.aop.ThrowsAdvice;

public class CalcAfterThrow implements ThrowsAdvice{
	
	public void afterThrowing(IllegalArgumentException exception)
		throws Throwable{
			System.out.println("Illegal arguments...");
		}
}
