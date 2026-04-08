package pullmembersup;

public class SuperclassToPullMembersInto {
	public static final int SUPERCLASS_CONSTANT = 99;

	public void superclassMethod() {
		System.out.println("SuperclassToPullMembersInto.superclassMethod()");
	}

	public class InnerClassToPullMembersUpFrom extends ClassToPullMembersUpFrom {
		int innerFieldToPullUp;

		public void innerMethodToPullUp() {
			System.out.println("ClassToPullMembersUpFrom.innerMethodToPullUp");
		}

		public static void innerStaticMethodToPullUp() {
			System.out.println("ClassToPullMembersUpFrom.innerStaticMethodToPullUp");
		}
	}
}
