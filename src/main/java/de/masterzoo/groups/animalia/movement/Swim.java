package de.masterzoo.groups.animalia.movement;

public class Swim implements MovementStrategy {

	private int maxDepth;

	@Override
	public void move() {
		System.out.println("Swimming...");
	}

	public int getMaxDepth() {
		return maxDepth;
	}

	public void setMaxDepth(int maxDepth) {
		this.maxDepth = maxDepth;
	}

}
