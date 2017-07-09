package redDragon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fireBreather extends RedDragon {

	public fireBreather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String setDragonName() {
		List<String> names = new ArrayList<>();
		names.add("Gold Hoarder");
		names.add("Princess Muncher");
		names.add("Winged Apocalypse");
		names.add("Civilization Destroying Champion");
		names.add("Dave");
		names.add("Snoring Legend");
		
		Collections.shuffle(names);
		String theName = names.remove(0);
		return theName;
		

	}

}
