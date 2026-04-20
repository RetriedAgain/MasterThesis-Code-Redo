package replaceinheritancewithdelegation;

public class MiddleClass {
	private final UpperClass upperClass = new UpperClass();
	public int middleField = 1;
	public final static int MIDDLE_CONSTANT = 0;

	public void useUpperClass() {
		System.out.println(upperClass.upperField);
	}

	public void useUpperAttributes() {
		upperClass.useUpperAttributes();
	}
}
