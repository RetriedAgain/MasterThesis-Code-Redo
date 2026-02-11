package de.masterzoo.groups.animalia.felines;

import de.Gender;
import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.groups.animalia.movement.Walk;
import de.masterzoo.groups.animalia.reproduction.Oviparity;

import java.util.ArrayList;

public abstract class Feline extends Animal {

	public Feline(int numOfLegs, Gender GENDER, String name, int age, int speed, int weight) {
		super(numOfLegs, GENDER, name, age, speed, weight, new Oviparity(), new ArrayList<>() {{
			new Walk();
		}});
	}

	public void meow() {
		System.out.println("meow");
	}

}
