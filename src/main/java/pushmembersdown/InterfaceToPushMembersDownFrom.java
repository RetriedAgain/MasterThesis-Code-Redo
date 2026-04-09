package pushmembersdown;

public interface InterfaceToPushMembersDownFrom {
	int CONSTANT = 5;

	void interfaceMethodToPushDown();

	static void interfaceStaticMethodToPushDown() {
		System.out.println("interfaceStaticMethodToPushDown");
	}

	interface InnerInterfaceToPushIntoLowerInterface extends InterfaceToPushMembersDownFrom{
		int INNER_CONSTANT = 6;

		void innerInterfaceMethodToPushDown();

		static void innerInterfaceStaticMethodToPushDown() {
			System.out.println("innerInterfaceStaticMethodToPushDown");
		}

	}
}

