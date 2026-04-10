package pushmembersdown;

public class ClassToPushMembersDownFrom {

	public static void staticMethodToPushDown() {
		System.out.println("ClassToPushMembersDownFrom.staticMethodToPushDown");
	}


	public class InnerClassToPushMembersDownFrom extends ClassToPushMembersDownFrom {
		int innerFieldToPushDown;
		int fieldToPushDown;

		public void innerMethodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.innerMethodToPushDown");
		}

		public static void innerStaticMethodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.innerStaticMethodToPushDown");
		}

		public void methodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.methodToPushDown");
		}
	}
}
