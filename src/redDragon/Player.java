package redDragon;

public abstract class Player extends Creature {

	private int strength;
	private int dexterity;
	private int constituion;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int age;
	private int damage;
	private int numAttacks;

	public Player() {
		super();
	}

	public Player(int strength, int dexterity, int constituion, int intelligence, int wisdom, int charisma, int age,
			int damage, int numAttacks) {
		super();
		this.strength = strength;
		this.dexterity = dexterity;
		this.constituion = constituion;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.age = age;
		this.damage = damage;
		this.numAttacks = numAttacks;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getNumAttacks() {
		return numAttacks;
	}

	public void setNumAttacks(int numAttacks) {
		this.numAttacks = numAttacks;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}