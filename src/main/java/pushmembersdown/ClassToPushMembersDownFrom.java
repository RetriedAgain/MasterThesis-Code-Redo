package pushmembersdown;

public class ClassToPushMembersDownFrom {

	int fieldToPushDown;

	public void methodToPushDown() {
		System.out.println("ClassToPushMembersDownFrom.methodToPushDown");
	}

	public static void staticMethodToPushDown() {
		System.out.println("ClassToPushMembersDownFrom.staticMethodToPushDown");
	}


	public class InnerClassToPushMembersDownFrom extends ClassToPushMembersDownFrom {

		public static void innerStaticMethodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.innerStaticMethodToPushDown");
		}
	}
}
