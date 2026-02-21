package de.masterzoo;

import java.util.HashMap;

public class DummyCalculationForExtractRefactorings {

	public static final int INT = 10;
	String prefixString;

	public DummyCalculationForExtractRefactorings(String prefixString) {
		this.prefixString = prefixString;
	}

	/**
	 * Dummy method for extract/introduce Variable
	 * @return the dummy value i
	 */
	public int dummy() {
		int i = 0;
		while (i < INT) {
			i++;
			i *= INT;
		}
		i += INT;
		return i;
	}

	public int dummy2() {
		int j = 200;
		while (j > INT) {
			j /= INT;
			j--;
		}
		j %= INT;
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
