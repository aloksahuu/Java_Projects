package com.aurionpro.Candiate.model;

import java.util.Comparator;

public class SortByAge implements Comparator<Candiadate> {

	@Override
	public int compare(Candiadate c1, Candiadate c2) {
		
		return Integer.compare(c1.getAge(), c2.getAge());
	}
	

}
