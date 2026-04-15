package rename.renameparameter;

public class UsageOutsideClass {

	void usageHere3() {
		RenameParameter rP = new RenameParameter();

		rP.renameParamOfThisMethod("CONSTANT");
	}
}
