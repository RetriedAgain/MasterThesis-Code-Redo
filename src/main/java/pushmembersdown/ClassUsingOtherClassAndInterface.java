package pushmembersdown;

import java.util.ArrayList;
import java.util.List;

import static pushmembersdown.LowerInterfaceToPushInterfaceInto.LOWER_INTERFACE_CONSTANT;

public class ClassUsingOtherClassAndInterface implements LowerInterfaceToPushInterfaceInto {
	ClassToPushMembersDownFrom classToPushMembersDownFrom;
	ClassToPushMembersDownFrom.InnerClassToPushMembersDownFrom innerClassToPullMembersUpFrom;
	InnerInterfaceToPushIntoLowerInterface innerInterfaceToPushIntoLowerInterface;
	SubclassToPushMembersInto subclassToPushMembersInto;

	public ClassUsingOtherClassAndInterface(ClassToPushMembersDownFrom classToPushMembersDownFrom,
											ClassToPushMembersDownFrom.InnerClassToPushMembersDownFrom innerClassToPullMembersUpFrom,
											SubclassToPushMembersInto subclassToPushMembersInto) {
		this.classToPushMembersDownFrom = classToPushMembersDownFrom;
		this.innerClassToPullMembersUpFrom = innerClassToPullMembersUpFrom;
		this.subclassToPushMembersInto = subclassToPushMembersInto;
	}

	public void methodUsingOtherClasssesAndInterfaces() {
		// Use subclass of inner class for the following different accesses to:
		// 1. Outer class
		System.out.println(subclassToPushMembersInto.fieldToPushDown);
		subclassToPushMembersInto.methodToPushDown();
		ClassToPushMembersDownFrom.InnerClassToPushMembersDownFrom.staticMethodToPushDown();

		// 2. Inner Class
		System.out.println(subclassToPushMembersInto.innerFieldToPushDown);
		subclassToPushMembersInto.innerMethodToPushDown();
		ClassToPushMembersDownFrom.InnerClassToPushMembersDownFrom.innerStaticMethodToPushDown();

		// 3. Subclass itself
		System.out.println(subclassToPushMembersInto.SUBCLASS_CONSTANT);
		subclassToPushMembersInto.subclassMethod();


		// Use Outer Interface
		interfaceMethodToPushDown();
		System.out.println(CONSTANT);
		InterfaceToPushMembersDownFrom.interfaceStaticMethodToPushDown();

		// Use InnerInterface
		System.out.println(InnerInterfaceToPushIntoLowerInterface.INNER_CONSTANT);
		// innerInterfaceToPushIntoLowerInterface.innerInterfaceMethodToPushDown(); // Breaks code when pushed down
		InnerInterfaceToPushIntoLowerInterface.innerInterfaceStaticMethodToPushDown();

		// Use Implementing Interface of InnerInterface
		lowerInterfaceMethod();
		System.out.println(LOWER_INTERFACE_CONSTANT);

	}

	@Override
	public void interfaceMethodToPushDown() {
		System.out.println("ClassUsingOtherClassAndInterface interfacemethodtopushdown");
	}

	@Override
	public void lowerInterfaceMethod() {
		System.out.println("ClassUsingOtherClassAndInterface lowerinterfacemethod");
	}

	@Override
	public void innerInterfaceMethodToPushDown() {
		System.out.println("ClassUsingOtherClassAndInterface innerinterfacemethodtopushdown");
	}
}
