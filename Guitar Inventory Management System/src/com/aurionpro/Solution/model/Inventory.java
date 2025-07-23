package com.aurionpro.Solution.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, int numString,
			Wood BackWood, Wood topWood) {
		GuitarSpec spec = new GuitarSpec(builder, model, type, numString, BackWood, topWood);
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serial) {
		for (Guitar guitar : guitars) {
			if (guitar.getSerialNumber().equals(serial)) {
				return guitar;
			}
		}
		return null;
	}

	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();

		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();

			if (guitar.getSpec().matches(searchSpec))

				matchingGuitars.add(guitar);

		}
		return matchingGuitars;
	}
	
	 public List<Guitar> getAllGuitars() {
	        return guitars;
	    }
}
