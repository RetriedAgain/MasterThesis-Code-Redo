package de.masterzoo.groups.animalia.canines;

import de.Gender;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;
import de.masterzoo.humanresources.Employee;

public class D extends Canine {
	/**
	 * The human companion of the Labrador. This is intended to be the most sociable person for this dog, to which
	 * this dog connects the most.
	 */
	Employee humanCompanion;

	public D(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy, Employee humanCompanion) {
		super(GENDER, name, age, speed, weight, reproductionStrategy);
		this.humanCompanion = humanCompanion;
	}
}
