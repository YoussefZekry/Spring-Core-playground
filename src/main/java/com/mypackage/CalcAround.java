package com.mypackage;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CalcAround implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("(around)method: " + mi.getMethod().getName()
			+ "\n(around)arguments: " + Arrays.toString(mi.getArguments()));
		Object result = null;
		try{
			result = mi.proceed();
		} catch (IllegalAccessException ex){
			ex.printStackTrace();
			throw ex;
		}
		return result;
	}
	
}
