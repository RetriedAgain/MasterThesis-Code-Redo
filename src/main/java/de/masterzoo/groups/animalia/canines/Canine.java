package de.masterzoo.groups.animalia.canines;


import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.groups.animalia.movement.Walk;

import java.util.ArrayList;

public abstract class Canine extends Animal {

	public Canine(Canine canine) {
		this.movementStrategies = new ArrayList<>() {{new Walk();}};
		this.numOfLegs = 4;
	}

}
