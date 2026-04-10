package pushmembersdown;

public interface InterfaceToPushMembersDownFrom {
	int CONSTANT = 5;

	void interfaceMethodToPushDown();

	static void interfaceStaticMethodToPushDown() {
		System.out.println("interfaceStaticMethodToPushDown");
	}

}

