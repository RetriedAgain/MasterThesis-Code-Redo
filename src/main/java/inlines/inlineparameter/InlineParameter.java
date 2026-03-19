package inlines.inlineparameter;

public class InlineParameter {

	// Uncomment this for special case
	// final static String CONSTANT = "CONSTANT_TO_INLINE";

	static void inlineHere(String inlineThis) {
		System.out.println(inlineThis);
	}

	static void usageHere() {
		// inlineHere(CONSTANT);
		inlineHere("CONSTANT");
	}

	static void usageHere2() {
		// inlineHere(CONSTANT);
		inlineHere("CONSTANT");
	}

}
