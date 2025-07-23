package com.aurionpro.model;

public class HiddenOps {
	private String secretCode(String input) {
		return new StringBuilder(input).reverse().toString();
	}
}
