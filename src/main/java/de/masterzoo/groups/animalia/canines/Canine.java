package de.masterzoo.groups.animalia.canines;


import de.Gender;
import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.groups.animalia.movement.MovementStrategy;
import de.masterzoo.groups.animalia.movement.Walk;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;

import java.util.ArrayList;

/**
 * Superclass for all sorts of canines. So far only special in that its constructor is more specificied to avoid
 * repetition for other canines.
 */
public abstract class Canine extends Animal {

	/**
	 * All canines have the walk movement and 4 legs.
	 */
	public Canine(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		ArrayList<MovementStrategy> canineMovementStrategies = new ArrayList<>() {{new Walk();}};
		int canineNumberOfLegs = 4;
		super(canineNumberOfLegs, GENDER, name, age, speed, weight, reproductionStrategy, canineMovementStrategies);
	}

}
