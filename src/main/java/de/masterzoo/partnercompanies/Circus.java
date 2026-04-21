package de.masterzoo.partnercompanies;

import java.time.LocalDate;
import java.time.Month;

/**
 * A Circus that can partner up with our zoo to have animals perform under humane conditions through our special
 * partner program.
 */
public class Circus extends Company {
	private final static LocalDate firstDayOfBilling = LocalDate.of(2025, Month.JANUARY, 31);


	private int numberOfEmployees;
	private double budget;
	private double startingBudget;
	private double debtLeft;

	public Circus(int numberOfEmployees, double budget) {
		this.numberOfEmployees = numberOfEmployees;
		this.budget = budget;
		this.startingBudget = budget;
	}

	public double payRent() {

		double monthlyRentToPay = 100 * this.numberOfEmployees;
		double monthlyRentPaid = 0;

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

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getStartingBudget() {
		return startingBudget;
	}

	public void setStartingBudget(double startingBudget) {
		this.startingBudget = startingBudget;
	}

	public double getDebtLeft() {
		return debtLeft;
	}

	public void setDebtLeft(double debtLeft) {
		this.debtLeft = debtLeft;
	}

}
