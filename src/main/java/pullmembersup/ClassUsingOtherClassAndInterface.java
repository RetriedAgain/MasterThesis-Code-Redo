package pullmembersup;

public class ClassUsingOtherClassAndInterface implements InterfaceToPullMembersUpFrom {
	ClassToPullMembersUpFrom classToPullMembersUpFrom;
	ClassToPullMembersUpFrom.InnerClassToPullMembersUpFrom innerClassToPullMembersUpFrom;
	InnerInterfaceToPullIntoSuperInterface innerInterfaceToPullIntoSuperInterface;
	SuperclassToPullMembersInto superclassToPullMembersInto;

	public ClassUsingOtherClassAndInterface(ClassToPullMembersUpFrom classToPullMembersUpFrom,
											ClassToPullMembersUpFrom.InnerClassToPullMembersUpFrom innerClassToPullMembersUpFrom,
											SuperclassToPullMembersInto superclassToPullMembersInto) {
		this.classToPullMembersUpFrom = classToPullMembersUpFrom;
		this.innerClassToPullMembersUpFrom = innerClassToPullMembersUpFrom;
		this.superclassToPullMembersInto = superclassToPullMembersInto;
	}

	public void methodUsingOtherClasssesAndInterfaces() {
		// Use outer class
		System.out.println(classToPullMembersUpFrom.fieldToPullUp);
		classToPullMembersUpFrom.methodToPullUp();
		ClassToPullMembersUpFrom.staticMethodToPullUp();

		// Use inner class
		System.out.println(innerClassToPullMembersUpFrom.innerFieldToPullUp);
		innerClassToPullMembersUpFrom.innerMethodToPullUp();
		ClassToPullMembersUpFrom.InnerClassToPullMembersUpFrom.innerStaticMethodToPullUp();


		// Use Superclass
		System.out.println(SuperclassToPullMembersInto.SUPERCLASS_CONSTANT);
		superclassToPullMembersInto.superclassMethod();

		// Use InterfaceToPullIntoSuperInterface
		interfaceMethodToPullUp();
		System.out.println(CONSTANT);

		// Use InnerInterface
		System.out.println(SuperInterfaceToPullInterfaceInto.InnerInterfaceToPullIntoSuperInterface.INNER_CONSTANT);
		innerInterfaceToPullIntoSuperInterface.innerInterfaceMethodToPullUp();

		// Use SuperInterfaceToPullInterfaceInto
		superInterfaceMethod();
		System.out.println(SUPER_INTERFACE_CONSTANT);
	}

	@Override
	public void interfaceMethodToPullUp() {
		System.out.println("ClassUsingOtherClassAndInterface methodToPullUp");
	}

	@Override
	public void superInterfaceMethod() {
		System.out.println("ClassUsingOtherClassAndInterface superInterfaceMethod");
	}
}
