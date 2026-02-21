package de.masterzoo;

import java.util.HashMap;

public class DummyCalculationForExtractRefactorings {

	String prefixString;
	private int anInt;
	private int anInt = 10;

	public DummyCalculationForExtractRefactorings(String prefixString) {
		this.prefixString = prefixString;
	}

	/**
	 * Dummy method for extract/introduce Variable
	 * @return the dummy value i
	 */
	public int dummy() {
		int i = 0;
		while (i < this.anInt) {
			i++;
			i *= this.anInt;
		}
		i += this.anInt;
		return i;
	}

	public int dummy2() {
		int j = 200;
		while (j > this.anInt) {
			j /= this.anInt;
			j--;
		}
		j %= this.anInt;
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
