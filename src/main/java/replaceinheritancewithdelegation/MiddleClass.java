package replaceinheritancewithdelegation;

public class MiddleClass {
	private final UpperClass secret = new UpperClass();
	public int middleField = 1;
	public final static int MIDDLE_CONSTANT = 0;

	public void useUpperClass() {
		System.out.println(secret.upperField);
	}

	public UpperClass getSecret() {
		return secret;
	}

	public void useUpperAttributes() {
		secret.useUpperAttributes();
	}
}
