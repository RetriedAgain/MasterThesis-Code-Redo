package de.masterzoo.groups.animalia.movement;

public class Fly implements MovementStrategy {

	private int maxHeight;

	@Override
	public void move() {
		System.out.println("Flying...");
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

}
