package rename.renamemethod;

public class RenameMethod extends Abstract {

	@Override
	int secret() {
		return 0;
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
