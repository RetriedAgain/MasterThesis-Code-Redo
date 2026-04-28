package refactoringsasintentionactions.replaceconstructorwithbuilder;

public class ClassWithConstructorToHideBuilder {
    private int a = 5;
    private String b = "Test";

    public ClassWithConstructorToHideBuilder setA(int a) {
        this.a = a;
        return this;
    }

    public ClassWithConstructorToHideBuilder setB(String b) {
        this.b = b;
        return this;
    }

    public ClassWithConstructorToHide createClassWithConstructorToHide() {
        return new ClassWithConstructorToHide(a, b);
    }
}
