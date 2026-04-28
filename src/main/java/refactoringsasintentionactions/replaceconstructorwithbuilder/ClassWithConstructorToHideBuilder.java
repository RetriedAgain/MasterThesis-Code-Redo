package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class ClassWithConstructorToHideBuilder {
	private int a;

	public ClassWithConstructorToHideBuilder setA(int a) {
		this.a = a;
		return this;
	}

	public ClassWithConstructorToHide createClassWithConstructorToHide() {
		return new ClassWithConstructorToHide(a);
	}
}
