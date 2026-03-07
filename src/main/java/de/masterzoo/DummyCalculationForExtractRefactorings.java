package de.masterzoo;

import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Random;

public class DummyCalculationForExtractRefactorings {

	String prefixString;

	public DummyCalculationForExtractRefactorings(String prefixString, Integer someValue, String[] args, int f, double anotherValue,
												  int[] someArray,
												  int ... specialValues) {
		// Can be extracted to chained constructor
		this.prefixString = prefixString;
	}

	/**
	 * Dummy method for extract/introduce Variable
	 * @return the dummy value i
	 */
	public int dummy() {
		int i = 0;
		while (i < 10) {
			i++;
			i *= 10;
		}
		i += 10;
		return i;
	}

	public int dummy2() {
		int j = 200;
		while (j > 10) {
			j /= 10;
			j--;
		}
		j %= 10;
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

	/**
	 * First test with some values like an array to figure out how to check all cases for this refactoring type.
	 * @param someValue
	 * @param anotherValue
	 * @param someArray
	 * @return
	 */
	public double extractMethodDummy1(@Nullable Integer someValue, String[] args, int f, double anotherValue,
									  int[] someArray,
									  int ... specialValues) {

		// This works great to extract already. Only other things needed: Chain constructors and fold param. thing
		for (int t : someArray) {
			someValue += t;
		}

		// Test to check folding according to documentation: https://www.jetbrains.com/help/idea/2025.3/extract-method-dialog.html?refactoring.extractInterface&keymap=macOS&utm_source=product&utm_medium=link&utm_campaign=IU&utm_content=2025.3
		int i = 5;
		int[] a = new int[i];

		// Another test like above, but with parameter from method as array-size
		int[] b = new int[f];



		// A few tests to try and get folding to work
		int[] values = {1, 2, 3, 4};
		int[] toBeFolded = new int[values.length];
		for (int value : values) {
			someValue += value;
		}

		// Inspired by URL regarding bug report around folding parameters when extracting method: https://youtrack.jetbrains.com/issue/IDEA-156818/Extract-method-on-array-swap-incorrect-with-fold-parameters
		// Still doesn't work though to fold parameters
		Random random = new Random();
		int size = 20;
		for (int l = 0; l < size; l++) {
			int x = random.nextInt(size);
			// start snip
			int tmp = values[l];
			values[l] = values[x];
			values[x] = tmp;
			// end snip
		}

		return someValue + anotherValue;
	}

	public double extractMethodDummy2(int someValue, double anotherValue, int[] someArray) {
		// Copy of to-be-extracted code from extractMethodDummy1 for IJ to try and recognize duplicate
		for (int t : someArray) {
			someValue += t;
		}

		return someValue + anotherValue;
	}

	/**
	 * Dummy for extractMethodObject
	 * @param i
	 * @param j
	 * @return
	 */
	public int extractMethodObject(int i, int j) {
		while (i < 10) {
			i++;
			i *= 10;
		}
		i += 10;

		// Extract start
		if (i > 10 && j < 50) {
			return 10;
		} else {
			return 1;
		}
		// Extract end
	}

	// Extract up here with caret on method-name
	public int extractParameterObject(int i, int j) {
		while (i < 10) {
			i++;
			i *= 10;
		}
		i += 10;

		if (secret.getI() > 10 && secret.j() < 50) {
			return 10;
		} else {
			return 1;
		}
	}

	public int useExtractParameterObject() {
		int i = 50;
		i += extractParameterObject(5, 3);
		return i;
	}



}
