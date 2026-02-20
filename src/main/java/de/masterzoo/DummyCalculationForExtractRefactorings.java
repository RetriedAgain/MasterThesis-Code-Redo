package de.masterzoo;

public class DummyCalculationForExtractRefactorings {

	/**
	 * Dummy method for extract/introduce Variable
	 * @return the dummy value i
	 */
	public int dummy() {
		int i = 0;
		int importantConstant = 10;
		while (i < importantConstant) {
			i++;
			i *= 10;
		}
		i += 10;
		return i;
	}
}
