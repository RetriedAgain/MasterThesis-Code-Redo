package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class UsageClass {
	public static void main(String[] args) {
		ClassWithConstructorToHide c = new ClassWithConstructorToHideBuilder().secret1(5).secret2("Test").secret3(3, 4).createClassWithConstructorToHide();
		System.out.println(c);
	}
}
