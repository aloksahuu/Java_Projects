package com.aurionpro.model;

public class StringBuilderExample {
public static void main(String[] args) {
	String str1 = "Hello";
	str1.concat("world");
	System.out.println(str1);

	StringBuilder stringBuilder = new StringBuilder("Hello");
	stringBuilder.append("World");
	System.out.println(stringBuilder);
	System.out.println(stringBuilder.reverse());

	stringBuilder.insert(0, 'F');
	System.out.println(stringBuilder);

	stringBuilder.replace(0, 2, "F");
	System.out.println(stringBuilder);
	
	System.out.println(str1.hashCode());

	StringBuilder stringBuilder1 = new StringBuilder("Hello");
	StringBuilder stringBuilder2 = new StringBuilder("Hello");

	System.out.println(stringBuilder1 == stringBuilder2);
	System.out.println(stringBuilder1.equals(stringBuilder2));
}
}