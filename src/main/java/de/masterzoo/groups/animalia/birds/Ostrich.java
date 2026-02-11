package de.masterzoo.groups.animalia.birds;

import de.masterzoo.groups.animalia.movement.Walk;

import java.util.ArrayList;

public class Ostrich extends Bird {

	public Ostrich() {
		super();
		this.movementStrategies = new ArrayList<>() {{new Walk();}};
	}

}
