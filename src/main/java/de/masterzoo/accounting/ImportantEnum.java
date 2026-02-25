package de.masterzoo.accounting;

public enum ImportantEnum {
	PROPERTY_TAX(10_000), INT(10);


	private final int number;

	ImportantEnum(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}


}
