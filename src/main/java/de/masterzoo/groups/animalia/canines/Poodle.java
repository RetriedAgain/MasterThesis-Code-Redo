package de.masterzoo.groups.animalia.canines;

import de.Gender;
import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.groups.animalia.movement.MovementStrategy;
import de.masterzoo.groups.animalia.movement.Walk;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;

import java.util.ArrayList;

public class Poodle extends Animal implements Trainable {


	public Poodle(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		ArrayList<MovementStrategy> canineMovementStrategies = new ArrayList<>() {{new Walk();}};
		int canineNumberOfLegs = 4;
		super(canineNumberOfLegs, GENDER, name, age, speed, weight, reproductionStrategy, canineMovementStrategies);
	}

	@Override
	public void makeSound() {
		System.out.println("I'm a poodle!");
	}

	@Override
	public void doTrick() {
		System.out.println("*struts*");
	}
}
