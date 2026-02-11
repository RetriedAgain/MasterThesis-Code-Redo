package de.masterzoo.groups.animalia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to track various important animal lists of the zoo for record-keeping.
 * Class is made final so no extension could modify these collections in any way.
 *
 */
public final class AnimalBookkeeping {

	// These fields are basically Singletons
	private static List<Animal> allAnimals =  new ArrayList<>();
	private static Map<Animal, Animal> monogamousCouples = new HashMap<>();
	private static Map<Animal, Animal> polyamorousGroups = new HashMap<>();

	public static void equalOutStatsForBookkeeping() {
		new Animal().createTempAnimal();
		new Animal().createTempAnimal();
		new Animal().createTempAnimal();
	}

	public static List<Animal> getAllAnimals() {
		return allAnimals;
	}

	public static Map<Animal, Animal> getMonogamousCouples() {
		return monogamousCouples;
	}

	public static Map<Animal, Animal> getPolyamorousGroups() {
		return polyamorousGroups;
	}

}
