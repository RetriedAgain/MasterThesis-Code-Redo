package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class Secret {
	private int a;
	private String b;
	private int[] varArgC;

	public Secret setA(int a) {
		this.a = a;
		return this;
	}

	public Secret setB(String b) {
		this.b = b;
		return this;
	}

	public Secret setVarArgC(int... varArgC) {
		this.varArgC = varArgC;
		return this;
	}

	public ClassWithConstructorToHide createClassWithConstructorToHide() {
		return new ClassWithConstructorToHide(a, b, varArgC);
	}
}
