package redDragon;

public abstract class Player extends Creature {

	private int strength;
	private int dexterity;
	private int constituion;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private String race;
	private String alignment;

	public Player() {
		super();
	}

	public Player(int strength, int dexterity, int constituion, int intelligence, int wisdom, int charisma, String race,
			String alignment) {
		super();
		this.strength = strength;
		this.dexterity = dexterity;
		this.constituion = constituion;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.race = race;
		this.alignment = alignment;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstituion() {
		return constituion;
	}

	public void setConstituion(int constituion) {
		this.constituion = constituion;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

}
