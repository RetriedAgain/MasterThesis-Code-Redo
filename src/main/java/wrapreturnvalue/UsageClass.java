package wrapreturnvalue;

class UsageClass {
	UsageClass() {
		NewClass nc = new NewClass();

		int returnValue = nc.methodOfReturnValueToBeWrapped().getWrapperField();
	}
}
