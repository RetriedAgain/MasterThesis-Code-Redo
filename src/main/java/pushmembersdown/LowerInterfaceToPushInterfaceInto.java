package pushmembersdown;

public interface LowerInterfaceToPushInterfaceInto extends InterfaceToPushMembersDownFrom.InnerInterfaceToPushIntoLowerInterface {
	int LOWER_INTERFACE_CONSTANT = 0;
	int INNER_CONSTANT = 6;

	void lowerInterfaceMethod();

	void innerInterfaceMethodToPushDown();
}
