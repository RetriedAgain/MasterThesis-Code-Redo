package de.masterzoo.groups.animalia.bovines;

import de.Gender;
import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.groups.animalia.movement.Walk;
import de.masterzoo.groups.animalia.reproduction.Oviparity;

import java.util.ArrayList;

public abstract class Bovine extends Animal {

	public Bovine(int numOfLegs, Gender GENDER, String name, int age, int speed, int weight) {
		super(numOfLegs, GENDER, name, age, speed, weight, new Oviparity(), new ArrayList<>() {{
			new Walk();
		}});
	}
}
