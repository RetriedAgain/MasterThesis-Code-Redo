package pushmembersdown;

public class ClassToPushMembersDownFrom {

	int fieldToPushDown;

	public void methodToPushDown() {
		System.out.println("ClassToPushMembersDownFrom.methodToPushDown");
	}


	public class InnerClassToPushMembersDownFrom extends ClassToPushMembersDownFrom {
		int innerFieldToPushDown;

		public static void staticMethodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.staticMethodToPushDown");
		}

		public void innerMethodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.innerMethodToPushDown");
		}

		public static void innerStaticMethodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.innerStaticMethodToPushDown");
		}
	}
}
