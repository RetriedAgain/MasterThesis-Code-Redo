package de.masterzoo.groups.animalia.birds;

public class Chicken extends Bird {

	public Chicken() {
		super();
		chickenDefaultHatchText();
		reproductionStrategy.handleReproduction();
	}

	static void chickenDefaultHatchText() {
		System.out.println("Chicken has been created");
		System.out.println("Chicken is by default Male");
		System.out.println("Chicken is by default laying 1 egg per week");
	}

	public static void bockock() {
		System.out.println("bockooock");
	}

	public void cackle() {
		System.out.println("cackle");
	}

}
