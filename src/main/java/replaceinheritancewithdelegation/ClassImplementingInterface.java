package replaceinheritancewithdelegation;

public class ClassImplementingInterface {

	private final MyInterfaceToImplement interfaceToImplement = new MyInterfaceToImplement();
	int classImplIntField = 55;

	public void run() {
		interfaceToImplement.run();
	}

	private class MyInterfaceToImplement implements InterfaceToImplement {
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
