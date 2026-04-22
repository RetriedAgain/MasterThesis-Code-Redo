package wrapreturnvalue;

class NewClass {

	int methodOfReturnValueToBeWrapped() {
		int wrapperField = 1;

		if (wrapperField == 2) {
			return wrapperField;
 		} else {
			return wrapperField * 2;
		}
	}


}
