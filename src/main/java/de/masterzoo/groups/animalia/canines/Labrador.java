package de.masterzoo.groups.animalia.canines;

import de.Gender;
import de.masterzoo.groups.animalia.movement.MovementStrategy;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;
import de.masterzoo.humanresources.Employee;

import java.util.ArrayList;

/**
 * It's a labrador. They are very cute.
 */
public class Labrador extends Canine {
	final static boolean TRAINABLE = true;

	Employee humanCompanion;

	public Labrador(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		this(GENDER, name, age, speed, weight, reproductionStrategy, null);
	}

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

	public Employee getHumanCompanion() {
		return humanCompanion;
	}

	public void setHumanCompanion(Employee humanCompanion) {
		this.humanCompanion = humanCompanion;
	}
}
