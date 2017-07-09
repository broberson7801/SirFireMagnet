package redDragon;

public enum DragonAge {
	HATCHLING(1), VERYYOUNG(2), YOUNG(3), JUVENILE(4), YOUNGADULT(5), ADULT(6), MATUREADULT(7), OLD(8), VERYOLD(
			9), VENERABLE(10), WYRM(11), GREATWYRM(12);

	private final Integer value;

	private DragonAge(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
