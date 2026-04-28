package refactoringsasintentionactions.replaceconstructorwithbuilder;

import refactoringsasintentionactions.SecretBuilder;

public class UsageClass {
	public static void main(String[] args) {
		ClassWithConstructorToHide c = new SecretBuilder().setter3(3, 4).createClassWithConstructorToHide();
		System.out.println(c);
	}
}
