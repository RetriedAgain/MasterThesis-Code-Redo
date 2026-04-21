package replaceinheritancewithdelegation;

class UsageClass implements InterfaceToImplement {
	private LowerClass lowerClass = new LowerClass();
	private MiddleClass middleClass = new MiddleClass();
	private UpperClass upperClass = new UpperClass();
	private InterfaceToImplement interfaceToImplement = new ClassImplementingInterface();
	private ClassImplementingInterface classImplementingInterface = new ClassImplementingInterface();

	public void use() {
		// Lower Class
		System.out.println(lowerClass.lowerField);
		System.out.println(LowerClass.LOWER_CONSTANT);
		lowerClass.useUpperAttributes();

		System.out.println(lowerClass.middleField);
		System.out.println(lowerClass.upperField);
		System.out.println(LowerClass.MIDDLE_CONSTANT);
//		System.out.println(LowerClass.UPPER_CONSTANT); // Breaks

		// Middle class
		System.out.println(middleClass.middleField);
		System.out.println(MiddleClass.MIDDLE_CONSTANT);
		middleClass.useUpperAttributes();

		// These will break
		System.out.println(middleClass.upperField);
//		System.out.println(MiddleClass.UPPER_CONSTANT); // Breaks

		// Upper Class
		System.out.println(upperClass.upperField);
		System.out.println(UpperClass.UPPER_CONSTANT);
		upperClass.useUpperAttributes();

		// Interface
		run(); // Uses this class' implementation
		run2();

		// Class implementing Interface
		interfaceToImplement.run();
		classImplementingInterface.run();
		System.out.println(classImplementingInterface.classImplIntField);

	}


	@Override
	public void run() {
		System.out.println("Hey there, interface within Usage Class");
	}

	@Override
	public void run2() {
		System.out.println("Additional method of interface");
	}
}
