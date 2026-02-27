package de.masterzoo.accounting;

import de.masterzoo.Zoo;

import java.time.YearMonth;

public class BudgetDummy {

	Zoo zoo;

	public BudgetDummy(String name, YearMonth yearMonth, double moneyAllocated) {
		this.zoo = new Zoo();
		zoo.calculateInitialBudgetDistribution();
	}



}
