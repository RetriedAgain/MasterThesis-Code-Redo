package de.masterzoo.groups.animalia;

import de.Gender;
import de.masterzoo.groups.animalia.canines.Canine;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;
import de.masterzoo.humanresources.Employee;

public abstract class D extends Canine {
	/**
	 * Judges if this Labrador can actually be trained.
	 */
	public final static boolean TRAINABLE = true;
	/**
	 * The human companion of the Labrador. This is intended to be the most sociable person for this dog, to which
	 * this dog connects the most.
	 */
	public Employee humanCompanion;

	public D(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy, Employee humanCompanion) {
		super(GENDER, name, age, speed, weight, reproductionStrategy);
		this.humanCompanion = humanCompanion;
	}

	public abstract void doPuppyEyes();
}
