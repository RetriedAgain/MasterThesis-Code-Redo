package de.masterzoo.groups.animalia.reproduction;

public class Viviparity implements ReproductionStrategy {

	/** For now simply prints out instead of creating a new animal itself. Could be changed later though.
	 *
	 */
	@Override
    public void handleReproduction() {
        System.out.println("Give birth to live young");
    }
}
