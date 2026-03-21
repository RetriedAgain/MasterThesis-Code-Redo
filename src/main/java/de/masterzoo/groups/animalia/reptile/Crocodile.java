package de.masterzoo.groups.animalia.reptile;

import de.Gender;

public class Crocodile extends Reptile {

	public Crocodile(int numOfLegs, Gender GENDER, String name, int age, int speed, int weight) {
		super(numOfLegs, GENDER, name, age, speed, weight);
	}

	public Crocodile() {
		super();
	}

	@Override
	void snapForce() {
		System.out.println("3,700 pounds per square inch!");
	}
}
