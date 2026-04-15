package rename.renameparameter;

public class RenameParameter implements AbstractClass {

	@Override
	public void renameParamOfThisMethod(final String renameThis) {
		System.out.println(renameThis);
	}

	void usageHere() {
		renameParamOfThisMethod("CONSTANT");
	}

	void usageHere2() {
		renameParamOfThisMethod("CONSTANT");
	}

}
