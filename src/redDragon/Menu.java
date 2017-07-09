package redDragon;

import java.util.Scanner;

public class Menu {

	Scanner input = new Scanner(System.in);
	fireBreather fireBreather = new fireBreather();

	public void menu() {

		System.out.println("Enter the number for the kind of Dragon: ");
		System.out.println("(Enter anything other than a valid menu number to quit)");
		System.out.println("\n1. Hatchling " + "\n2. Very Young " + "\n3. Young " + "\n4. Juvenile "
				+ "\n5. Young Adult " + "\n6. Adult " + "\n7. Mature Adult " + "\n8. Old " + "\n9. Very Old "
				+ "\n10. Venerable " + "\n11. Wyrm " + "\n12. Great Wyrm");

		String entry = input.next();
		while (entry.matches("^([1-9]|1[012])$")) {
			fireBreather.setName(fireBreather.setDragonName());

			fireBreather.setRedDragonStats(entry);
			System.out.println("Name: " + fireBreather.getName() + ", Hit Points: " + fireBreather.getHitPoints() + ", "
					+ "Armor Class: " + fireBreather.getArmorClass());

			System.out.println("See another dragon (Y/N)? ");
			String choice = input.next();

			if (choice.equalsIgnoreCase("Y")) {
				menu();
			} else {
				System.out.println("Thanks for checking out a dragon");
				System.exit(1);
			}

		}
		System.out.println("Thanks for checking out the program");
		System.exit(1);

	}

}
