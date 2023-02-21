package com.mypackage;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

public class CalcBefore implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("(before)method: " + method.getName() + "\n(before)arguments: " + Arrays.toString(args));
		
	}
	
}
