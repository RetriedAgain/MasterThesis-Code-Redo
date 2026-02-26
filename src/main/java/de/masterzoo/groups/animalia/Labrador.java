package de.masterzoo.groups.animalia;

import de.Gender;
import de.masterzoo.groups.animalia.canines.Canine;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;

public class Labrador extends Canine {
	public Labrador(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		super(GENDER, name, age, speed, weight, reproductionStrategy);
	}

	/**
	 * A natural talent of labradors.
	 */
	public void doPuppyEyes() {
		System.out.println("*blink*");
	}
}
