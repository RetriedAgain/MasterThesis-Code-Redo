package makestatic.makeclassstatic;

public class MakeClassStatic {
	boolean field_bool_Upper = true;

	A a_upper = new A();

	void method_upper() {
		a_upper.method_inner();
	}

	public class A {
		boolean field_bool_lower = true;

		// Uncomment this for an extra option
//		A a = new A();

		public void method_inner() {
			System.out.println("Test");
		}

	}
}
