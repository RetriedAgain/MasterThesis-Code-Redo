package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class ClassWithConstructorToHideBuilder {
	private int a;
	private String b;
	private int[] varArgC;

	public ClassWithConstructorToHideBuilder secret1(int a) {
		this.a = a;
		return this;
	}

	public ClassWithConstructorToHideBuilder secret2(String b) {
		this.b = b;
		return this;
	}

	public ClassWithConstructorToHideBuilder secret3(int... varArgC) {
		this.varArgC = varArgC;
		return this;
	}

	public ClassWithConstructorToHide createClassWithConstructorToHide() {
		return new ClassWithConstructorToHide(a, b, varArgC);
	}
}
