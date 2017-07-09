package redDragon;

import java.util.Random;

public class GameMecahnics {
	

	public static int dieRoll(int numDice, int numSidesOnDice) {
		Random random = new Random();
		int result = random.nextInt((numDice * numSidesOnDice) - numDice) + numDice;
		return result;
	}
}
