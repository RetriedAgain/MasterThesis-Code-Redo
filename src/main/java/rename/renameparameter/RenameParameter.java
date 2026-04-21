package rename.renameparameter;

class RenameParameter implements AbstractClass {

	@Override
	public void renameParamOfThisMethod(String renameThis) {
		System.out.println(renameThis);
	}

	void usageHere() {
		renameParamOfThisMethod("CONSTANT");
	}

	void usageHere2() {
		renameParamOfThisMethod("CONSTANT");
	}

}
