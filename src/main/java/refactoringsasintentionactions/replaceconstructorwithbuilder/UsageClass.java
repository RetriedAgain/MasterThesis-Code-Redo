package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class UsageClass {
	public static void main(String[] args) {
		ClassWithConstructorToHide c = new ClassWithConstructorToHideBuilder().createClassWithConstructorToHide();
		ClassWithConstructorToHide c2 = new ClassWithConstructorToHideBuilder().setA(2).setB("Test2").createClassWithConstructorToHide();

		System.out.println(c);
		System.out.println(c2);
	}
}
