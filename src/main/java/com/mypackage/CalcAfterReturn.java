package com.mypackage;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

public class CalcAfterReturn implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
			throws Throwable {
				System.out.println("(afterReturn)method: " + method.getName()
					+ "\n(afterReturn) arguments: " + Arrays.toString(args)
				 	+ "\n(afterReturn)return: " + returnValue+5000);
		
	}
	
}
