package de.masterzoo.groups.animalia.canines;

import de.Gender;
import de.masterzoo.groups.animalia.movement.MovementStrategy;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;
import de.masterzoo.humanresources.Employee;

import java.util.ArrayList;

/**
 * It's a labrador. They are very cute.
 */
public class Labrador extends Canine implements de.masterzoo.groups.animalia.Labrador {
	/**
	 * Judges if this Labrador can actually be trained.
	 */
	final static boolean TRAINABLE = true;

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
	 * @param reproductionStrategy How a Labrador reproduces.
	 */
	public Labrador(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		this(GENDER, name, age, speed, weight, reproductionStrategy, null);
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
	 * If trained, a labrador can even do a trick.
	 */
	public void doTrick() {
		System.out.println("Flips thanks to " + humanCompanion.getName() + "!");
	}

	/**
	 * A natural talent of labradors.
	 */
	@Override
	public void doPuppyEyes() {
		System.out.println("*blink*");
	}

	public Employee getHumanCompanion() {
		return humanCompanion;
	}

	public void setHumanCompanion(Employee humanCompanion) {
		this.humanCompanion = humanCompanion;
	}
}
