package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class ClassWithConstructorToHideBuilder {
	private int a = 99;
	private String b = "default!";
	private int[] varArgC = new int[]{1, 2};

	public ClassWithConstructorToHideBuilder setA(int a) {
		this.a = a;
		return this;
	}

	public ClassWithConstructorToHideBuilder setB(String b) {
		this.b = b;
		return this;
	}

	public ClassWithConstructorToHideBuilder setVarArgC(int... varArgC) {
		this.varArgC = varArgC;
		return this;
	}

	public ClassWithConstructorToHide createClassWithConstructorToHide() {
		return new ClassWithConstructorToHide(a, b, varArgC);
	}
}
