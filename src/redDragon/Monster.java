package redDragon;

public abstract class Monster extends Creature {

	private int hitDice;
	private int hitPoints;
	private int experiencePoints;

	public Monster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Monster(int hitDice, int hitPoints, int experiencePoints) {
		super();
		this.hitDice = hitDice;
		this.hitPoints = hitPoints;
		this.experiencePoints = experiencePoints;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getHitDice() {
		return hitDice;
	}

	public void setHitDice(int hitDice) {
		this.hitDice = hitDice;
	}

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public void setExperiencePoints(int experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

}
