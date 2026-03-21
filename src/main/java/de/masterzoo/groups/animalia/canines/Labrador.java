package de.masterzoo.groups.animalia.canines;

import de.Gender;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;
import de.masterzoo.groups.animalia.reproduction.Viviparity;
import de.masterzoo.humanresources.Employee;

/**
 * It's a labrador. They are very cute.
 */
public class Labrador extends Canine implements Trainable {
	/**
	 * The human companion of the Labrador. This is intended to be the most sociable person for this dog, to which
	 * this dog connects the most.
	 */
	Employee humanCompanion;

	/**
	 * Chained constructor for when there is no human companion.
	 * @param GENDER Gender of the Labrador
	 * @param name Name of the Labrador
	 * @param age Age of the Labrador
	 * @param speed Max. speed of the Labrador.
	 * @param weight Weight of the Labrador.
	 */
	public Labrador(Gender GENDER, String name, int age, int speed, int weight) {
		this(GENDER, name, age, speed, weight, new Viviparity());
	}

	/**
	 * Chained constructor for when there is no human companion.
	 * @param GENDER Gender of the Labrador
	 * @param name Name of the Labrador
	 * @param age Age of the Labrador
	 * @param speed Max. speed of the Labrador.
	 * @param weight Weight of the Labrador.
	 * @param reproductionStrategy How a Labrador reproduces.
	 */
	public Labrador(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		super(GENDER, name, age, speed, weight, reproductionStrategy);
		this.humanCompanion = null;
	}

	/**
	 * Constructor for Labrador. Differs from canine in that a human companion can be selected.
	 * @param GENDER Gender of the Labrador
	 * @param name Name of the Labrador
	 * @param age Age of the Labrador
	 * @param speed Max. speed of the Labrador.
	 * @param weight Weight of the Labrador.
	 * @param reproductionStrategy How a Labrador reproduces.
	 * @param humanCompanion Human Companion of the Labrador
	 */
	public Labrador(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy, Employee humanCompanion) {
		super(GENDER, name, age, speed, weight, reproductionStrategy);
		this.humanCompanion = humanCompanion;
	}

	/**
	 * A natural talent of labradors.
	 */
	public void doPuppyEyes() {
		System.out.println("*blink*");
	}

	public Employee getHumanCompanion() {
		return humanCompanion;
	}

	public void setHumanCompanion(Employee humanCompanion) {
		this.humanCompanion = humanCompanion;
	}

	@Override
	public void doTrick() {
		if (trained) {
			System.out.println("*flips*");
		}
	}
}
