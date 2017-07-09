package redDragon;

import java.util.Scanner;

public class Menu {

	Scanner input = new Scanner(System.in);
	fireBreather fireBreather = new fireBreather();

	public void menu() {
		System.out.print("Enter the kind of Dragon: ");
		System.out.println("\n\n1. hatchling " + "\n2. Very Young " + "\n3. Young " + "\n4. Juvenile " + "\n5. Young Adult "
				+ "\n6. Adult " + "\n7. Mature Adult " + "\n8. Old " + "\n9. Very Old " + "\n10. Venerable "
				+ "\n11. Wyrm " + "\n12. Great Wyrm");

		String entry = input.next();

		fireBreather.setRedDragonStats(entry);
		System.out.println("Hit Points: " + fireBreather.getHitPoints() + " " +
				"Armor Class: " + fireBreather.getArmorClass());

	}

}
