package refactoringsasintentionactions;

import refactoringsasintentionactions.replaceconstructorwithbuilder.ClassWithConstructorToHide;

public class SecretBuilder {
	private int secret1 = 5;
	private String secret2 = "Test";
	private int[] secret3 = new int[]{3, 4};

	public SecretBuilder setter1(int secret1) {
		this.secret1 = secret1;
		return this;
	}

	public SecretBuilder setter2(String secret2) {
		this.secret2 = secret2;
		return this;
	}

	public SecretBuilder setter3(int... secret3) {
		this.secret3 = secret3;
		return this;
	}

	public ClassWithConstructorToHide createClassWithConstructorToHide() {
		return new ClassWithConstructorToHide(secret1, secret2, secret3);
	}
}
