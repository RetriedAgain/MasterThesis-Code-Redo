package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class UsageClass {
	public static void main(String[] args) {
		ClassWithConstructorToHide c = new ClassWithConstructorToHideBuilder().setA(5).setB("Test").setVarArgC(3, 4).createClassWithConstructorToHide();
		System.out.println(c);
	}
}
