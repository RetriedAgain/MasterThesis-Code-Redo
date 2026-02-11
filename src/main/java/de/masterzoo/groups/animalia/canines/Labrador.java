package de.masterzoo.groups.animalia.canines;

import de.masterzoo.humanresources.Employee;

/**
 * It's a labrador. They are very cute.
 */
public class Labrador {
	final static boolean TRAINABLE = true;

	Employee humanCompanion;

	public Labrador(Employee humanCompanion) {
		this.humanCompanion = humanCompanion;
	}

	/**
	 * If trained, a labrador can even do a trick.
	 */
	public void doTrick() {
		System.out.println("Flips thanks to " + humanCompanion.getName() + "!");
	}

	public Employee getHumanCompanion() {
		return humanCompanion;
	}

	public void setHumanCompanion(Employee humanCompanion) {
		this.humanCompanion = humanCompanion;
	}
}
