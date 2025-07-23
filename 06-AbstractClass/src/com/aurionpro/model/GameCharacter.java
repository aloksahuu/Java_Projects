package com.aurionpro.model;

public abstract class GameCharacter {
	public String name;
	public int powerLevel;

	public GameCharacter(String name, int powerLevel) {
		this.name = name;
		this.powerLevel = powerLevel;
	}

	public abstract void attack();
}
