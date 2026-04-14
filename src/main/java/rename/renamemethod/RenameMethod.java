package rename.renamemethod;

public class RenameMethod {
	public void secret() {
		System.out.println("This should be renamed.");
	}

	public void usage1() {
		System.out.println("Usage1");
		this.secret();
	}

	public void usage2() {
		this.secret();
	}

	public void usage3() {
		this.usage1();
		this.usage2();
	}


}
