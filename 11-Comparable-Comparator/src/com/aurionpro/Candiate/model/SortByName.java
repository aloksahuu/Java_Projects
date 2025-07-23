package com.aurionpro.Candiate.model;

import java.util.Comparator;

public class SortByName implements Comparator<Candiadate> {

	@Override
	public int compare(Candiadate c1, Candiadate c2) {
		
		return c1.getName().compareTo(c2.getName());
	}
	

}
