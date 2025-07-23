package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		
		Student student = new Student();
		Class<?> c = Student.class;
//		System.out.println("Class name : " + c.getName());
//		System.out.println("----------------------------------");
//		System.out.println("Feilds are :");
//		Field[] feilds = c.getDeclaredFields();
//		for (Field results : feilds) {
//			System.out.println(results.getName());
//		}
//		System.out.println("-----------------------------------");
//		System.out.println("Methods are :");
//		Method[] methods = c.getDeclaredMethods();
//		for (Method results : methods) {
//			System.out.println(results.getName());
//			System.out.println("Type : " + results.getReturnType());
//			System.out.println("Modifier : " + Modifier.toString(results.getModifiers()));
//		}
//
//		System.out.println("----------------------------");
//		System.out.println("Constuctors are :");
//		Constructor[] construct = c.getConstructors();
//		for (Constructor reuslts : construct) {
//			System.out.println(reuslts.getName());
//		}
		
		
//		Field fields = c.getDeclaredField("cgpa");
//		fields.setAccessible(true);
//		System.out.println("Cgpa is :"+ fields.get(student));
		
//		Method methods = c.getDeclaredMethod("greet");
//		methods.setAccessible(true);
//		methods.invoke(student);
		
		
		Field fields = c.getDeclaredField("num");
		fields.setAccessible(true);
		fields.set(student, 6);
		System.out.println("The number cahnged to :"+ fields.get(student));
	}
}
