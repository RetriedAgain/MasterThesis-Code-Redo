package pushmembersdown;

public abstract class ClassToPushMembersDownFrom {

	public abstract void methodToPushDown();


	public class InnerClassToPushMembersDownFrom extends ClassToPushMembersDownFrom {
		int innerFieldToPushDown;
		int fieldToPushDown;

		public static void staticMethodToPushDown() {
			System.out.println("ClassToPushMembersDownFrom.staticMethodToPushDown");
		}

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
