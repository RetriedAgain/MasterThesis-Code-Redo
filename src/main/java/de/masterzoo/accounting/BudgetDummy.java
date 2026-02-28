package de.masterzoo.accounting;

import de.masterzoo.Zoo;

import java.time.YearMonth;

public class BudgetDummy {

	public BudgetDummy(String name, YearMonth yearMonth, double moneyAllocated) {
		Zoo zoo = new Zoo();
		zoo.calculateInitialBudgetDistribution(() -> 200_000);
	}
}
