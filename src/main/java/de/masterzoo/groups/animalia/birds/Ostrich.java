package de.masterzoo.groups.animalia.birds;

import de.masterzoo.groups.animalia.movement.Walk;

import java.util.ArrayList;

class Ostrich extends Bird {

	public Ostrich() {
		super();
		this.setMovementStrategies(new ArrayList<>() {{new Walk();}});
	}

}
