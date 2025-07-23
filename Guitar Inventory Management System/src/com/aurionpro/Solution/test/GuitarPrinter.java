package com.aurionpro.Solution.test;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import com.aurionpro.Solution.model.Guitar;
import com.aurionpro.Solution.model.GuitarSpec;

public class GuitarPrinter {

	public static void printGuitars(List<Guitar> guitars) {
		if (guitars == null || guitars.isEmpty()) {
			System.out.println("No guitars found.");
			return;
		}

		System.out.printf("%-8s %-10s %-15s %-10s %-10s %-15s %-15s %-10s%n", "Serial", "Builder", "Model", "Type",
				"Strings", "Back Wood", "Top Wood", "Price");
		System.out.println("=".repeat(90));

		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

		for (Guitar g : guitars) {
			GuitarSpec s = g.getSpec();
			System.out.printf("%-8s %-10s %-15s %-10s %-10d %-15s %-15s %-10s%n", g.getSerialNumber(), s.getBuilder(),
					s.getModel(), s.getType(), s.getNumString(), s.getBackWood(), s.getTopWood(),
					nf.format(g.getPrice()));
		}
	}
}
