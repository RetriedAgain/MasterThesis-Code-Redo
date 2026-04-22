package wrapreturnvalue;

class NewClass {

	ExistingWrapperClass methodOfReturnValueToBeWrapped() {
		int wrapperField = 1;

		if (wrapperField == 2) {
			return new ExistingWrapperClass(wrapperField);
 		} else {
			return new ExistingWrapperClass(wrapperField * 2);
		}
	}


}
