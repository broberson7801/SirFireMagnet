package redDragon;

public abstract class Paladin extends Player {

	public int layOnHands(int level) {
		int result = level * 2;
		return result;
	}

}
