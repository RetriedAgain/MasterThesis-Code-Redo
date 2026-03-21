package de.masterzoo.groups.animalia.reproduction;

public interface ReproductionStrategy {
	/**
	 * Every animal should be able to reproduce in some way. What if a new animal hops into the zoo? Accounting wants
	 * to consider this.
	 */
	void handleReproduction();
}
