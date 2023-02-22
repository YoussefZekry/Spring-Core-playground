package com.mypackage;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalcBefore {
	
	@Before("execution(* com.mypackage..add(..))")
	public void before() {
		System.out.println("lalalalalalalalala");
	}
}
