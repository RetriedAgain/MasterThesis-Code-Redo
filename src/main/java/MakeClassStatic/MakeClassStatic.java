package MakeClassStatic;

public class MakeClassStatic {
	boolean field_bool_Upper = true;

	A a_upper;

	public MakeClassStatic() {
	}

	void method_upper() {
		a_upper.method_inner();
	}

	public static class A {
		private final MakeClassStatic secret;
		private MakeClassStatic outer;
		boolean field_bool_lower = true;

		public A(MakeClassStatic secret, MakeClassStatic outer) {
			this.outer = outer;
			this.secret = secret;
		}

		// Uncomment this for an extra option
		A a = secret.new A(outer);

		public void method_inner() {
			System.out.println("Test");
		}

	}
}
