package replaceinheritancewithdelegation;

public class ClassImplementingInterface {

	private final SecretInnerClassName secretField = new SecretInnerClassName();
	int classImplIntField = 55;

	public InterfaceToImplement getSecretField() {
		return secretField;
	}

	public void run() {
		secretField.run();
	}

	public void run2() {
		secretField.run2();
	}

	private class SecretInnerClassName implements InterfaceToImplement {
		@Override
		public void run() {
			System.out.println("Hey there Interface from within ClassImplementingInterface");
		}

		@Override
		public void run2() {
			System.out.println("ClassImplInterface Impl of run2");
		}
	}
}
