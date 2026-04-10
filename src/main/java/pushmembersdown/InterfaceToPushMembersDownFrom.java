package pushmembersdown;

public interface InterfaceToPushMembersDownFrom {
	int CONSTANT = 5;

	void interfaceMethodToPushDown();

	interface InnerInterfaceToPushIntoLowerInterface extends InterfaceToPushMembersDownFrom{
		int INNER_CONSTANT = 6;

		static void interfaceStaticMethodToPushDown() {
			System.out.println("interfaceStaticMethodToPushDown");
		}

		void innerInterfaceMethodToPushDown();

		static void innerInterfaceStaticMethodToPushDown() {
			System.out.println("innerInterfaceStaticMethodToPushDown");
		}

	}
}

