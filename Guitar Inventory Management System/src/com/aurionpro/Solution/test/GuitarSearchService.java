package com.aurionpro.Solution.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.Solution.model.Guitar;
import com.aurionpro.Solution.model.GuitarSpec;

public class GuitarSearchService {

	public static List<Guitar> search(GuitarSpec filter, List<Guitar> inventoryGuitars) {
		List<Guitar> result = new ArrayList<>();

		for (Guitar guitar : inventoryGuitars) {
			GuitarSpec spec = guitar.getSpec();
			if (filter.getBuilder() != null && filter.getBuilder() != spec.getBuilder())
				continue;
			if (!filter.getModel().isEmpty() && !filter.getModel().equalsIgnoreCase(spec.getModel()))
				continue;
			if (filter.getType() != null && filter.getType() != spec.getType())
				continue;
			if (filter.getNumString() > 0 && filter.getNumString() != spec.getNumString())
				continue;
			if (filter.getBackWood() != null && filter.getBackWood() != spec.getBackWood())
				continue;
			if (filter.getTopWood() != null && filter.getTopWood() != spec.getTopWood())
				continue;

			result.add(guitar);
		}

		return result;
	}
}
