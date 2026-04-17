package rename.renametypedeclaration;

public class UsageOutside extends RenameClass implements RenameInterface {
	public void usage() {
		// Use Enum
		RenameEnum renameEnum = RenameEnum.RENAME1;
		System.out.println(renameEnum);
		System.out.println(RenameEnum.RENAME1);
		System.out.println(RenameEnum.RENAME2);

		// Use Record
		RenameRecord renameRecord = new RenameRecord();
		System.out.println(renameRecord);
		System.out.println(new RenameRecord.num1(5));

		// Use Class
		RenameClass renameClass = new RenameClass();
		System.out.println(renameClass.field1);
		System.out.println(field1);

		// Use interface
		run();
		// This is to have a variable with the name of the to-be-renamed interface
		RenameInterface renameInterface = new RenameInterface() {
			@Override
			public void run() {
				System.out.println("Running inside");
			}
		};
		System.out.println(renameInterface);
		System.out.println(RenameInterface.INTERFACE_CONSTANT);
	}

	@Override
	public void run() {
		System.out.println("Running");
	}
}
