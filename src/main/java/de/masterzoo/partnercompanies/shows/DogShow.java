package de.masterzoo.partnercompanies.shows;

import de.masterzoo.groups.animalia.canines.Labrador;

import java.util.List;

/**
 * The dogshow is one of the highlights of the circus.
 */
public class DogShow {

	List<Labrador> labradors;

	DogShow(List<Labrador> labradors) {
		this.labradors = labradors;
	}

	/**
	 * Every dog gets to perform the trick they know when this method is called.
	 */
	public void performTricks() {
		for (Labrador labrador : labradors) {
			labrador.doTrick();
		}
	}
}
