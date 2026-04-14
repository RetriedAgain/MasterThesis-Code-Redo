package rename.renamemethod;

public class RenameMethod extends Abstract {

	@Override
	int abstractMethodToRename() {
		return 0;
	}

	public void usage1() {
		System.out.println("Usage1");
		this.abstractMethodToRename();
	}

	public void usage2() {
		this.abstractMethodToRename();
	}

	public void usage3() {
		this.usage1();
		this.usage2();
	}


}
