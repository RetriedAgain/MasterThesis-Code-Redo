package de.masterzoo;

public class DummyCalculationForExtractRefactorings {

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
}
