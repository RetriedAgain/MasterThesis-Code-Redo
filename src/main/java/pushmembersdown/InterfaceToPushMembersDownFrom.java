package pushmembersdown;

public interface InterfaceToPushMembersDownFrom {

	static void interfaceStaticMethodToPushDown() {
		System.out.println("interfaceStaticMethodToPushDown");
	}

	interface InnerInterfaceToPushIntoLowerInterface extends InterfaceToPushMembersDownFrom{
		int INNER_CONSTANT = 6;
		int CONSTANT = 5;

		void innerInterfaceMethodToPushDown();

		static void innerInterfaceStaticMethodToPushDown() {
			System.out.println("innerInterfaceStaticMethodToPushDown");
		}

		void interfaceMethodToPushDown();
	}
}

