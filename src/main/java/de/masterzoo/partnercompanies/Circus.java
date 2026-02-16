package de.masterzoo.partnercompanies;

import java.time.LocalDate;
import java.time.Month;

/**
 * A Circus that can partner up with our zoo to have animals perform under humane conditions through our special
 * partner program.
 */
public class Circus extends Company {
	private final static LocalDate firstDayOfBilling = LocalDate.of(2025, Month.JANUARY, 31);


	int numberOfEmployees;
	int budget;
	int startingBudget;
	int debtLeft;

	public Circus(int numberOfEmployees, int budget) {
		this.numberOfEmployees = numberOfEmployees;
		this.budget = budget;
		this.startingBudget = budget;
	}

	public int payRent() {

		int monthlyRentToPay = 100 * this.numberOfEmployees;
		int monthlyRentPaid = 0;

		if (this.budget >= monthlyRentToPay) {
			this.budget -= monthlyRentToPay;
			monthlyRentPaid = monthlyRentToPay;
		} else {
			monthlyRentPaid = this.budget;
			debtLeft += -1 * (this.budget - monthlyRentToPay);
			this.budget = 0;
			checkBankkruptcy();
		}

		return monthlyRentPaid;
	}

	private void checkBankkruptcy() {
		if (this.debtLeft > this.startingBudget) {
			endCircus();
		}
	}

	private void endCircus() {
		System.out.println("Circus is over!");
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getStartingBudget() {
		return startingBudget;
	}

	public void setStartingBudget(int startingBudget) {
		this.startingBudget = startingBudget;
	}

	public int getDebtLeft() {
		return debtLeft;
	}

	public void setDebtLeft(int debtLeft) {
		this.debtLeft = debtLeft;
	}

}
