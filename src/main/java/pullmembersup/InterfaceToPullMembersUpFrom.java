package pullmembersup;

public interface InterfaceToPullMembersUpFrom extends SuperInterfaceToPullInterfaceInto {
	int CONSTANT = 5;

	void interfaceMethodToPullUp();

	interface InnerInterfaceToPullIntoSuperInterface {
		int INNER_CONSTANT = 6;

		void innerInterfaceMethodToPullUp();
	}
}

