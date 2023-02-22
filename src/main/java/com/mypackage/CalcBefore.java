package com.mypackage;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalcBefore {
	
	@Before("execution(* com.mypackage..add(..))")
	public void beforeAdd() {
		System.out.println("BeforeAdd");
	}
	@Before("execution(* com.mypackage..multi(..))")
	public void beforeMulti(JoinPoint joinPoint) 
	throws Throwable{
		System.out.println("(BeforeMulti) method: "
			+ joinPoint.getSignature().getName()
			+ "\n(BeforeMulti) arguments: "
			+ Arrays.toString(joinPoint.getArgs())
			);
	}
}
