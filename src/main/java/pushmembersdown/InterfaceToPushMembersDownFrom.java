package pushmembersdown;

public interface InterfaceToPushMembersDownFrom {
	int CONSTANT = 5;

	void interfaceMethodToPushDown();

	static void interfaceStaticMethodToPushDown() {
		System.out.println("interfaceStaticMethodToPushDown");
	}

	interface InnerInterfaceToPushIntoLowerInterface extends InterfaceToPushMembersDownFrom{

		static void innerInterfaceStaticMethodToPushDown() {
			System.out.println("innerInterfaceStaticMethodToPushDown");
		}

	}
}

