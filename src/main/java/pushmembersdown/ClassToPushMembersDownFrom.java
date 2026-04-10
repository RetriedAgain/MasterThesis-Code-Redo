package pushmembersdown;

public abstract class ClassToPushMembersDownFrom {

	int fieldToPushDown;

	public abstract void methodToPushDown();

	public static void staticMethodToPushDown() {
		System.out.println("ClassToPushMembersDownFrom.staticMethodToPushDown");
	}


	public class InnerClassToPushMembersDownFrom extends ClassToPushMembersDownFrom {
		int innerFieldToPushDown;

		public void innerMethodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.innerMethodToPushDown");
		}

		public static void innerStaticMethodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.innerStaticMethodToPushDown");
		}

		@Override
		public void methodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.methodToPushDown");
		}
	}
}
