package pullmembersup;

public abstract class SuperclassToPullMembersInto {
	public static final int SUPERCLASS_CONSTANT = 99;
	int fieldToPullUp;

	public static void staticMethodToPullUp() {
		System.out.println("ClassToPullMembersUpFrom.staticMethodToPullUp");
	}

	public void superclassMethod() {
		System.out.println("SuperclassToPullMembersInto.superclassMethod()");
	}

	public abstract void methodToPullUp();

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
