package pullmembersup;

public abstract class SuperclassToPullMembersInto {
	public static final int SUPERCLASS_CONSTANT = 99;

	public void superclassMethod() {
		System.out.println("SuperclassToPullMembersInto.superclassMethod()");
	}

	public abstract void methodToPullUp();
}
