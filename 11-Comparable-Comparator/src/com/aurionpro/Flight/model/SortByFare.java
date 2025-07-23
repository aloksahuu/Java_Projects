package com.aurionpro.Flight.model;

import java.util.Comparator;

public class SortByFare implements Comparator<Flight> {

	@Override
	public int compare(Flight f1, Flight f2) {
		
		return Double.compare(f2.getFare(),f1.getFare());
	}
	
}
