package Com.aurionpro.model;

import java.util.Scanner;

public class TicTacToeFacade {
	private Player player1;
	private Player player2;
	private Board board;
	private GameEngine engine;

	public void startGame() {
		Scanner scanner = new Scanner(System.in);

//        System.out.println();
		System.out.println("    ╔════════════════════════════════════════╗");
		System.out.println("    ║        WELCOME TO TIC TAC TOE          ║");
		System.out.println("    ╚════════════════════════════════════════╝");

		System.out.println();
		System.out.println("    ┌───────┬───────┬───────┐");
		System.out.println("    │  TIC  │   X   │   O   │");
		System.out.println("    ├───────┼───────┼───────┤");
		System.out.println("    │   X   │  TAC  │   X   │");
		System.out.println("    ├───────┼───────┼───────┤");
		System.out.println("    │   O   │   X   │  TOE  │");
		System.out.println("    └───────┴───────┴───────┘");
		System.out.println();

		while (true) {
			System.out.print("\nDo you want to play? (yes/no): ");
			String choice = scanner.nextLine().trim().toLowerCase();

			if (choice.equals("no")) {
				System.out.println("Thank you for playing. Goodbye!");
				break;
			} else if (choice.equals("yes")) {
				startNewGame(scanner);
			} else {
				System.out.println("Invalid choice. Please type 'yes' or 'no'.");
			}
		}

		scanner.close();
	}

	private void startNewGame(Scanner scanner) {
		System.out.print("Player 1, enter your name: ");
		String name1 = scanner.nextLine();
		player1 = new Player(name1, Symbol.X);

		System.out.print("Player 2, enter your name: ");
		String name2 = scanner.nextLine();
		player2 = new Player(name2, Symbol.O);

		board = new Board();
		engine = new GameEngine(player1);

		GameStatus status = GameStatus.IN_PROGRESS;

		while (status == GameStatus.IN_PROGRESS) {
			board.displayBoard();
			Player current = engine.getCurrPlayer();
			System.out
					.println(current.getName() + "'s (" + current.getSymbol() + ") turn. Enter row and column (0-2):");

			int row, col;
			while (true) {
				try {
					row = scanner.nextInt();
					col = scanner.nextInt();
					scanner.nextLine(); // consume newline
					if (row < 0 || row > 2 || col < 0 || col > 2) {
						System.out.println("Invalid input. Try again.");
					} else if (!board.isCellEmpty(row, col)) {
						System.out.println("Cell is already occupied. Try again.");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("Invalid input. Enter numbers only.");
					scanner.nextLine(); // clear invalid input
				}
			}

			board.placeSymbol(row, col, current.getSymbol());

			if (engine.isWinningMove(board, current.getSymbol())) {
				board.displayBoard();
				System.out.println("\nResult: " + current.getName() + " wins! Congratulations!");
				status = GameStatus.WIN;
			} else if (board.isfull()) {
				board.displayBoard();
				System.out.println("\nResult: It's a draw!");
				status = GameStatus.DRAW;
			} else {
				engine.switchPlayer(player1, player2);
			}
		}

		System.out.println("\nDo you want to play again? (yes/no): ");
		String again = scanner.nextLine().trim().toLowerCase();
		if (again.equals("yes")) {
			startNewGame(scanner); // Restart without exiting to main menu
		}
	}
}
