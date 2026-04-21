package de.masterzoo.groups.animalia.birds;

import de.masterzoo.groups.animalia.movement.Swim;
import de.masterzoo.groups.animalia.movement.Walk;

import java.util.ArrayList;

class Penguin extends Bird {

	public Penguin() {
		super();
		this.setMovementStrategies(new ArrayList<>() {{new Walk(); new Swim();}});
	}

}
