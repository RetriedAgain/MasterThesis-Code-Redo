package de.masterzoo.groups.animalia.canines;


import de.Gender;
import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.groups.animalia.movement.MovementStrategy;
import de.masterzoo.groups.animalia.movement.Walk;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;

import java.util.ArrayList;

public abstract class Canine extends Animal {

	public Canine(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		ArrayList<MovementStrategy> canineMovementStrategies = new ArrayList<>() {{new Walk();}};
		int canineNumberOfLegs = 4;
		super(canineNumberOfLegs, GENDER, name, age, speed, weight, reproductionStrategy, canineMovementStrategies);
	}

}
