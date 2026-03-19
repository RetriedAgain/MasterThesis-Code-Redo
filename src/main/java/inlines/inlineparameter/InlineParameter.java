package inlines.inlineparameter;

public class InlineParameter {

	// Uncomment this for special case
	// final static String CONSTANT = "CONSTANT_TO_INLINE";

	static void inlineHere() {
		System.out.println("CONSTANT");
	}

	static void usageHere() {
		// inlineHere(CONSTANT);
		inlineHere();
	}

	static void usageHere2() {
		// inlineHere(CONSTANT);
		inlineHere();
	}

}
