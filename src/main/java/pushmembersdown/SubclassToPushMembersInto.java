package pushmembersdown;

public class SubclassToPushMembersInto extends ClassToPushMembersDownFrom {
	public static final int SUBCLASS_CONSTANT = 99;
	int fieldToPushDown;

	public static void staticMethodToPushDown() {
		System.out.println("ClassToPushMembersDownFrom.staticMethodToPushDown");
	}


	public void subclassMethod() {
		System.out.println("SubclassToPushMembersInto.subclassMethod()");
	}

	@Override
	public void methodToPushDown() {
		System.out.println("ClassToPushMembersDownFrom.methodToPushDown");
	}
}
