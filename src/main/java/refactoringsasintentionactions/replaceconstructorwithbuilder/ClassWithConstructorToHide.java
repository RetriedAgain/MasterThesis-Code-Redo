package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class ClassWithConstructorToHide {

	int a;
	String b;


	ClassWithConstructorToHide(int a, String b) {
		this.a = a;
		this.b = b;
	}
}
