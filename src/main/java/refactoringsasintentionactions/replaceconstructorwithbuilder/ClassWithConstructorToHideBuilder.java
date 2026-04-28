package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class ClassWithConstructorToHideBuilder {
	private int secret1;
	private String secret2;
	private int[] secret3;

	public ClassWithConstructorToHideBuilder setA(int secret1) {
		this.secret1 = secret1;
		return this;
	}

	public ClassWithConstructorToHideBuilder setB(String secret2) {
		this.secret2 = secret2;
		return this;
	}

	public ClassWithConstructorToHideBuilder setVarArgC(int... secret3) {
		this.secret3 = secret3;
		return this;
	}

	public ClassWithConstructorToHide createClassWithConstructorToHide() {
		return new ClassWithConstructorToHide(secret1, secret2, secret3);
	}
}
