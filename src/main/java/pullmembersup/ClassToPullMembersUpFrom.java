package pullmembersup;

class ClassToPullMembersUpFrom extends SuperclassToPullMembersInto {

	int fieldToPullUp;

	public void methodToPullUp() {
		System.out.println("ClassToPullMembersUpFrom.methodToPullUp");
	}

	public static void staticMethodToPullUp() {
		System.out.println("ClassToPullMembersUpFrom.staticMethodToPullUp");
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
