package de.masterzoo.groups.animalia.canines;

import de.Gender;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;

public class D extends Canine {
	/**
	 * Judges if this Labrador can actually be trained.
	 */
	final static boolean TRAINABLE = true;

	public D(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		super(GENDER, name, age, speed, weight, reproductionStrategy);
	}
}
