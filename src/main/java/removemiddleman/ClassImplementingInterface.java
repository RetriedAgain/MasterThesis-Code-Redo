package removemiddleman;

class ClassImplementingInterface {

	private final MyInterfaceToImplement interfaceToImplement = new MyInterfaceToImplement();
	int classImplIntField = 55;

	public InterfaceToImplement getInterfaceToImplement() {
		return interfaceToImplement;
	}

	public void run() {
		interfaceToImplement.run();
	}

	public void run2() {
		interfaceToImplement.run2();
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
