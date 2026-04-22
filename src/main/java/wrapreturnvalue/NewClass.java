package wrapreturnvalue;

class NewClass {

	NewWrapperInnerClass methodOfReturnValueToBeWrapped() {
		int wrapperField = 1;

		if (wrapperField == 2) {
			return new NewWrapperInnerClass(wrapperField);
 		} else {
			return new NewWrapperInnerClass(wrapperField * 2);
		}
	}


	public class NewWrapperInnerClass {
		private final int value;

		public NewWrapperInnerClass(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}
}
