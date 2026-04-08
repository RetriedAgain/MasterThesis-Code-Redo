package pullmembersup;

public interface SuperInterfaceToPullInterfaceInto {
	int SUPER_INTERFACE_CONSTANT = 0;

	void superInterfaceMethod();

	interface InnerInterfaceToPullIntoSuperInterface {
		int INNER_CONSTANT = 6;

		void innerInterfaceMethodToPullUp();
	}
}
