package com.mypackage;

import java.util.Arrays;
import java.util.EmptyStackException;

import javax.naming.spi.DirStateFactory.Result;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalcBefore {
	@Before("execution(* *.*(..))")
	public void beforeAny() {
		System.out.println("(BeforeAny)");
	}

	@Before("execution(* com.mypackage..add(..))")
	public void beforeAdd() {
		System.out.println("(BeforeAdd)");
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

	@AfterReturning(pointcut = "execution(* com.mypackage..add(..))",returning = "youssef")
	public void AfterAdd(JoinPoint joinPoint,Object youssef) 
		throws Throwable{
			System.out.println("(AfterReturningAdd) method: "
				+ joinPoint.getSignature().getName()
				+ "\n(AfterReturningAdd) arguments: "
				+ youssef+5000
				);
		}

		@AfterThrowing(throwing = "shady",pointcut = "execution(* com.mypackage..add(..))")
		public void afterThrowingAdd(JoinPoint joinPoint, EmptyStackException shady) 
			throws Throwable{
				System.out.println("(afterThrowingAdd) method: "
					+ joinPoint.getSignature().getName()
					+ "\n(afterThrowingAdd) arguments: "
					+ Arrays.toString(joinPoint.getArgs())
					+ "*****************EmptyStackException.....****************");
		
			}
}
