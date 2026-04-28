package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class UsageClass {
	public static void main(String[] args) {
		ClassWithConstructorToHide c = new ClassWithConstructorToHide(5, "Test", 3, 4);
		System.out.println(c);
	}
}
