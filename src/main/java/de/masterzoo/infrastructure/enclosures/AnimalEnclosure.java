package de.masterzoo.infrastructure.enclosures;

import de.masterzoo.infrastructure.ColorTheme;
import de.masterzoo.infrastructure.props.Prop;
import de.masterzoo.groups.animalia.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * An AnimalEnclosure is the whole area counted in which a specific type of animal lives.
 */
public abstract class AnimalEnclosure {
	List<Prop> propsInEnclosure = new ArrayList<>();
	List<Animal> suitedForWhichAnimals = new ArrayList<>();
	List<Animal> animalsInEnclosure = new ArrayList<>();
	ColorTheme colorTheme;
	int entertainmentValue;
	int costPerMonth;

	public int calculateEntertainmentValue() {
		entertainmentValue = 0;
		for (Animal animal : animalsInEnclosure) {
			entertainmentValue += 100;
		}
		return entertainmentValue;
	}

	public int calculateCostPerMonth() {
		costPerMonth = 0;
		for (Animal animal : animalsInEnclosure) {
			costPerMonth += animal.getCostPerMonth();
		}
		return costPerMonth;
	}


}
