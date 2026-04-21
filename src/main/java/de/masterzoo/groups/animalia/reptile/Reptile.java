package de.masterzoo.groups.animalia.reptile;

import de.Gender;
import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.groups.animalia.movement.Walk;
import de.masterzoo.groups.animalia.reproduction.Oviparity;

import java.util.ArrayList;

abstract class Reptile extends Animal {
	public Reptile(int numOfLegs, Gender GENDER, String name, int age, int speed, int weight) {
		super(numOfLegs, GENDER, name, age, speed, weight, new Oviparity(), new ArrayList<>() {{
			new Walk();
		}});
	}
}
