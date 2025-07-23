package com.aurionpro.Adapter.Example;

public class Main {
	public static void main(String[] args) {
		OldCharger oldCharger = new OldCharger();
// Wrap old charger inside adapter
		ITypeCCharger adapter = new ChargerAdapter(oldCharger);
// Phone expects TypeC charger, and adapter makes it possible
		adapter.chargeWithTypeC();
	}
}
