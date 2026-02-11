package de.masterzoo.groups.animalia.reproduction;

public class Oviparity implements ReproductionStrategy {

	public int eggsPerWeek;

	@Override
    public void handleReproduction() {
		System.out.println("");
	}

	public int getEggsPerWeek() {
		return eggsPerWeek;
	}

	public void setEggsPerWeek(int eggsPerWeek) {
		this.eggsPerWeek = eggsPerWeek;
	}
}
