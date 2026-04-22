package wrapreturnvalue;

class NewClass {

	NewWrapperClass methodOfReturnValueToBeWrapped() {
		int wrapperField = 1;
		return new NewWrapperClass(wrapperField);
	}


}
