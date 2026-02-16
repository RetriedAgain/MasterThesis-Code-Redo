package de.masterzoo.groups.animalia.birds;

import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.groups.animalia.movement.Fly;
import de.masterzoo.groups.animalia.movement.Walk;
import de.masterzoo.groups.animalia.reproduction.Oviparity;

import java.util.ArrayList;

public abstract class Bird extends Animal {

	int beakLengthCm;

	public Bird() {
		super();

		this.setMovementStrategies(new ArrayList<>() {{new Walk(); new Fly();}});
		this.setReproductionStrategy(new Oviparity());
		Oviparity oviparityStrategy = (Oviparity) getReproductionStrategy();
		oviparityStrategy.eggsPerWeek = 1;
	}

	public void layEgg() {
		System.out.println("Laying egg...");
	}


}
