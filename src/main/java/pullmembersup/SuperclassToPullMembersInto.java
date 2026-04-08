package pullmembersup;

public class SuperclassToPullMembersInto {
	public static final int SUPERCLASS_CONSTANT = 99;
    int fieldToPullUp;

    public void superclassMethod() {
		System.out.println("SuperclassToPullMembersInto.superclassMethod()");
	}

    public void methodToPullUp() {
        System.out.println("ClassToPullMembersUpFrom.methodToPullUp");
    }
}
