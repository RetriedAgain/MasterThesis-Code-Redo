package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class UsageClass {
	public static void main(String[] args) {
		ClassWithConstructorToHide c = new ClassWithConstructorToHide(5, "Test");
		ClassWithConstructorToHide c2 = new ClassWithConstructorToHide(2, "Test2");

		System.out.println(c);
		System.out.println(c2);
	}
}
