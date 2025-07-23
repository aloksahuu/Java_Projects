package com.aurionpro.Products.model;

import java.util.Comparator;

public class SortByCategoryAndPrice implements Comparator<Products>{

	@Override
	public int compare(Products p1, Products p2) {
		int CategoryCompare = p1.getCategory().compareToIgnoreCase(p2.getCategory());
		if(CategoryCompare!=0) {
			return CategoryCompare;
		}
		return Double.compare(p1.getPrice(),p2.getPrice());
	}
	

}
