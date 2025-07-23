package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.model.Plugin;

public class PluginTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> c = Plugin.class;
		// private constructor
		Constructor<?>[] constructors = c.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
		
		// access private constructor
		Constructor<?> constructor = c.getDeclaredConstructor(double.class);
		constructor.setAccessible(true);
		
		// object of plugin is created as it is private 
		Object pluginObj = constructor.newInstance(0.0);
		
		// set version value to 3.1
		Field field = c.getDeclaredField("version");
		field.setAccessible(true);
		field.set(pluginObj, 3.1);
		System.out.println("Version :"+field.get(pluginObj));
		
		Method method = c.getMethod("execute");
		method.invoke(pluginObj);
	}
}
