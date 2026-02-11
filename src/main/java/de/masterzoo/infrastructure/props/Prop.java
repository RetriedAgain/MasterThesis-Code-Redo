package de.masterzoo.infrastructure.props;

import de.masterzoo.infrastructure.ColorTheme;
import de.masterzoo.groups.animalia.Animal;

import java.util.List;

/**
 * Props are basically objects to either entertain the animals or to suit the environment and theme of the whole zoo.
 */
public abstract class Prop {
	int approximateValue;
	List<Animal> suitableForWhichAnimals;
	ColorTheme colorTheme;
}
