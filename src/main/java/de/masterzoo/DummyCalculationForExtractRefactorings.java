package de.masterzoo;

import java.util.HashMap;

public class DummyCalculationForExtractRefactorings {

	String prefixString;
	private int anInt;

	public DummyCalculationForExtractRefactorings(String prefixString) {
		this.prefixString = prefixString;
		anInt = 10;
	}

	/**
	 * Dummy method for extract/introduce Variable
	 * @return the dummy value i
	 */
	public int dummy() {
		int i = 0;
		while (i < anInt) {
			i++;
			i *= anInt;
		}
		i += anInt;
		return i;
	}

	public int dummy2() {
		int j = 200;
		while (j > anInt) {
			j /= anInt;
			j--;
		}
		j %= anInt;
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
