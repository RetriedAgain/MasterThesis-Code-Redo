package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class ClassWithConstructorToHideBuilder {
	private int a;
	private String b;
	private int[] varArgC;

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
