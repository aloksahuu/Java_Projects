package com.aurionpro.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.model.HiddenOps;

public class HiddenOpsTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		HiddenOps obj = new HiddenOps();
		Class<?> c = obj.getClass();
		Method method = c.getDeclaredMethod("secretCode", String.class);
		method.setAccessible(true);
		
		Object result = method.invoke(obj, "Hello");
		System.out.println("Secret code :"+result);
	}
}
