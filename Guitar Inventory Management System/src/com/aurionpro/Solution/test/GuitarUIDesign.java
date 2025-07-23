package com.aurionpro.Solution.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.aurionpro.Solution.model.Builder;
import com.aurionpro.Solution.model.Guitar;
import com.aurionpro.Solution.model.GuitarSpec;
import com.aurionpro.Solution.model.Inventory;
import com.aurionpro.Solution.model.Type;
import com.aurionpro.Solution.model.Wood;

public class GuitarUIDesign {

	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("F001", 14999.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 12, Wood.ALDER,
				Wood.ALDER);
		inventory.addGuitar("F002", 13999.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.MAPLE, Wood.ALDER);
		inventory.addGuitar("F003", 13499.95, Builder.FENDER, "Jazzmaster", Type.ELECTRIC, 6, Wood.MAPLE, Wood.CEDAR);
		inventory.addGuitar("G001", 15499.95, Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAPLE);
		inventory.addGuitar("G002", 16999.00, Builder.GIBSON, "Explorer", Type.ELECTRIC, 6, Wood.MAHOGANY,
				Wood.MAHOGANY);
		inventory.addGuitar("M001", 11999.00, Builder.MARTIN, "D-28", Type.ACOUSTIC, 6, Wood.BRAZILIAN_ROSEWOOD,
				Wood.ADIRONDACK);
		inventory.addGuitar("M002", 12499.00, Builder.MARTIN, "LX1", Type.ACOUSTIC, 6, Wood.MAPLE, Wood.CEDAR);
		inventory.addGuitar("C001", 13499.95, Builder.COLLINGS, "C10", Type.ACOUSTIC, 6, Wood.CEDAR, Wood.CEDAR);
		inventory.addGuitar("R001", 17499.00, Builder.RYAN, "Nightingale", Type.ACOUSTIC, 12, Wood.INDIAN_ROSEWOOD,
				Wood.SITKA);
		inventory.addGuitar("P001", 19999.00, Builder.PRS, "Custom 24", Type.ELECTRIC, 6, Wood.MAPLE, Wood.COCOBOLO);
	}

	public static List<Guitar> promptSearchFilters(Scanner scanner, Inventory inventory) {
		Builder builder = InputValidator.getEnumInput(scanner, Builder.values(), "Builder");

		Set<String> models = new TreeSet<>();
		for (Guitar g : inventory.getAllGuitars()) {
			models.add(g.getSpec().getModel());
		}
		String model = InputValidator.getModelInput(scanner, new ArrayList<>(models));

		Type type = InputValidator.getEnumInput(scanner, Type.values(), "Type");
		Integer numStrings = InputValidator.getIntInput(scanner, "Number of Strings (6/10/12) or leave empty: ");
		Wood backWood = InputValidator.getEnumInput(scanner, Wood.values(), "Back Wood");
		Wood topWood = InputValidator.getEnumInput(scanner, Wood.values(), "Top Wood");

		GuitarSpec filter = new GuitarSpec(builder, model, type, numStrings != null ? numStrings : -1, backWood,
				topWood);
		return GuitarSearchService.search(filter, inventory.getAllGuitars());
	}

	public static void displayGuitars(List<Guitar> guitars) {
		GuitarPrinter.printGuitars(guitars);
	}
}
