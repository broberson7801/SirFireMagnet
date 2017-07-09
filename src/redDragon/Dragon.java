package redDragon;

public abstract class Dragon extends Monster {

	public Dragon() {
		super();
	}

	private int clawAttack;
	private int biteAttack;
	private int kickAttack;
	private int tailSlapAttack;
	private int breathWeapon;
	private int plummet;
	
	public Dragon(int clawAttack, int biteAttack, int kickAttack, int tailSlapAttack, int breathWeapon, int plummet) {
		super();
		this.clawAttack = clawAttack;
		this.biteAttack = biteAttack;
		this.kickAttack = kickAttack;
		this.tailSlapAttack = tailSlapAttack;
		this.breathWeapon = breathWeapon;
		this.plummet = plummet;
	}

	public int getClawAttack() {
		return clawAttack;
	}

	public void setClawAttack(int clawAttack) {
		this.clawAttack = clawAttack;
	}

	public int getBiteAttack() {
		return biteAttack;
	}

	public void setBiteAttack(int biteAttack) {
		this.biteAttack = biteAttack;
	}

	public int getKickAttack() {
		return kickAttack;
	}

	public void setKickAttack(int kickAttack) {
		this.kickAttack = kickAttack;
	}

	public int getTailSlapAttack() {
		return tailSlapAttack;
	}

	public void setTailSlapAttack(int tailSlapAttack) {
		this.tailSlapAttack = tailSlapAttack;
	}

	public int getBreathWeapon() {
		return breathWeapon;
	}

	public void setBreathWeapon(int breathWeapon) {
		this.breathWeapon = breathWeapon;
	}

	public int getPlummet() {
		return plummet;
	}

	public void setPlummet(int plummet) {
		this.plummet = plummet;
	}
	
	
	

}
