package pullmembersup;

public class SuperclassToPullMembersInto {
	public static final int SUPERCLASS_CONSTANT = 99;

	public static void staticMethodToPullUp() {
		System.out.println("ClassToPullMembersUpFrom.staticMethodToPullUp");
	}

	public void superclassMethod() {
		System.out.println("SuperclassToPullMembersInto.superclassMethod()");
	}

}
