package wrapreturnvalue;

class ExistingWrapperClass {
	int wrapperField;

	ExistingWrapperClass(int value) {
		this.wrapperField = value;
	}

	public int getWrapperField() {
		return wrapperField;
	}
}
