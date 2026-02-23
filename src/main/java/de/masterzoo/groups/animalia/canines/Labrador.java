package de.masterzoo.groups.animalia.canines;

import de.Gender;
import de.masterzoo.groups.animalia.movement.MovementStrategy;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;
import de.masterzoo.humanresources.Employee;

import java.util.ArrayList;

/**
 * It's a labrador. They are very cute.
 */
public class Labrador implements T {

	/**
	 * If trained, a labrador can even do a trick.
	 */
	@Override
	public void doTrick() {
		System.out.println("Flips!");
	}

}
