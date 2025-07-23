package com.aurionpro.model;

public class Warrior extends GameCharacter {

	public Warrior(String name, int powerLevel) {
		super(name, powerLevel);
	}

	public void attack() {
		powerLevel = powerLevel - 10;
		System.out.println(name + " the Warrior attacks. Power level: " + powerLevel);
	}
}
