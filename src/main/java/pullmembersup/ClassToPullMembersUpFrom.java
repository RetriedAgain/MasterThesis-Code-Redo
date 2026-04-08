package pullmembersup;

public class ClassToPullMembersUpFrom extends SuperclassToPullMembersInto {

	int fieldToPullUp;
	int innerFieldToPullUp;

	public void methodToPullUp() {
		System.out.println("ClassToPullMembersUpFrom.methodToPullUp");
	}

	public static void staticMethodToPullUp() {
		System.out.println("ClassToPullMembersUpFrom.staticMethodToPullUp");
	}

	public void innerMethodToPullUp() {
		System.out.println("ClassToPullMembersUpFrom.innerMethodToPullUp");
	}


	public class InnerClassToPullMembersUpFrom extends ClassToPullMembersUpFrom {

		public static void innerStaticMethodToPullUp() {
			System.out.println("ClassToPullMembersUpFrom.innerStaticMethodToPullUp");
		}
	}
}
