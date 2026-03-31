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
		private final MakeClassStatic makeClassStatic;
		private MakeClassStatic outer;
		boolean field_bool_lower = true;

		public A(MakeClassStatic makeClassStatic, MakeClassStatic outer) {
			this.outer = outer;
			this.makeClassStatic = makeClassStatic;
		}

		// Uncomment this for an extra option
		A a = makeClassStatic.new A(outer);

		public void method_inner() {
			System.out.println("Test");
		}

	}
}
