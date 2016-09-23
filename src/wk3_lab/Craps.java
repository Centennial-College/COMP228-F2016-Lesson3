package wk3_lab;

import java.security.SecureRandom;

public class Craps {

	// only accessible within this class as a static object
	// Random number generator object
	private static final SecureRandom randomNumbers = new SecureRandom();

	// Represents the game status
	private enum Status {
		CONTINUE, WON, LOST
	}

	// Represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int ELEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myPoint = 0;
		Status gameStatus;

		int sumOfDice = rollDice();

		switch (sumOfDice) {
		// win condition
		case SEVEN:
		case ELEVEN:
			gameStatus = Status.WON;
			System.out.printf("Congratulations, you won! You rolled a %d%n", sumOfDice);
			break;

		// lose condition
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			System.out.printf("Game over, you lose! You rolled a %d%n", sumOfDice);
			break;

		// point - roll same # twice to get point
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}

		// Roll again
		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			if (sumOfDice == myPoint)
				gameStatus = Status.WON;
			else if (sumOfDice == SEVEN)
				gameStatus = Status.LOST;
		}

		// Display win or lose message
		if (gameStatus == Status.WON)
			System.out.println("PLAYER WINS!");
		else
			System.out.println("PLAYER LOSES!");

	}

	/**
	 * This method returns the sum of two rolled die
	 * 
	 * @return {int}
	 */
	public static int rollDice() {
		// int die1 = 1 + randomNumbers.nextInt(6);
		// int die2 = 1 + randomNumbers.nextInt(6);

		int die1 = getRandom(6);
		int die2 = getRandom(6);

		int sum = die1 + die2;

		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

	/**
	 * This method generates a random number between 1 and ceiling, exclusive.
	 * 
	 * @param ceiling
	 * @return {int}
	 */
	public static int getRandom(int ceiling) {
		return 1 + randomNumbers.nextInt(ceiling);
	}

}
