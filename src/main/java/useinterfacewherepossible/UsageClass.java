package useinterfacewherepossible;

class UsageClass {
	private NormalClass nc;
	private SuperClass sc;
	private NormalInterface ni;
	private SuperInterface si;

	UsageClass() {
		// Use NormalClass
		nc = new NormalClass();
		nc.interfaceRun();
		nc.run2();
		nc.useSuperClassAttribute();
		nc.defaultMethodUseSuperInterface();

		// Use Superclass
		System.out.println(sc.fieldSuperClass);
		sc.superRun();

		// Use NormalInterface
		ni = nc;
		ni.interfaceRun();
		System.out.println(NormalInterface.INTERFACE_CONSTANT);
		System.out.println(NormalInterface.INTERFACE_CONSTANT);
		ni.defaultMethodUseSuperInterface();

		// Use SuperInterface
		si = nc;
		si.superInterfaceRun();
		System.out.println(SuperInterface.SUPER_INTERFACE_CONSTANT);
	}

	void run2Duplicate() {
		SuperClass nc = new NormalClass();
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

	void useNormalInterface(NormalInterface ni) {
		ni.superInterfaceRun(); // only uses SuperInterface API
	}

}
