package pullmembersup;

public class ClassToPullMembersUpFrom extends SuperclassToPullMembersInto {

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
