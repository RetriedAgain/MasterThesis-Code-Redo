package de.masterzoo.groups.animalia.canines;

import de.Gender;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;

public class Poodle extends Canine {


	/**
	 * Judges if this animal is trained.
	 */
	public static final boolean trained = true;

	public Poodle(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		super(GENDER, name, age, speed, weight, reproductionStrategy);
	}

	@Override
	public void makeSound() {
		System.out.println("I'm a poodle!");
	}

	public void doTrick() {
		System.out.println("*struts*");
	}
}
