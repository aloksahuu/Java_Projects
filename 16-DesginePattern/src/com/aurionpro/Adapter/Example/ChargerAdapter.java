package com.aurionpro.Adapter.Example;

public class ChargerAdapter implements ITypeCCharger {

	private OldCharger oldcharger;

	public ChargerAdapter(OldCharger oldcharger) {
		this.oldcharger = oldcharger;
	}

	@Override
	public void chargeWithTypeC() {
		System.out.println("Adapter converting type-C to Micro-USB ");
		oldcharger.ChargeWithMicroUSB();

	}

}
