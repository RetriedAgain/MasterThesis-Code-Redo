package MakeClassStatic;

public class MakeClassStatic {
	boolean field_bool_Upper = true;

	A a_upper;

	public MakeClassStatic() {
	}

	void method_upper() {
		a_upper.method_inner();
	}

	public class A {
		private MakeClassStatic outer;
		boolean field_bool_lower = true;

		public A(MakeClassStatic outer) {
			this.outer = outer;
		}

		// Uncomment this for an extra option
		A a = new A(outer);

		public void method_inner() {
			System.out.println("Test");
		}

	}
}
