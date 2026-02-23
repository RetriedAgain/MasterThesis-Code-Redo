package de.masterzoo.partnercompanies.shows;

import de.masterzoo.groups.animalia.canines.T;

import java.util.List;

/**
 * The dogshow is one of the highlights of the circus.
 */
public class DogShow {

	List<T> labradors;

	DogShow(List<T> labradors) {
		this.labradors = labradors;
	}

	/**
	 * Every dog gets to perform the trick they know when this method is called.
	 */
	public void performTricks() {
		for (T labrador : labradors) {
			labrador.doTrick();
		}
	}
}
