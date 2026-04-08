package pullmembersup;

public class ClassToPullMembersUpFrom extends SuperclassToPullMembersInto {

	int fieldToPullUp;

	public void methodToPullUp() {
		System.out.println("ClassToPullMembersUpFrom.methodToPullUp");
	}

	public static void staticMethodToPullUp() {
		System.out.println("ClassToPullMembersUpFrom.staticMethodToPullUp");
	}


}
