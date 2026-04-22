package wrapreturnvalue;

class NewClass {

	NewWrapper methodOfReturnValueToBeWrapped() {
		int wrapperField = 1;

		if (wrapperField == 2) {
			return new NewWrapper(wrapperField);
 		} else {
			return new NewWrapper(wrapperField * 2);
		}
	}


}
