package redDragon;

public abstract class Creature {
	private String name;
	private int THAC0;
	private int armorClass;
	private int savingThrow;
	private int level;

	public Creature() {
		super();
	}

	public Creature(String name, int tHAC0, int armorClass, int savingThrow, int level) {
		super();
		this.name = name;
		THAC0 = tHAC0;
		this.armorClass = armorClass;
		this.savingThrow = savingThrow;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTHAC0() {
		return THAC0;
	}

	public void setTHAC0(int tHAC0) {
		THAC0 = tHAC0;
	}

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	public int getSavingThrow() {
		return savingThrow;
	}

	public void setSavingThrow(int savingThrow) {
		this.savingThrow = savingThrow;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}