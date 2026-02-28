package de.masterzoo.accounting;

import de.masterzoo.Zoo;

import java.time.YearMonth;
import java.util.function.IntSupplier;

public class BudgetDummy {

	public BudgetDummy(String name, YearMonth yearMonth, double moneyAllocated) {
		Zoo zoo = new Zoo();
		zoo.calculateInitialBudgetDistribution(new IntSupplier() {
			public int getAsInt() {
				return 200_000;
			}
		});
	}
}
