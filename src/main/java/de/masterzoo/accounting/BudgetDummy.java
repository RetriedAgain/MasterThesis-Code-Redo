package de.masterzoo.accounting;

import de.masterzoo.Zoo;

import java.security.PrivilegedAction;
import java.time.YearMonth;

public class BudgetDummy {

	public BudgetDummy(String name, YearMonth yearMonth, double moneyAllocated) {
		Zoo zoo = new Zoo();
		zoo.calculateInitialBudgetDistribution(new PrivilegedAction<Integer>() {
			public int run() {
				return 200_000;
			}
		});
	}
}
