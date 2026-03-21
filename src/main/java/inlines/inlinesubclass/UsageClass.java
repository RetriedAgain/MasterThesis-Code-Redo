package inlines.inlinesubclass;

public class UsageClass {
	ClassToInline classToInline;

	public static void main(String[] args) {
		// Inline with intention action
		ClassToInline a = new ClassToInline() { // Inline this reference with caret on ClassToInline
			@Override
			public void greet() {
				System.out.println("anonymous ClassToInline greeting");
			}
		};
		a.greet();

		// Second instantiation - left as-is
		ClassToInline b = new ClassToInline();
		b.greet();
	}

}
