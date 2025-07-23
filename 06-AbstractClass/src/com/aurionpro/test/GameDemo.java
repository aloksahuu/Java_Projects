package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Archer;
import com.aurionpro.model.GameCharacter;
import com.aurionpro.model.Warrior;

public class GameDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of rounds of attacks: ");
		int rounds = scanner.nextInt();

		GameCharacter[] game = new GameCharacter[2];
		game[0] = new Warrior("Thor", 100);
		game[1] = new Archer("Robin", 80);

		System.out.println("\nBattle Start!\n");

		for (int i = 1; i <= rounds; i++) {
			System.out.println("Round " + i + ":");
			for (int j = 0; j < game.length; j++) {
				game[j].attack();
			}
			System.out.println();
		}

		System.out.println("Final Power Levels:");
		for (int i = 0; i < game.length; i++) {
			System.out.println(game[i].name + ": " + game[i].powerLevel);
		}
		scanner.close();
	}
}
