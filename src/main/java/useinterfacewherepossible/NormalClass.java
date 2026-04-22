package useinterfacewherepossible;

class NormalClass extends SuperClass implements NormalInterface {

	@Override
	public void interfaceRun() {
		System.out.println("NormalClass::run");
		System.out.println(INTERFACE_CONSTANT);
	}

	@Override
	public void superInterfaceRun() {
		System.out.println("NormalClass::superInterfaceRun");
		System.out.println(SUPER_INTERFACE_CONSTANT);
	}

	void run2() {
		NormalInterface nc = new NormalClass();
		System.out.println(nc instanceof NormalInterface);
		System.out.println(nc instanceof NormalClass);
		System.out.println(nc instanceof SuperClass);

		SuperClass superClass = new SuperClass();
		System.out.println(superClass instanceof NormalInterface);
		System.out.println(superClass instanceof NormalClass);
		System.out.println(superClass instanceof SuperClass);
		System.out.println("no");
		superClass.superRun();
		System.out.println(superClass.fieldSuperClass);
	}

	void useSuperClassAttribute() {
		System.out.println(fieldSuperClass);
	}

}
