package de.masterzoo.groups.animalia.canines;

import de.Gender;
import de.masterzoo.groups.animalia.movement.MovementStrategy;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;

import java.util.ArrayList;

public class Poodle extends Canine implements Trainable {


	public Poodle(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		super(GENDER, name, age, speed, weight, reproductionStrategy);
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
