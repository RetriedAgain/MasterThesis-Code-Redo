package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class ClassWithConstructorToHide {

	int a;
	String b;
	int c;
	int d;

	ClassWithConstructorToHide(int a, String b, int ... varArgC) {
		this.a = a;
		this.b = b;
		this.c = varArgC[0];
		this.d = varArgC[1];
	}
}
