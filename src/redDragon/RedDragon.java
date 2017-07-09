package redDragon;

public abstract class RedDragon extends Dragon {

	public RedDragon() {
		super();

	}

	public RedDragon(int clawAttack, int biteAttack, int kickAttack, int tailSlapAttack, int breathWeapon,
			int plummet) {
		super(clawAttack, biteAttack, kickAttack, tailSlapAttack, breathWeapon, plummet);
		// TODO Auto-generated constructor stub
	}

	public void setRedDragonStats(String entry) {
		if (entry.equalsIgnoreCase("1")) {
			super.setArmorClass(0);
			super.setHitDice(9);
			super.setTHAC0(9);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(2, 10) + 1);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 1);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 1);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 1);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 1);
		}
		if (entry.equalsIgnoreCase("2")) {
			super.setArmorClass(-1);
			super.setHitDice(11);
			super.setTHAC0(8);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(4, 10) + 2);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 2);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 2);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 2);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 2);
		}
		if (entry.equalsIgnoreCase("3")) {
			super.setArmorClass(-2);
			super.setHitDice(13);
			super.setTHAC0(7);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(6, 10) + 3);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 3);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 3);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 3);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 3);
		}
		if (entry.equalsIgnoreCase("4")) {
			super.setArmorClass(-3);
			super.setHitDice(15);
			super.setTHAC0(6);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(8, 10) + 4);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 4);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 4);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 4);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 4);
		}
		if (entry.equals("5")) {
			super.setArmorClass(-4);
			super.setHitDice(16);
			super.setTHAC0(5);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(10, 10) + 5);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 5);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 5);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 5);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 5);
		}
		if (entry.equalsIgnoreCase("6")) {
			super.setArmorClass(-5);
			super.setHitDice(17);
			super.setTHAC0(4);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(12, 10) + 6);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 6);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 6);
			super.setTailSlapAttack(getClawAttack() * 2);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 6);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 6);
		}
		if (entry.equalsIgnoreCase("7")) {
			super.setArmorClass(-6);
			super.setHitDice(18);
			super.setTHAC0(3);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(14, 10) + 7);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 7);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 7);
			super.setTailSlapAttack(getClawAttack() * 2);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 7);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 7);
		}
		if (entry.equalsIgnoreCase("8")) {
			super.setArmorClass(-7);
			super.setHitDice(19);
			super.setTHAC0(2);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(16, 10) + 8);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 8);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 8);
			super.setTailSlapAttack(getClawAttack() * 2);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 8);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 8);
		}
		if (entry.equalsIgnoreCase("9")) {
			super.setArmorClass(-8);
			super.setHitDice(20);
			super.setTHAC0(1);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(18, 10) + 9);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 9);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 9);
			super.setTailSlapAttack(getClawAttack() * 2);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 9);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 9);
		}
		if (entry.equalsIgnoreCase("10")) {
			super.setArmorClass(-9);
			super.setHitDice(21);
			super.setTHAC0(0);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(20, 10) + 10);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 10);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 10);
			super.setTailSlapAttack(getClawAttack() * 2);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 10);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 10);
		}
		if (entry.equalsIgnoreCase("11")) {
			super.setArmorClass(-10);
			super.setHitDice(22);
			super.setTHAC0(-1);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(22, 10) + 11);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 11);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 11);
			super.setTailSlapAttack(getClawAttack() * 2);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 11);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 11);
		}
		if (entry.equalsIgnoreCase("12")) {
			super.setArmorClass(-11);
			super.setHitDice(23);
			super.setTHAC0(-2);
			super.setHitPoints(GameMecahnics.dieRoll(getHitDice(), 8));
			super.setBreathWeapon(GameMecahnics.dieRoll(24, 10) + 12);
			super.setClawAttack(GameMecahnics.dieRoll(1, 10) + 12);
			super.setKickAttack(GameMecahnics.dieRoll(1, 10) + 12);
			super.setTailSlapAttack(getClawAttack() * 2);
			super.setBiteAttack(GameMecahnics.dieRoll(3, 10) + 12);
			super.setPlummet(GameMecahnics.dieRoll(3, 10) + 12);
		}
	}

}
