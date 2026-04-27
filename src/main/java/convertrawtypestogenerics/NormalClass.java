package convertrawtypestogenerics;

class NormalClass<NC> extends SuperClass<Integer> implements NormalInterface<Integer> {

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
		NormalClass<Integer> nc = new NormalClass<Integer>();
		nc = (NormalClass<Integer>) nc;

		// Wildcard ready
		NormalClass<? extends Object> nc2 = new NormalClass<>();
		nc2 = nc2;
		System.out.println(nc instanceof NormalInterface);
		System.out.println(nc instanceof NormalClass);
		System.out.println(nc instanceof SuperClass);

		SuperClass<Integer> superClass = new SuperClass<Integer>();
		// Obsolete cast
		superClass = (SuperClass<Integer>) superClass;
		System.out.println(superClass instanceof NormalInterface);
		System.out.println(superClass instanceof NormalClass);
		System.out.println(superClass instanceof SuperClass);
		System.out.println("no");
		superClass.superRun();
		System.out.println(superClass.fieldSuperClass);


		// Code that produces errors when executing with wildcard dialog option
//		List ncList = new ArrayList();
//		ncList.add(nc);
//		System.out.println(ncList);

		// Raw array (does not get changed no matter if preserve raw array selected or not)
		NormalClass[] ncArray = new NormalClass[5];
		ncArray[0] = nc;
		ncArray[1] = nc;
		ncArray[2] = nc;
		ncArray[3] = nc;
		ncArray[4] = nc;

		System.out.println(ncArray);

		// Object-parameterized types
		NormalClass<Object> ncObject = new NormalClass<Object>();
		ncObject = (NormalClass<Object>) ncObject;

		// Object-parameterized types
		Object ncObject2 = new NormalClass<Object>();
		ncObject2 = (NormalClass<Object>) ncObject2;

	}

	void useSuperClassAttribute() {
		System.out.println(fieldSuperClass);
	}

}
