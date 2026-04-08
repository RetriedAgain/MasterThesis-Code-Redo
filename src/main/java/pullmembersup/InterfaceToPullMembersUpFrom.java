package pullmembersup;

public interface InterfaceToPullMembersUpFrom extends SuperInterfaceToPullInterfaceInto {

	interface InnerInterfaceToPullIntoSuperInterface {
		int INNER_CONSTANT = 6;

		void innerInterfaceMethodToPullUp();
	}
}

