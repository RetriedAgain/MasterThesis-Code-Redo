package rename.renameparameter;

public class RenameParameter implements AbstractClass {

	@Override
	public void renameParamOfThisMethod(final String secret) {
		System.out.println(secret);
	}

	void usageHere() {
		renameParamOfThisMethod("CONSTANT");
	}

	void usageHere2() {
		renameParamOfThisMethod("CONSTANT");
	}

}
