package de.masterzoo.groups.animalia.canines;

import de.Gender;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;

public class Poodle extends Canine implements Trainable {


	public Poodle(Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy) {
		super(GENDER, name, age, speed, weight, new ReproductionStrategy() {
			/** For now simply prints out instead of creating a new animal itself. Could be changed later though.
			 *
			 */
			@Override
			public void handleReproduction() {
				System.out.println("Give birth to live young");
			}
		});
	}

	@Override
	public void makeSound() {
		System.out.println("I'm a poodle!");
	}

	@Override
	public void doTrick() {
		System.out.println("*struts*");
	}
}
