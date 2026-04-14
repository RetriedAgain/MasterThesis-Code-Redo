package rename.renamemethod;

public class RenameMethod {

	public static void toRename() {
		System.out.println("This should be renamed.");
	}

	public static void usage1() {
		System.out.println("Usage1");
		toRename();
	}

	public static void usage2() {
		toRename();
	}

	public static void usage3() {
		usage1();
		usage2();
	}


}
