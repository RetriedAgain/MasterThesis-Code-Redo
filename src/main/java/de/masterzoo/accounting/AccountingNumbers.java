package de.masterzoo.accounting;

import java.time.LocalDate;
import java.time.Month;

/**
 * This is to be a bigger class integrating all the most important AccountingNumbers and -data. It can be turned into
 * a record at a later time.
 */
class AccountingNumbers {

	private final static LocalDate firstDayOfBilling = LocalDate.of(2025, Month.JANUARY, 31);
	private final static LocalDate firstDayOpening = LocalDate.of(2025, Month.JANUARY, 1);


	private int calcFreeNumOfEmployeeRetirementBudget() {
		return 10_000;
	}

}
