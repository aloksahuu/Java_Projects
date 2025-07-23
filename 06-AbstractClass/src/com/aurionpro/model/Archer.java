package com.aurionpro.model;

public class Archer extends GameCharacter {

	public Archer(String name, int powerLevel) {
		super(name, powerLevel);
	}

	public void attack() {
		powerLevel = powerLevel - 5;
		System.out.println(name + " the Archer attacks. Power level: " + powerLevel);
	}
}
