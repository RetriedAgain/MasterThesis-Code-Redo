package rename.renamefield;

import java.util.Arrays;

class UseFieldOutside {
	private RenameField renameFieldObj = new RenameField();

	void useFieldOutside() {
		System.out.println(renameFieldObj.toRenameField);
		System.out.println(Arrays.toString(renameFieldObj.arrayToRename));
	}
}
