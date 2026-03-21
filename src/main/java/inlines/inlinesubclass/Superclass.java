package inlines.inlinesubclass;

public class Superclass {

	ClassToInline classToInline;
	public ClassToInline getClassToInline() {
		return classToInline;
	}

	ClassToInline classToInline2;
	public ClassToInline getClassToInline2() {
		return classToInline2;
	}

	// added a visible instance method so IDE can offer anonymous-class conversion / overrides
	public void greet() {
		System.out.println("Superclass greeting");
	}
}
