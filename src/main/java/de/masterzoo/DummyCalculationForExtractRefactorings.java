package de.masterzoo;

import de.masterzoo.accounting.AccountingNumbers;

import java.util.HashMap;

public class DummyCalculationForExtractRefactorings {

	String prefixString;
	int constantField = AccountingNumbers.CONSTANT_LOCAL_DUMMY_2;

	public DummyCalculationForExtractRefactorings(String prefixString) {
		this.prefixString = prefixString;
	}

	/**
	 * Dummy method for extract/introduce Variable
	 * @return the dummy value i
	 */
	public int dummy() {
		int i = 0;
		int constant = AccountingNumbers.CONSTANT_LOCAL_DUMMY_2;
		while (i < constant) {
			i++;
			i *= constant;
		}
		i += constant;
		return i;
	}

	public int dummy2() {
		int j = 200;
		int constantLocalDummy2 = AccountingNumbers.CONSTANT_LOCAL_DUMMY_2;
		while (j > constantLocalDummy2) {
			j /= constantLocalDummy2;
			j--;
		}
		j %= constantLocalDummy2;
		return j;
	}

	/**
	 * To extract a Functional Variable.
	 * Inspired by URL: <a href="https://www.w3schools.com/java/java_lambda.asp">w3schools</a>
	 */
	public void dummy3() {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		String suffixString = " end of pair.";

		map.forEach((n, m) -> { System.out.println(prefixString + n + m + suffixString); });
	}
}
