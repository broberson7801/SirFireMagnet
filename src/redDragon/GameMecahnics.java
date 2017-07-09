package redDragon;

public class GameMecahnics {
	

	public static int dieRoll(int numDice, int numSidesOnDice) {
		int result = (int) (Math.random() * (numDice * numSidesOnDice)) + 1;
		return result;
	}
}
