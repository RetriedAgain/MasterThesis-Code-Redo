package rename.renamemethod;

public class RenameMethod {
	public void toRename() {
		System.out.println("This should be renamed.");
	}

	public void usage1() {
		System.out.println("Usage1");
		this.toRename();
	}

	public void usage2() {
		this.toRename();
	}

	public void usage3() {
		this.usage1();
		this.usage2();
	}


}
