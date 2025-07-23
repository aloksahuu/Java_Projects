package com.aurionpro.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.model.MathUtil;

public class MathUtilTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MathUtil math = new MathUtil();
		
		Class<?> c = math.getClass();
		
		Method method  = c.getMethod("Square", int.class);
		
		Object result = method.invoke(math, 5);
		
		System.out.println("Square of number is :"+result);
		
	}

}
