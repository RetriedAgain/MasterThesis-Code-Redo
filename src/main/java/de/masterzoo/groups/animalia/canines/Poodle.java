package de.masterzoo.groups.animalia.canines;

public class Poodle extends Canine {

	public Poodle(Canine canine) {
		super(canine);
	}

	@Override
	public void makeSound() {
		System.out.println("I'm a poodle!");
	}
}
